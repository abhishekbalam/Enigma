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
import Useless.SelectEncryption;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.event.*;
import java.awt.color.*;
import java.awt.*;

public class EncryptMethod extends JFrame {
    public JButton back=new JButton("Back");
    public JButton b = new JButton ("Something");
    public File text;
    public int choice;
    
EncryptMethod(String title,File txt,String desc,int Choice){
       super(title);
       super.setBounds(0,0,800,600);
       super.setLocationRelativeTo(null);
       super.setDefaultCloseOperation(EXIT_ON_CLOSE);
       super.setResizable(true);
       super.getContentPane().setBackground(Color.BLACK);
       
       choice= Choice;
       text= txt;
       
         try{
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
      catch(Exception e){
          throw new RuntimeException(e);
      }
         
       JLabel j= new JLabel("You have Chosen to Open : "+txt.getAbsolutePath());//+txt.getAbsolutePath());
       j.setForeground(Color.cyan);
       
       JLabel k= new JLabel(desc);
       k.setForeground(Color.CYAN);
       k.setBackground(Color.BLACK);
       k.setVisible(true);
       
       JPanel panel0= new JPanel();
       panel0.add(j);
       panel0.setBackground(Color.black);
       
       JPanel panel1= new JPanel();
       panel1.setBackground(Color.BLACK);
       
       JPanel panel2= new JPanel();
       panel2.setBackground(Color.BLACK);
       panel2.setLayout(new FlowLayout());
       panel2.add(back);
       panel2.add(b);
       
       back.addActionListener( new ButtonListener());
       b.addActionListener( new ButtonListener());
       
       super.add(panel2,BorderLayout.NORTH);
       super.add(k,BorderLayout.CENTER);
       super.add(panel0,BorderLayout.SOUTH);
       super.setVisible(true);
    } 

EncryptMethod(String title,String desc,int Choice){
       super(title);
       super.setBounds(0,0,800,600);
       super.setLocationRelativeTo(null);
       super.setDefaultCloseOperation(EXIT_ON_CLOSE);
       super.setResizable(true);
       super.getContentPane().setBackground(Color.BLACK);
       
       choice=Choice;
       
       JLabel k= new JLabel(desc);
       k.setBackground(Color.BLACK);
       k.setForeground(Color.CYAN);
       k.setVisible(true);
       
       JPanel panel1= new JPanel();
       panel1.setBackground(Color.BLACK);
       
       JPanel panel2= new JPanel();
       panel2.setBackground(Color.BLACK);
       panel2.setLayout(new FlowLayout());
       panel2.add(back);
       panel2.add(b);
       
       back.addActionListener( new ButtonListener());
       b.addActionListener( new ButtonListener());
       
       super.add(panel2,BorderLayout.NORTH);
       super.add(k,BorderLayout.CENTER);
       super.setVisible(true);
    } 



private class ButtonListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
           dispose();
           if(e.getSource()==back){
               if(choice==1){
               dispose();    
               SelectEncryption l = new SelectEncryption(text,choice);
               }
               else if(choice==2){
                   dispose();
                   SelectEncryption l= new SelectEncryption(choice);
               }
               else if(choice==3){
                   dispose();
                   SelectEncryption l= new SelectEncryption(choice);
               }
            }
               
           }
}
               
}


