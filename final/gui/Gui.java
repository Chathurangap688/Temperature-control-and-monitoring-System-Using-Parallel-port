/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Thread.sleep;


public class Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        mainFrame frame = new mainFrame();
        frame.gui();
        State state = new State();
        Server server = new Server();
        server.start();
        while(true){
            state.update();
            state.stateRefresh();
            sleep(100);
        }
    }
    
}
