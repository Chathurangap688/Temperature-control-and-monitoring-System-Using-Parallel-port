import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.io.PrintWriter; 
import java.net.Socket; 
import java.net.UnknownHostException; 

import javax.swing.JFrame; 
import javax.swing.JOptionPane; 
import javax.swing.JScrollPane; 
import javax.swing.JTextArea; 

class Server {

    public String inputData()throws UnknownHostException, IOException {
        Gui gui = new Gui(); 
        Socket socket = new Socket("localhost", 9981); 
        var in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
        var out = new PrintWriter(socket.getOutputStream(), true); 
        String line = in.readLine(); 

        out.println(gui.getTemp()); // get temp from derver
System.out.println(gui.getTemp()); 
        return line; 

    }

}