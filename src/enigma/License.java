/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

/**
 *
 * @author Abhishek Balam
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import enigma.CenterFrame;
import enigma.sure;
import java.io.File;

public class License extends JFrame{
    
    private JButton accept;
    private JButton decline;
    int confirm;
    
    public License(){
    super("License Agreement");
    super.setBounds(0,0,800, 600);
    super.setLocationRelativeTo(null);
    super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    super.getContentPane().setBackground(Color.BLACK);
    super.setResizable(false);
    
      try{
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
      catch(Exception e){
          throw new RuntimeException(e);
      }
      
    
    accept = new JButton("ACCEPT");
    decline = new JButton("DECLINE");
    
    accept.setBackground(new java.awt.Color(51, 51, 51));
    accept.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
    accept.setForeground(Color.CYAN);
    accept.setBackground(java.awt.Color.BLACK);
   // accept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
    
    accept.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.CYAN, 2), 
        BorderFactory.createEmptyBorder(6, 6, 6,6)));
    
    accept.setContentAreaFilled(false);
    accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    accept.setSize(120, 40);
    accept.setIconTextGap(6);
    accept.setMargin(new Insets(5,5,10,10));
    accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acceptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acceptMouseExited(evt);
            }
        });
    
    decline.setBackground(new java.awt.Color(51, 51, 51));
    decline.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
    decline.setForeground(Color.CYAN);
    decline.setBackground(java.awt.Color.BLACK);
   // decline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
    
    decline.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.CYAN, 1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
    
    decline.setContentAreaFilled(false);
    decline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    decline.setSize(120, 40);
    decline.setIconTextGap(6);
    decline.setMargin(new Insets(5,5,10,10));
    decline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                declineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                declineMouseExited(evt);
            }
        });
    
    JPanel panel= new JPanel();
    panel.setBackground(Color.BLACK);
    panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
    panel.add(Box.createGlue());
    panel.add(accept);
    panel.add(Box.createRigidArea(new Dimension(30,50)));
    panel.add(decline);
    panel.add(Box.createGlue());
    accept.addActionListener(new ButtonListener());
    decline.addActionListener(new ButtonListener());
    
    decline.setToolTipText("Exit the program.");
    accept.setToolTipText("Select The File To Encrypt.");
    
    JTextArea textArea = new JTextArea("TESTdfsfsdfsfsfs\ndfsfsdfsfd\nsdfsfsf\nsdfsf\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\ngdjvtdvznvhcjvdsczygzn\n\n\n\n\n\n\n\n\n\n\n\n");
    textArea.setLineWrap(true);
    textArea.setEditable(false);
    textArea.setVisible(true);

    JScrollPane scroll = new JScrollPane (textArea);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
    
    
    super.add(scroll,BorderLayout.CENTER);
    super.add(panel,BorderLayout.SOUTH);
    
    super.setVisible(true);
     };
    
        private void acceptMouseEntered(java.awt.event.MouseEvent evt) {                                      
    
        accept .setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.CYAN, 2), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
      //  accept.setForeground(java.awt.Color.cyan);
        accept.setFont(new java.awt.Font("Verdana", 1, 19));
    
    }                                     

    private void acceptMouseExited(java.awt.event.MouseEvent evt) {                                     
        
        accept .setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204),1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        //accept.setForeground(new Color(0,204,204));
        accept.setFont(new java.awt.Font("Verdana", 1, 18));
    
    } 
        private void declineMouseEntered(java.awt.event.MouseEvent evt) {                                      
        
        decline.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.CYAN, 2), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        //decline.setForeground(java.awt.Color.cyan);
        decline.setFont(new java.awt.Font("Verdana", 1, 19));
      
    }                                     

    private void declineMouseExited(java.awt.event.MouseEvent evt) {                                     
    
        decline.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204), 1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
       // decline.setForeground(new Color(0,204,204));
        decline.setFont(new java.awt.Font("Verdana", 1, 18));
   
    } 
    private class ButtonListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
           if(e.getSource()==accept){
            dispose();
            Select.main(null);
           }
           if(e.getSource()==decline){
            sure.main(null);
           }
       }
   }
}

