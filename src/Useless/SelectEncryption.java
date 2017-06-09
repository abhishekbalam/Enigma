/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useless;

/**
 *
 * @author Abhishek Balam
 */

import Useless.CardPanel;
import enigma.AtbashUI;
import enigma.CaesarUI;
import enigma.VigenereUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.lang.*;


public class SelectEncryption extends JFrame implements ItemListener,MouseWheelListener{
   public String[] types ={ "Ceasar Cipher", "Vigenere Cipher","Atbash Cipher" };
   public JPanel cards;
   public JComboBox cb;
   public JButton b1= new JButton("Know More");
   public JButton b2= new JButton("Know More");;
   public JButton b3= new JButton("Know More");;
   public File txt;
   public int choice;
   private static int i=0;
   
   SelectEncryption(File text,int Choice){
       super("Select Encryption Method");
       super.setBounds(0,0,800,600);
       super.setLocationRelativeTo(null);
       super.setDefaultCloseOperation(EXIT_ON_CLOSE);
       super.setResizable(true);
       super.getContentPane().setBackground(Color.BLACK);
       
       choice=Choice;
       
       txt = text;
      
       JLabel j= new JLabel("You have Chosen to Open : "+txt.getAbsolutePath());
       j.setForeground(Color.cyan);
       
       JPanel panel0= new JPanel();
       panel0.add(j);
       panel0.setBackground(Color.black);
       
       CardPanel panel1= new CardPanel("Ceasar Cipher","<html><h1>Julius Ceasar,</h1>In his personal correspondence used a simple<br>encryption method to keep his conversations private.<br>This came to be known by his name.</html>",b1);
       CardPanel panel2= new CardPanel("Vigenere Cipher","<html>A 16th century French diplomat,<b><i>Blaise de Vigenere</i></b>, created a very simple cipher<br> that is moderately difficult for any unintended parties to decipher.<br> It is somewhat like a variable Caesar cipher, but the N changed with every letter.<br> You would \"encode\" your message with a passphrase, and the letters of your <br>passphrase would determine how each letter in the message would be encrypted.",b2);
       CardPanel panel3= new CardPanel("THIRD METHOD","hsghdasdagsgda",b3);
        
       b1.addActionListener(new ButtonListener());
       b2.addActionListener(new ButtonListener());
       b3.addActionListener(new ButtonListener());
       
       b1.setBackground(new java.awt.Color(51, 51, 51));
       b1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
       b1.setBackground(java.awt.Color.BLACK);
       b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
       b1.setContentAreaFilled(false);
       b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       b1.setSize(500, 60);
       b1.setForeground(Color.CYAN);
    
       b2.setBackground(new java.awt.Color(51, 51, 51));
       b2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
       b2.setBackground(java.awt.Color.BLACK);
       b2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
       b2.setContentAreaFilled(false);
       b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       b2.setSize(500, 60);
       b2.setForeground(Color.CYAN);
    
       b3.setBackground(new java.awt.Color(51, 51, 51));
       b3.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
       b3.setBackground(java.awt.Color.BLACK);
       b3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
       b3.setContentAreaFilled(false);
       b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       b3.setSize(500, 60);
       b3.setForeground(Color.CYAN);
    
       cards = new JPanel(new CardLayout());
       cards.add(panel1,"Ceasar Cipher");
       cards.add(panel2,"Vigenere Cipher");
       cards.add(panel3,"Atbash Cipher");
       
       cb = new JComboBox(types);
       cb.setEditable(false);
       cb.addItemListener(this);
       cb.setSelectedIndex(0);
       super.addMouseWheelListener(this);
       
       super.add(cb, BorderLayout.NORTH);
       super.add(cards, BorderLayout.CENTER);
       super.add(panel0,BorderLayout.SOUTH);
       super.setVisible(true);
    }
   
