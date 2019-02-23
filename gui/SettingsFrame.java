/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author CHATHURANGA
 */
public class SettingsFrame extends javax.swing.JFrame {

    /**
     * Creates new form SettingsFrame
     */
    public  int channelNo = 0;
    public  int out_pin;
    public  int off_from;
    public  int off_to;
    public  int on_from;
    public  int on_to;
    JFrame mainframe;
    public SettingsFrame(int out,JFrame main) {
        out_pin = out-1;
        mainframe = main;
        initComponents();
        jLabel9.setText(Integer.toString(offFrom.getValue()));
        jLabel10.setText(Integer.toString(offTo.getValue()));
        jLabel11.setText(Integer.toString(onFrom.getValue()));
        jLabel12.setText(Integer.toString(onTo.getValue()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        setting_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        offFrom = new javax.swing.JSlider(0,256,32);
        OkB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        offTo = new javax.swing.JSlider(0,255,128);
        onTo = new javax.swing.JSlider(0,255,255);
        onFrom = new javax.swing.JSlider(0,255,128);
        jPanel2 = new javax.swing.JPanel();
        channel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);

        setting_title.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(getTitle());

        javax.swing.GroupLayout setting_titleLayout = new javax.swing.GroupLayout(setting_title);
        setting_title.setLayout(setting_titleLayout);
        setting_titleLayout.setHorizontalGroup(
            setting_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_titleLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setting_titleLayout.setVerticalGroup(
            setting_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        offFrom.setMaximum(256);
        offFrom.setToolTipText("");
        offFrom.setValue(0);
        offFrom.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                offFromAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        offFrom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                offFromStateChanged(evt);
            }
        });
        offFrom.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                offFromMouseMoved(evt);
            }
        });
        offFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offFromMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offFromMouseExited(evt);
            }
        });
        offFrom.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                offFromCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        OkB.setText("Ok");
        OkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBActionPerformed(evt);
            }
        });

        cancelB.setText("Cancel");
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        offTo.setMaximum(256);
        offTo.setValue(128);
        offTo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                offToStateChanged(evt);
            }
        });
        offTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offToMouseEntered(evt);
            }
        });

        onTo.setMaximum(256);
        onTo.setValue(255);
        onTo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onToStateChanged(evt);
            }
        });

        onFrom.setMaximum(255);
        onFrom.setValue(128);
        onFrom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onFromStateChanged(evt);
            }
        });
        onFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onFromMouseEntered(evt);
            }
        });

        channel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chennel 1", "Chennel 2", "Chennel 3", "Chennel 4", "Chennel 5", "Chennel 6", "Chennel 7", "Chennel 8" }));
        channel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                channelActionPerformed(evt);
            }
        });

        jLabel4.setText("select input chennel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(channel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(channel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setText("Set");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("from..");

        jLabel3.setText("to..");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("OFF");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ON");

        jLabel7.setText("from..");

        jLabel8.setText("to..");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText(Integer.toString(off_from));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText(Integer.toString(off_to));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText(Integer.toString(on_from));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText(Integer.toString(on_to));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OkB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(offFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(offFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        offFrom.setMajorTickSpacing(64);
        offFrom.setMinorTickSpacing(8);
        offFrom.setPaintTicks(true);
        offFrom.setPaintLabels(true);
        Hashtable position1 = new Hashtable();
        position1.put(0, new JLabel("0"));
        position1.put(64, new JLabel("64"));
        position1.put(128, new JLabel("128"));
        position1.put(192, new JLabel("192"));
        position1.put(256, new JLabel("255"));
        offFrom.setLabelTable(position1);
        off_from = offFrom.getValue();
        jLabel9.setText(Integer.toString(off_from));
        offTo.setMajorTickSpacing(25);
        offTo.setMinorTickSpacing(10);
        offTo.setPaintTicks(true);
        offTo.setPaintLabels(true);
        Hashtable position2 = new Hashtable();
        position2.put(0, new JLabel("0"));
        position2.put(64, new JLabel("64"));
        position2.put(128, new JLabel("128"));
        position2.put(192, new JLabel("192"));
        position2.put(255, new JLabel("255"));
        offTo.setLabelTable(position2);
        off_to = offFrom.getValue();
        jLabel10.setText(Integer.toString(off_to));
        onTo.setMajorTickSpacing(25);
        onTo.setMinorTickSpacing(10);
        onTo.setPaintTicks(true);
        onTo.setPaintLabels(true);
        Hashtable position3 = new Hashtable();
        position3.put(0, new JLabel("0"));
        position3.put(64, new JLabel("64"));
        position3.put(128, new JLabel("128"));
        position3.put(192, new JLabel("192"));
        position3.put(255, new JLabel("255"));
        onTo.setLabelTable(position3);
        on_to = onTo.getValue();
        jLabel12.setText(Integer.toString(on_to));
        onFrom.setMajorTickSpacing(25);
        onFrom.setMinorTickSpacing(10);
        onFrom.setPaintTicks(true);
        onFrom.setPaintLabels(true);
        Hashtable position4 = new Hashtable();
        position4.put(0, new JLabel("0"));
        position4.put(64, new JLabel("64"));
        position4.put(128, new JLabel("128"));
        position4.put(192, new JLabel("192"));
        position4.put(255, new JLabel("255"));
        onFrom.setLabelTable(position4);
        on_from = offFrom.getValue();
        jLabel11.setText(Integer.toString(on_from));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setting_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(setting_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBActionPerformed
        // TODO add your handling code here:
        this.dispose();
        mainframe.setEnabled(true);
        mainframe.setVisible(true);
        //System.out.println();
    }//GEN-LAST:event_OkBActionPerformed

    private void channelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_channelActionPerformed
        // TODO add your handling code here:

        channelNo = channel.getSelectedIndex();
        
    }//GEN-LAST:event_channelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(out_pin+" "+channelNo+" "+off_from+" "+off_to+" "+on_from+" "+on_to);
        State.controll[out_pin][channelNo][0] =  off_from;
        State.controll[out_pin][channelNo][1] =  off_to;
        State.controll[out_pin][channelNo][2] =  on_from;
        State.controll[out_pin][channelNo][3] =  on_to;
        System.out.println(State.controll[out_pin][channelNo][0]);
        System.out.println(State.controll[out_pin][channelNo][1]);
        System.out.println(State.controll[out_pin][channelNo][2]);
        System.out.println(State.controll[out_pin][channelNo][3]);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void offFromStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_offFromStateChanged
            // TODO add your handling code here:
                    off_from = offFrom.getValue();
        jLabel9.setText(Integer.toString(offFrom.getValue()));
       
    }//GEN-LAST:event_offFromStateChanged

    private void offFromCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_offFromCaretPositionChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_offFromCaretPositionChanged

    private void offFromAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_offFromAncestorMoved
        // TODO add your handling code here:
        off_from = offFrom.getValue();
        jLabel9.setText(Integer.toString(offFrom.getValue()));
       
    }//GEN-LAST:event_offFromAncestorMoved

    private void offFromMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offFromMouseExited
        // TODO add your handling code here:
        off_from = offFrom.getValue();
        jLabel9.setText(Integer.toString(offFrom.getValue()));
    }//GEN-LAST:event_offFromMouseExited

    private void offFromMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offFromMouseMoved
        // TODO add your handling code here:
        off_from = offFrom.getValue();
        jLabel9.setText(Integer.toString(offFrom.getValue()));
    }//GEN-LAST:event_offFromMouseMoved

    private void offFromMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offFromMouseEntered
        // TODO add your handling code here:
        off_from = offFrom.getValue();
        jLabel9.setText(Integer.toString(offFrom.getValue()));
    }//GEN-LAST:event_offFromMouseEntered

    private void offToMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offToMouseEntered
        // TODO add your handling code here:
        off_to = offTo.getValue();
        jLabel10.setText(Integer.toString(offTo.getValue()));
    }//GEN-LAST:event_offToMouseEntered

    private void onFromMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onFromMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_onFromMouseEntered

    private void onFromStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onFromStateChanged
        // TODO add your handling code here:
        on_from = onFrom.getValue();
        jLabel11.setText(Integer.toString(onFrom.getValue()));
    }//GEN-LAST:event_onFromStateChanged

    private void offToStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_offToStateChanged
        // TODO add your handling code here:
        off_to = offTo.getValue();
        jLabel10.setText(Integer.toString(offTo.getValue()));
    }//GEN-LAST:event_offToStateChanged

    private void onToStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onToStateChanged
        // TODO add your handling code here:
        on_to = onTo.getValue();
        jLabel12.setText(Integer.toString(onTo.getValue()));
    }//GEN-LAST:event_onToStateChanged

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        // TODO add your handling code here:
        this.dispose();
        mainframe.setEnabled(true);
        mainframe.setVisible(true);
    }//GEN-LAST:event_cancelBActionPerformed

    /**
     * @param args the command line arguments
     */

public static void setting(int out,JFrame mainframe){
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame(out,mainframe).setVisible(true);
            }
        });
}

public String getTitle(){
    return "OUTPUT LINE "+(out_pin +1) +" controling";
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OkB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JButton cancelB;
    private javax.swing.JComboBox<String> channel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider offFrom;
    private javax.swing.JSlider offTo;
    private javax.swing.JSlider onFrom;
    private javax.swing.JSlider onTo;
    private javax.swing.JPanel setting_title;
    // End of variables declaration//GEN-END:variables
}
