/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
* Chathuranga Proyadarshana
*/

import static gui.State.outs;
import java.awt.Frame;
import sun.misc.Signal;


public class State {
    public static int current_state = 0;
    // current state = 0 -> Automatic mode
    // current state = 1 -> All on
    // current state = 2 -> All off
    //mainFrame frame1 = new mainFrame();
    public static int[][][] controll = {{{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}},
                                         {{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}},
                                         {{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}},
                                         {{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}},
                                         {{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}},
                                         {{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}},
                                         {{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}},
                                         {{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255},{0,255,255,255}}};
    
     
    
    public static boolean outs[] = {false,false,false,false,false,false,false,false};
    public static int ins[] = {0,0,0,0,0,0,0,0};
    public static int[] get_outs(){
        int data[] = new int[8];
        for(int i=0;i<8;i++){
            if(outs[i]){
                data[i] = 1;
            }else
                data[i] = 0;
        }
        return data;
    }

    static void set_channels(int value1, int value2) {
        //To change body of generated methods, choose Tools | Templates.
        if(value2<8)
            ins[value2] = value1;
    }
    public void setState(int channel,boolean state){
        ins[channel-1]++;
        State.outs[channel-1] = state;
    }
    public boolean getState(int channel){
        
        return State.outs[channel-1];
    }
    public String getInputs(int chennel){
        Integer temp = ins[chennel - 1];
        String re = temp.toString();
        return re;//[255,255,51]
    }
    public static void update(){
        
        mainFrame.updateInputs();
    }
    public static boolean stateRturn1(int in,int off_from,int off_to,int on_from,int on_to){
        if((off_to > in)&&(in > off_from)){
            return false;
        }else
            return true;
    
    }
     public static boolean stateRturn2(int in,int off_from,int off_to,int on_from,int on_to){
        if((on_to > in)&&(in > on_from)){
            return true;
        }else
            return false;
    
    }
    public static void stateRefresh(){
        
        if(current_state==0){
            for(int i=0;i<8;i++){
                boolean state = true;
                for(int j=0;j<8;j++){
                        state = state && (stateRturn1(ins[j], controll[i][j][0], controll[i][j][1], controll[i][j][2], controll[i][j][3]));
                        //state = state || (stateRturn2(ins[j], controll[i][j][0], controll[i][j][1], controll[i][j][2], controll[i][j][3]));
                    }
                   for(int j=0;j<8;j++){
                        //state = state && (stateRturn1(ins[j], controll[i][j][0], controll[i][j][1], controll[i][j][2], controll[i][j][3]));
                        state = state || (stateRturn2(ins[j], controll[i][j][0], controll[i][j][1], controll[i][j][2], controll[i][j][3]));
                    }
                outs[i] = state;
            }
        }else if(current_state == 1){
            for(int i =0; i<8;i++){
                outs[i] = true;
            }
        }else if(current_state == 2){
            for(int i =0; i<8;i++){
                outs[i] = false;
            }
        }
    }
    public static void set_current_state(int s){
        current_state = s;
    }
}
