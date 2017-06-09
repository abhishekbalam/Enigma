package Useless;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abhishek Balam
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.io.File;

public class CardPanel extends JPanel {
    CardPanel(String Head,String Desc,JButton b){
        
        JLabel k1= new JLabel(Head);
        k1.setFont(new Font("SANS",Font.BOLD,46));
        k1.setForeground(Color.cyan);
        
        JLabel k2= new JLabel(Desc);
        k2.setFont(new Font("SANS",Font.BOLD,20));
        k2.setForeground(Color.cyan);
        
        
        JPanel panela= new JPanel();
        JPanel panelb= new JPanel();
        JPanel panelc= new JPanel();
        panela.setBackground(Color.black);
        panelb.setBackground(Color.black);
        panelc.setBackground(Color.black);
       
        super.setVisible(true);
        super.setLayout(new GridLayout(0,1));
        super.setBackground(Color.black);
       
        
        panela.add(k1);
        super.add(panela);
        panelb.add(k2);
        super.add(panelb);
        panelc.add(b);
        
        super.add(panelc);
        super.setVisible(true);
        super.setLayout(new GridLayout(0,1));
        super.setBackground(Color.black);
       
    } 

}