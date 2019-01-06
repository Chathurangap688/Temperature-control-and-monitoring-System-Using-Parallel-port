import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Gui {
    public int k = 0;
    public static int temp = 25;
    public String s = "enter s";
    public String msg = "start msg";

    public void myGui() throws InterruptedException, UnknownHostException, IOException {
        JFrame frame = new JFrame();
        frame.setSize(240, 240);
        frame.setTitle("title");
        JPanel panel = new JPanel(new FlowLayout());
        JButton buttonUp = new JButton("+");
        JButton buttonDown = new JButton("-");
        buttonUp.setPreferredSize(new Dimension(100, 50));
        buttonDown.setPreferredSize(new Dimension(100, 50));
        JLabel display = new JLabel("currunt Time ");
        JLabel display2 = new JLabel(msg);
        display.setFont(new Font("Serif", Font.PLAIN, 14));
        display2.setFont(new Font("Serif", Font.PLAIN, 30));
        JLabel currentTemp = new JLabel("to be temp ");
        JLabel currentTemp2 = new JLabel("" + temp + " C");
        currentTemp.setFont(new Font("Serif", Font.PLAIN, 14));
        currentTemp2.setFont(new Font("Serif", Font.PLAIN, 30));
        panel.add(display);
        panel.add(display2);
        panel.add(buttonUp);
        panel.add(buttonDown);
        panel.add(currentTemp);
        panel.add(currentTemp2);
        frame.add(panel);
        frame.setVisible(true);
        Server server = new Server();
        System.out.println("start gui");
        buttonDown.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                temp--;

                currentTemp2.setText(Integer.toString(temp) + " C");

            }
        });
        buttonUp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                temp = temp + 1;

                currentTemp2.setText(Integer.toString(temp) + " C");

            }
        });
        while (true) {
            System.out.println("loop gui");
            Thread.sleep(500);
            msg = server.inputData();
            display2.setText(msg + " C");

        }

        /*
         * 
         * button.addActionListener(new ActionListener() {
         * 
         * @Override public void actionPerformed(ActionEvent e) { k = k + 1; try { s =
         * server.send(); } catch (UnknownHostException e1) { // TODO Auto-generated * *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * catch block
         * * * * * * * * * * * e1.printStackTrace(); * * * * }catch * * * * * *
         * (IOException * * * * e1) * * * * {// * * * * * * * * * TODO * * * * Auto * *
         * - * * * * * * * * * * generated * * * * * * * catch * * * block * * * * * * *
         * * e1.printStackTrace(); * } * * * * * * * * * * * * * * * * * * * * * * * * *
         * * * * * * * * * * * * * * * display.setText("currunt Temparater  " * + * *
         * s); s * = * * * * * * * * * * * * input.getText(); * * * * * * * * * * * * *
         * * * * * * * * * * * * * * * * * * * System.out.println(s); * * }});
         */
    }

    public int getTemp() {
        return this.temp;
    }
}