   SelectEncryption(int Choice){
       super("Select Encryption Method");
       super.setBounds(0,0,800,600);
       super.setLocationRelativeTo(null);
       super.setDefaultCloseOperation(EXIT_ON_CLOSE);
       super.setResizable(true);
       super.getContentPane().setBackground(Color.BLACK);
       
       choice=Choice;
       
         
       CardPanel panel1= new CardPanel("Ceasar Cipher","<html><b><i>Julius Ceasar</i></b>,In his personal correspondence used a simple<br>encryption method to keep his conversations private.<br>This came to be known by his name.</html>",b1);
       CardPanel panel2= new CardPanel("Vigenere Cipher","<html>A 16th century French diplomat,<b><i>Blaise de Vigenere</i></b>, created a very simple cipher<br> that is moderately difficult for any unintended parties to decipher.<br> It is somewhat like a variable Caesar cipher, but the N changed with every letter.<br> You would \"encode\" your message with a passphrase, and the letters of your <br>passphrase would determine how each letter in the message would be encrypted.",b2);
       CardPanel panel3= new CardPanel("THIRD METHOD","hsghdasdagsgda",b3);
       
       b1.setBackground(new java.awt.Color(51, 51, 51));
       b1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
       b1.setForeground(Color.CYAN);
       b1.setBackground(java.awt.Color.BLACK);
       b1.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.CYAN, 2), 
        BorderFactory.createEmptyBorder(6, 6, 6,6)));
       b1.setContentAreaFilled(false);
       b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       b1.setSize(120, 40);
       b1.setIconTextGap(6);
       b1.setMargin(new Insets(5,5,10,10));
       b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
       b1.addActionListener(new ButtonListener());
    
    b2.setBackground(new java.awt.Color(51, 51, 51));
    b2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
    b2.setForeground(Color.CYAN);
    b2.setBackground(java.awt.Color.BLACK);
    b2.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.CYAN, 1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
    
    b2.setContentAreaFilled(false);
    b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    b2.setSize(120, 40);
    b2.setIconTextGap(6);
    b2.setMargin(new Insets(5,5,10,10));
    b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
    b2.addActionListener(new ButtonListener());
    
    b3.setBackground(new java.awt.Color(51, 51, 51));
    b3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
    b3.setForeground(Color.CYAN);
    b3.setBackground(java.awt.Color.BLACK);
    b3.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.CYAN, 1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
    
    b3.setContentAreaFilled(false);
    b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    b3.setSize(120, 40);
    b3.setIconTextGap(6);
    b3.setMargin(new Insets(5,5,10,10));
    b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
    b3.addActionListener(new ButtonListener());
          
       cards = new JPanel(new CardLayout());
       cards.add(panel1,"Ceasar Cipher");
       cards.add(panel2,"Vigenere Cipher");
       cards.add(panel3,"Atbash Cipher");
       
       cb = new JComboBox(types);
       cb.setEditable(false);
       cb.addItemListener(this);
       cb.setSelectedIndex(0);
       cb.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
       
       super.addMouseWheelListener(this);
       super.add(cb, BorderLayout.NORTH);
       super.add(cards, BorderLayout.CENTER);
       super.setVisible(true);
    }
          
   private void MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if(evt.getSource()==b1){
        b1.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204), 2), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        }
        if(evt.getSource()==b2){
        b2.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204), 2), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        }
        if(evt.getSource()==b3){
        b3.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204), 2), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        }
   
    }                                     

    private void MouseExited(java.awt.event.MouseEvent evt) {                                     
        if(evt.getSource()==b1){
        b1.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204), 1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        }
        if(evt.getSource()==b2){
        b2.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204), 1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        }
        if(evt.getSource()==b3){
        b3.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(0,204,204), 1), 
        BorderFactory.createEmptyBorder(6, 6, 6, 6)));
        }
   
   
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    public void mouseWheelMoved(MouseWheelEvent e){
        int notches = e.getWheelRotation();
        
        i+=notches;
        
        if(i<=-1){
            i=0;
            cb.setSelectedIndex(0);
        }
        else if(i>=(cb.getItemCount())){
            i=cb.getItemCount()-1;
            cb.setSelectedIndex(i);
        }
        else {
            cb.setSelectedIndex(i);
        }
       
    } 
    
    private class ButtonListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
           
           if(e.getSource()==b1){
                    if(choice==1){
                                dispose();
                                JFrame l= new EncryptMethod("Ceasar's Cipher",txt,"In this method each alphabet",choice);
                                CaesarUI j= new CaesarUI();
                                
                                }
                    
                    else if (choice ==3){
                                dispose();
                                CaesarUI j= new CaesarUI();
                                }
                    
                    else{
                                dispose();
                                JFrame l=new EncryptMethod("Ceasar's Cipher","In this method each alphabet",choice);
                                  }
                    
               }
           
           if(e.getSource()==b2){
                if(choice==1){
                                dispose();
                                 JFrame l= new EncryptMethod("Ceasar's Cipher",txt,"In this method each alphabet",choice);
                                }
                    
                    else if (choice ==3){
                                dispose();
                                VigenereUI v= new VigenereUI();
                                }
                    
                    else{
                                dispose();
                                JFrame l=new EncryptMethod("Ceasar's Cipher","In this method each alphabet",choice);
                                  }
               
           }
           
           
           if(e.getSource()==b3){
                if(choice==1){
                                dispose();
                                 JFrame l= new EncryptMethod("Ceasar's Cipher",txt,"In this method each alphabet",choice);
                                }
                    
                    else if (choice ==3){
                                //CaesarUI j= new CaesarUI(choice);
                                dispose();
                                AtbashUI a= new AtbashUI();
                                }
                    
                    else{
                                dispose();
                                JFrame l=new EncryptMethod("Ceasar's Cipher","In this method each alphabet",choice);
                                  }
               
           }
       }
   }
}
