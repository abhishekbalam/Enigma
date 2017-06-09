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

import Useless.EncryptMethod;
import javax.swing.*;
import java.io.*;
import java.lang.*;
import enigma.SelectEncryptCipher;

public class MethodPanel extends javax.swing.JPanel {

    /**
     * Creates new form MethodPanel
     */
    int Method=0;
    File txt;
    JFrame Super;
    

    public MethodPanel(String Title,String Desc,int method,final JFrame Suuper ) {
        initComponents();
        Super=Suuper;
        Method=method;
        header.setText(Title);
        description.setText(Desc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        Close = new javax.swing.JMenuItem();
        back = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        knowMore = new javax.swing.JButton();
        description = new javax.swing.JLabel();
        header = new javax.swing.JLabel();

        Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Close.setText("Close");
        Close.setOpaque(true);
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        popup.add(Close);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        popup.add(back);

        setOpaque(false);

        jPanel2.setOpaque(false);

        knowMore.setBackground(new java.awt.Color(0, 0, 0));
        knowMore.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        knowMore.setForeground(java.awt.Color.cyan);
        knowMore.setText("Continue");
        knowMore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        knowMore.setContentAreaFilled(false);
        knowMore.setOpaque(true);
        knowMore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                knowMoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                knowMoreMouseExited(evt);
            }
        });
        knowMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knowMoreActionPerformed(evt);
            }
        });

        description.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        description.setForeground(new java.awt.Color(0, 255, 255));
        description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        description.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                descriptionMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(knowMore, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
            .addComponent(description, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(knowMore, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        header.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        header.setForeground(new java.awt.Color(0, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void knowMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knowMoreActionPerformed
        if(evt.getSource()==knowMore){
            if(Method==1){
                    Select.a.dispose();
                    Select.s.dispose();
                    Super.dispose();
                    CaesarUI j= new CaesarUI();
                }
                    
           if(Method==2){
                    Select.a.dispose();
                    Select.s.dispose();
                    Super.dispose();
                    VigenereUI v= new VigenereUI();
                }
           
           
           if(Method==3){
                    Select.a.dispose();
                    Select.s.dispose();
                    Super.dispose();
                    AtbashUI a= new AtbashUI();
                }
           if(Method==4){
                    Select.a.dispose();
                    Select.s.dispose();
                    Super.dispose();
                    OneTimePadUI o= new OneTimePadUI();
                }
        }
    }//GEN-LAST:event_knowMoreActionPerformed

    private void knowMoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_knowMoreMouseEntered
        // TODO add your handling code here:
        knowMore.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        knowMore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        
    }//GEN-LAST:event_knowMoreMouseEntered

    private void knowMoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_knowMoreMouseExited
        // TODO add your handling code here:
        knowMore.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        knowMore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        
    }//GEN-LAST:event_knowMoreMouseExited

    private void descriptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
             popup.show(this,evt.getX(),evt.getY()+96);
             }
    }//GEN-LAST:event_descriptionMouseReleased

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        Select.a.dispose();
        Select.s.dispose();
        thank.main(null);
    }//GEN-LAST:event_CloseActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Select.a.dispose();
        Select.s.setVisible(true);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Close;
    private javax.swing.JMenuItem back;
    private javax.swing.JLabel description;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton knowMore;
    private javax.swing.JPopupMenu popup;
    // End of variables declaration//GEN-END:variables
}
