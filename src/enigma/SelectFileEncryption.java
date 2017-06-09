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

import java.awt.*;
import java.io.*;

public class SelectFileEncryption extends javax.swing.JFrame {

    /**
     * Creates new form SelectFileEncryption
     */
    public SelectFileEncryption(File Text) {
        initComponents();
        text=Text;
        super.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/container_file.png")).getImage());
        super.setVisible(true);
        super.setLocationRelativeTo(null);
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        aesButton = new javax.swing.JRadioButton();
        method2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        minimise = new javax.swing.JButton();
        Continue = new javax.swing.JButton();
        des = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        jLayeredPane1.setOpaque(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        buttonGroup1.add(aesButton);
        aesButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        aesButton.setForeground(new java.awt.Color(0, 255, 255));
        aesButton.setText("Avanced Encryption Code (AES)");
        aesButton.setOpaque(false);
        aesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aesButtonMouseExited(evt);
            }
        });
        aesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aesButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(method2);
        method2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        method2.setForeground(new java.awt.Color(0, 255, 255));
        method2.setText("Blowfish");
        method2.setOpaque(false);
        method2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                method2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                method2MouseExited(evt);
            }
        });
        method2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                method2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Encryption Method");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close (1).png"))); // NOI18N
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setPreferredSize(new java.awt.Dimension(43, 41));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        minimise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Char - Minus (1).png"))); // NOI18N
        minimise.setToolTipText("");
        minimise.setContentAreaFilled(false);
        minimise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimiseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimiseMouseExited(evt);
            }
        });
        minimise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimiseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(102, 102, 102)
                .addComponent(minimise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(minimise)))
                .addContainerGap())
        );

        Continue.setBackground(new java.awt.Color(0, 0, 0));
        Continue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Continue.setForeground(new java.awt.Color(0, 255, 255));
        Continue.setText("Continue");
        Continue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        Continue.setContentAreaFilled(false);
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        buttonGroup1.add(des);
        des.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        des.setForeground(new java.awt.Color(0, 255, 255));
        des.setText("Triple DES");
        des.setOpaque(false);
        des.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                desMouseExited(evt);
            }
        });
        des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(method2)
                            .addComponent(aesButton)
                            .addComponent(des))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(aesButton)
                        .addGap(18, 18, 18)
                        .addComponent(method2)
                        .addGap(18, 18, 18)
                        .addComponent(des)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(aesButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(method2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Continue, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(des, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setSize(30, 30);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        close.setSize(29, 29);
    }//GEN-LAST:event_closeMouseExited

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        super.dispose();
        
    }//GEN-LAST:event_closeActionPerformed

    private void minimiseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseEntered
        // TODO add your handling code here:
        minimise.setSize(31,26);
    }//GEN-LAST:event_minimiseMouseEntered

    private void minimiseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseExited
        // TODO add your handling code here:
        minimise.setSize(30,25);
    }//GEN-LAST:event_minimiseMouseExited

    private void minimiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimiseActionPerformed
        // TODO add your handling code here:
        super.setState(this.ICONIFIED);
    }//GEN-LAST:event_minimiseActionPerformed

    private void aesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aesButtonMouseEntered
        // TODO add your handling code here:
        aesButton.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        
    }//GEN-LAST:event_aesButtonMouseEntered

    private void aesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aesButtonMouseExited
        // TODO add your handling code here:
        aesButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        
    }//GEN-LAST:event_aesButtonMouseExited

    private void method2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_method2MouseEntered
        // TODO add your handling code here:
        method2.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        
    }//GEN-LAST:event_method2MouseEntered

    private void method2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_method2MouseExited
        // TODO add your handling code here:
        method2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        
    }//GEN-LAST:event_method2MouseExited

    private void aesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aesButtonActionPerformed
        // TODO add your handling code here:
        choice=1;
        
    }//GEN-LAST:event_aesButtonActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        // TODO add your handling code here:
            this.dispose();
            Key k= new Key(text,1,choice);
            
    }//GEN-LAST:event_ContinueActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
            initialClick = evt.getPoint();
            getComponentAt(initialClick);
    
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
            int thisX = getLocation().x;
            int thisY = getLocation().y;
            // Determine how much the mouse moved since the initial click
            int xMoved = (thisX + evt.getX()) - (thisX + initialClick.x);
            int yMoved = (thisY + evt.getY()) - (thisY + initialClick.y);

            // Move window to this position
            int X = thisX + xMoved;
            int Y = thisY + yMoved;
            setLocation(X, Y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void method2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_method2ActionPerformed
        // TODO add your handling code here:
        choice=2;
    }//GEN-LAST:event_method2ActionPerformed

    private void desMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desMouseEntered
        // TODO add your handling code here:
        des.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        
    }//GEN-LAST:event_desMouseEntered

    private void desMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desMouseExited
        // TODO add your handling code here:
        des.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        
    }//GEN-LAST:event_desMouseExited

    private void desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desActionPerformed
        // TODO add your handling code here:
        choice=3;
    }//GEN-LAST:event_desActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectFileEncryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new SelectFileEncryption().setVisible(true);
            }
        });
    }

    private Point initialClick;
    private int choice;
    private File text;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JRadioButton aesButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton close;
    private javax.swing.JRadioButton des;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton method2;
    private javax.swing.JButton minimise;
    // End of variables declaration//GEN-END:variables
}
