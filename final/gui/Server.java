/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server extends Thread{
//public String inputData()throws UnknownHostException, IOException {
//        Gui gui = new Gui(); 
//        Socket socket = new Socket("localhost", 9981); 
//        var in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
//        var out = new PrintWriter(socket.getOutputStream(), true); 
//        String line = in.readLine(); 
//
//        out.println(gui.getTemp()); // get temp from derver
//		System.out.println(gui.getTemp()); 
//        return line; 
//
//    }
public void run(){  
    PrintWriter out;
    BufferedReader in;
    String array[] = new String[8];
        System.out.println("thread is running..."); 
    String a="";
    try {
        
        Socket socket = new Socket("localhost", 9986);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
        out = new PrintWriter(socket.getOutputStream(), true); 
        String line;
        int value1,value2;
        while (true) {    
            a="";
            int[] _outs = gui.State.get_outs();
            a=a+_outs[0]+_outs[1]+_outs[2]+_outs[3]+_outs[4]+_outs[5]+_outs[6]+_outs[7];
            System.out.println(a);
            out.println(a); //send to python server
            a = in.readLine(); //read from python server
            value1 = Integer.valueOf(a); 
            
            a = in.readLine(); //read from python server
            value2 = Integer.valueOf(a);
//             for(int i=0;i<8;i++){
                 sleep(200);
                gui.State.set_channels(value1,value2);
//             }
       
            
            
           
           
        }
    } catch (IOException ex) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InterruptedException ex) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    }
     

   
    
}  
 
}
