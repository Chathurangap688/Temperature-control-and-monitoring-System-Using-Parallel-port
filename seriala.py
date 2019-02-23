
import socket
import serial
import binascii
HOST = '127.0.0.1'  # Standard loopback interface address (localhost)
PORT = 9986        # Port to listen on (non-privileged ports are > 1023)



tcpsocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
tcpsocket.bind( ("127.0.0.1", 9986) ) #open local socket same port number in java application

tcpsocket.listen(2)
(client, (ip,port) ) = tcpsocket.accept()
val = 0
point = 0
se = serial.Serial('COM11',timeout=0.5)  # open COM port
v = [0,0,0,0,0,0,0,0]
while(True):
    data = client.recv(1024)   #(send by java app)   output like b'00001111'b'\r\n' 
    # hence remove last 2 element 
    data = data[:-1]
    data = data[:-1]
    temp = str(data, 'utf-8') # convert byte to str
    x = chr(int(temp,2)) #convert binary and then char  (a='01100010)
    se.write(bytes(x, encoding='utf-8')) # send to pik as 8bit char
    _point = se.read()  # send by pic -this is channel number
    _val = se.read() # send by pic- this is value of analog channel, value range 0-255


    #if reciving data form pic is not null cocnvert its to int
    if((len(_point)>0) & (len(_val)>0)):
        point = ord(_point) 
        val =ord(_val)
        v[point] = val # save array to testing  terminal
        print(v) 
    # send value and chennel number to java app -sending format b'345'b'\r\n'
    client.send(str(val).encode('utf8')+b'\r\n')  
    client.send(str(point).encode('utf8')+b'\r\n')