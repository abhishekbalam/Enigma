/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.awt.*;
import javax.swing.UIManager;

/**
 *
 * @author Abhishek Balam
 */
public class Legal extends javax.swing.JFrame {

    /**
     * Creates new form Legal
     */
    public Legal() {
        initComponents();
         super.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/container_file.png")).getImage());
       super.setBackground(Color.BLACK);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        String h = "Sample Software License Agreement\n" +
"\n" +
"\n" +
"This Software License is made by (AV COMPANY NAME), (address of AV COMPANY NAME), to the Customer as an essential element of the services to be rendered by (AV COMPANY NAME) as defined in the system specification and any associated documents and agreement. System shall mean the deliverable product as defined in these documents.\n" +
"\n" +
"Customer and (AV COMPANY NAME) agree that this Software License is deemed to be part of, and subject to, the terms of the Agreement applicable to both parties.\n" +
"\n" +
"SECTION 1	LICENSE GRANT AND OWNERSHIP\n" +
"\n" +
"1.1	(AV COMPANY NAME) hereby grants to Customer a worldwide, perpetual, non-exclusive, non-transferable license to all software for Customer’s use in connection with the establishment, use, maintenance and modification of the system implemented by (AV COMPANY NAME). Software shall mean executable object code of software programs and the patches, scripts, modifications, enhancements, designs, concepts or other materials that constitute the software programs necessary for the proper function and operation of the system as delivered by the (AV COMPANY NAME) and accepted by the Customer.\n" +
"1.2	Except as expressly set forth in this paragraph, (AV COMPANY NAME) shall at all times own all intellectual property rights in the software. Any and all licenses, product warranties or service contracts provided by third parties in connection with any software, hardware or other software or services provided in the system shall be delivered to Customer for the sole benefit of Customer.\n" +
"1.3	Customer may supply to (AV COMPANY NAME) or allow the (AV COMPANY NAME) to use certain proprietary information, including service marks, logos, graphics, software, documents and business information and plans that have been authored or pre-owned by Customer. All such intellectual property shall remain the exclusive property of Customer and shall not be used by (AV COMPANY NAME) for any purposes other than those associated with delivery of the system.\n" +
"\n" +
"SECTION 2	COPIES, MODIFICATION, AND USE\n" +
"\n" +
"2.1	Customer may make copies of the software for archival purposes and as required for modifications to the system. All copies and distribution of the software shall remain within the direct control of Customer and its representatives.\n" +
"2.2	Customer may make modifications to the source code version of the software, if and only if the results of all such modifications are applied solely to the system. In no way does this Software License confer any right in Customer to license, sublicense, sell, or otherwise authorize the use of the software, whether in executable form, source code or otherwise, by any third parties, except in connection with the use of the system as part of Customer’s business.\n" +
"2.3	All express or implied warranties relating to the software shall be deemed null and void in case of any modification to the software made by any party other than (AV COMPANY NAME).\n" +
"\n" +
"SECTION 3	WARRANTIES AND REPRESENTATIONS\n" +
"\n" +
"(AV COMPANY NAME) represents and warrants to Customer that:\n" +
"\n" +
"3.1	it has all necessary rights and authority to execute and deliver this Software License and perform its obligations hereunder and to grant the rights granted under this Software License to Customer; \n" +
"3.2	the goods and services provided by contractor under this Software License, including the software and all intellectual property provided hereunder, are original to (AV COMPANY NAME) or its subcontractors or partners; and\n" +
"3.3	the software, as delivered as part of the system, will not infringe or otherwise violate the rights of any third party, or violate any applicable law, rule or regulation.\n" +
"3.4	(AV COMPANY NAME) further represents and warrants that, throughout the System Warranty Period, the executable object code of software and the system will perform substantially in accordance with the System Specifications and Agreement. If the software fails to perform as specified and accepted all remedies are pursuant to the policies set forth in the Specification and in the Agreement. No warranty of any type or nature is provided for the source code version of the software which is delivered as is.\n" +
"3.5	Except as expressly stated in this Agreement, there are no warranties, express or implied, including, but not limited to, the implied warranties of fitness for a particular purpose, of merchantability, or warranty of no infringement of third party intellectual property rights.\n" +
"\n" +
"SECTION 4	INDEMNIFICATION\n" +
"\n" +
"4.1	(AV COMPANY NAME) hereby indemnifies and shall defend and hold harmless Customer, its parent companies and its and their subsidiaries, affiliates, officers, directors, employees, agents and subcontractors from and against all liability, damages, loss, cost or expense, including but not limited to reasonable attorneys’ fees and expenses, arising out of or in connection with any breach or alleged breach of the Agreement or any third party claims that the software or system here provided by (AV COMPANY NAME) infringes or otherwise violates any rights of any such third party.\n" +
"4.2	Customer hereby indemnifies and shall defend and hold harmless (AV COMPANY NAME), its and their subsidiaries, affiliates, officers, directors, employees, agents and subcontractors from and against all liability, damages, loss, cost or expense, including but not limited to reasonable attorneys’ fees and expenses, arising out of or in connection with any third party claims that Customer’s use of the software in contravention of the grant of rights infringes or otherwise violates any rights of any such third party.\n" +
"4.3	Upon the assertion of any claim or the commencement of any suit or proceeding against an indemnitee by any third party that may give rise to liability of an indemnitor hereunder, the indemnitee shall promptly notify the indemnitor of the existence of such a claim and shall give the indemnitor reasonable opportunity to defend and to settle the claim at its own expense and with counsel of its own selection. The indemnitee shall cooperate with the indemnitor, shall at all times have the right full to participate in such a defense at its own expense and shall not be obligated, against its consent, to participate in any settlement which it reasonably believes would have an adverse effect on its business.\n" +
"\n" +
"SECTION 5	TRANSFER AND TERMINATION\n" +
"\n" +
"This license will automatically terminate upon the disassembly of the system cited above, unless the system is reassembled in its original configuration in another location.\n" +
"\n" +
"(AV COMPANY NAME) may terminate this license upon notice for failure to comply with any of terms set forth in this Software License. Upon termination, Customer is obligated to immediately destroy the software, including all copies and modifications.\n" +
"\n" +
"As Customer’s duly authorized representative, I have read and agree to this License.\n" +
"\n" +
"Customer	\n" +
"\n" +
"Printed name of signatory	\n" +
"\n" +
"Signature	 	Date 	\n" +
"\n" +
"\n" +
"Rev4. Sept 2003\n" +
"\n" +
"Disclaimer: ICIA® provides this Sample Software License Agreement for illustration purposes only and makes no warranty, express or implied, including the warranties of merchantability and fitness for a particular purpose, or assumes any legal liability or responsibility for the accuracy, completeness, or usefulness of any information, or represents that its use would not infringe privately owned rights.\n" +
"";
        jTextArea2.setText(h);
        jTextArea2.setCaretPosition(0);
        jTextArea2.setEditable(false);

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
        base = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        minimise = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        decline = new javax.swing.JButton();
        accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("License Agreement");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);

        base.setBackground(new java.awt.Color(0, 0, 0));
        base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        base.setPreferredSize(new java.awt.Dimension(800, 570));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 30));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("License Agreement");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        close.setBackground(new java.awt.Color(0, 0, 0));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close (1).png"))); // NOI18N
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        minimise.setBackground(new java.awt.Color(0, 0, 0));
        minimise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Char - Minus (1).png"))); // NOI18N
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
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(minimise, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(minimise)
                            .addComponent(close))))
                .addContainerGap())
        );

        scroll.setBackground(new java.awt.Color(102, 102, 102));
        scroll.setMaximumSize(new java.awt.Dimension(32767, 5000000));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Sample Software License Agreement\nsanklasdnukj\n\n\nThis Software License is made by (AV COMPANY NAME), (address of AV COMPANY NAME), to the Customer as an essential element of the services to be rendered by (AV COMPANY NAME) as defined in the system specification and any associated documents and agreement. System shall mean the deliverable product as defined in these documents.\n\nCustomer and (AV COMPANY NAME) agree that this Software License is deemed to be part of, and subject to, the terms of the Agreement applicable to both parties.\n\nSECTION 1\tLICENSE GRANT AND OWNERSHIP\n\n1.1\t(AV COMPANY NAME) hereby grants to Customer a worldwide, perpetual, non-exclusive, non-transferable license to all software for Customer’s use in connection with the establishment, use, maintenance and modification of the system implemented by (AV COMPANY NAME). Software shall mean executable object code of software programs and the patches, scripts, modifications, enhancements, designs, concepts or other materials that constitute the software programs necessary for the proper function and operation of the system as delivered by the (AV COMPANY NAME) and accepted by the Customer.\n1.2\tExcept as expressly set forth in this paragraph, (AV COMPANY NAME) shall at all times own all intellectual property rights in the software. Any and all licenses, product warranties or service contracts provided by third parties in connection with any software, hardware or other software or services provided in the system shall be delivered to Customer for the sole benefit of Customer.\n1.3\tCustomer may supply to (AV COMPANY NAME) or allow the (AV COMPANY NAME) to use certain proprietary information, including service marks, logos, graphics, software, documents and business information and plans that have been authored or pre-owned by Customer. All such intellectual property shall remain the exclusive property of Customer and shall not be used by (AV COMPANY NAME) for any purposes other than those associated with delivery of the system.\n\nSECTION 2\tCOPIES, MODIFICATION, AND USE\n\n2.1\tCustomer may make copies of the software for archival purposes and as required for modifications to the system. All copies and distribution of the software shall remain within the direct control of Customer and its representatives.\n2.2\tCustomer may make modifications to the source code version of the software, if and only if the results of all such modifications are applied solely to the system. In no way does this Software License confer any right in Customer to license, sublicense, sell, or otherwise authorize the use of the software, whether in executable form, source code or otherwise, by any third parties, except in connection with the use of the system as part of Customer’s business.\n2.3\tAll express or implied warranties relating to the software shall be deemed null and void in case of any modification to the software made by any party other than (AV COMPANY NAME).\n\nSECTION 3\tWARRANTIES AND REPRESENTATIONS\n\n(AV COMPANY NAME) represents and warrants to Customer that:\n\n3.1\tit has all necessary rights and authority to execute and deliver this Software License and perform its obligations hereunder and to grant the rights granted under this Software License to Customer; \n3.2\tthe goods and services provided by contractor under this Software License, including the software and all intellectual property provided hereunder, are original to (AV COMPANY NAME) or its subcontractors or partners; and\n3.3\tthe software, as delivered as part of the system, will not infringe or otherwise violate the rights of any third party, or violate any applicable law, rule or regulation.\n3.4\t(AV COMPANY NAME) further represents and warrants that, throughout the System Warranty Period, the executable object code of software and the system will perform substantially in accordance with the System Specifications and Agreement. If the software fails to perform as specified and accepted all remedies are pursuant to the policies set forth in the Specification and in the Agreement. No warranty of any type or nature is provided for the source code version of the software which is delivered as is.\n3.5\tExcept as expressly stated in this Agreement, there are no warranties, express or implied, including, but not limited to, the implied warranties of fitness for a particular purpose, of merchantability, or warranty of no infringement of third party intellectual property rights.\n\nSECTION 4\tINDEMNIFICATION\n\n4.1\t(AV COMPANY NAME) hereby indemnifies and shall defend and hold harmless Customer, its parent companies and its and their subsidiaries, affiliates, officers, directors, employees, agents and subcontractors from and against all liability, damages, loss, cost or expense, including but not limited to reasonable attorneys’ fees and expenses, arising out of or in connection with any breach or alleged breach of the Agreement or any third party claims that the software or system here provided by (AV COMPANY NAME) infringes or otherwise violates any rights of any such third party.\n4.2\tCustomer hereby indemnifies and shall defend and hold harmless (AV COMPANY NAME), its and their subsidiaries, affiliates, officers, directors, employees, agents and subcontractors from and against all liability, damages, loss, cost or expense, including but not limited to reasonable attorneys’ fees and expenses, arising out of or in connection with any third party claims that Customer’s use of the software in contravention of the grant of rights infringes or otherwise violates any rights of any such third party.\n4.3\tUpon the assertion of any claim or the commencement of any suit or proceeding against an indemnitee by any third party that may give rise to liability of an indemnitor hereunder, the indemnitee shall promptly notify the indemnitor of the existence of such a claim and shall give the indemnitor reasonable opportunity to defend and to settle the claim at its own expense and with counsel of its own selection. The indemnitee shall cooperate with the indemnitor, shall at all times have the right full to participate in such a defense at its own expense and shall not be obligated, against its consent, to participate in any settlement which it reasonably believes would have an adverse effect on its business.\n\nSECTION 5\tTRANSFER AND TERMINATION\n\nThis license will automatically terminate upon the disassembly of the system cited above, unless the system is reassembled in its original configuration in another location.\n\n(AV COMPANY NAME) may terminate this license upon notice for failure to comply with any of terms set forth in this Software License. Upon termination, Customer is obligated to immediately destroy the software, including all copies and modifications.\n\nAs Customer’s duly authorized representative, I have read and agree to this License.\n\nCustomer\t\n\nPrinted name of signatory\t\n\nSignature\t \tDate \t\n\n\nRev4. Sept 2003\n\nDisclaimer: ICIA® provides this Sample Software License Agreement for illustration purposes only and makes no warranty, express or implied, including the warranties of merchantability and fitness for a particular purpose, or assumes any legal liability or responsibility for the accuracy, completeness, or usefulness of any information, or represents that its use would not infringe privately owned rights.\n\n");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea2.setDragEnabled(true);
        scroll.setViewportView(jTextArea2);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        decline.setBackground(new java.awt.Color(0, 0, 0));
        decline.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        decline.setForeground(new java.awt.Color(0, 255, 255));
        decline.setText("Decline");
        decline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        decline.setContentAreaFilled(false);
        decline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        decline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                declineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                declineMouseExited(evt);
            }
        });
        decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineActionPerformed(evt);
            }
        });

        accept.setBackground(new java.awt.Color(0, 0, 0));
        accept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accept.setForeground(new java.awt.Color(0, 255, 255));
        accept.setText("Accept");
        accept.setAutoscrolls(true);
        accept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        accept.setContentAreaFilled(false);
        accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acceptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acceptMouseExited(evt);
            }
        });
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(decline, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decline, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        super.dispose();
        
    }//GEN-LAST:event_closeActionPerformed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setSize(32,26);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        close.setSize(31,25);
    }//GEN-LAST:event_closeMouseExited

    private void minimiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimiseActionPerformed
        // TODO add your handling code here:
        super.setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_minimiseActionPerformed

    private void minimiseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseEntered
        // TODO add your handling code here:
        minimise.setSize(30,26);
    }//GEN-LAST:event_minimiseMouseEntered

    private void minimiseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseMouseExited
        // TODO add your handling code here:
        minimise.setSize(29,25);
    }//GEN-LAST:event_minimiseMouseExited

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Select.main(null);
    }//GEN-LAST:event_acceptActionPerformed

    private void declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineActionPerformed
        // TODO add your handling code here:
        sure.main(null);
    }//GEN-LAST:event_declineActionPerformed

    private void acceptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptMouseEntered
        // TODO add your handling code here:
        accept.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        accept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        
    }//GEN-LAST:event_acceptMouseEntered

    private void acceptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptMouseExited
        // TODO add your handling code here:
        accept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 1));
        
    }//GEN-LAST:event_acceptMouseExited

    private void declineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineMouseEntered
        // TODO add your handling code here:
        decline.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        decline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        
    }//GEN-LAST:event_declineMouseEntered

    private void declineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineMouseExited
        // TODO add your handling code here:
        decline.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        decline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 1));
        
    }//GEN-LAST:event_declineMouseExited

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

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
            initialClick = evt.getPoint();
        getComponentAt(initialClick);
    
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        if(this.getState()==MAXIMIZED_BOTH){
            super.setExtendedState(this.ICONIFIED);
        }
        else if (this.getState()==NORMAL){
        super.setExtendedState(this.MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(Legal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Legal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Legal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Legal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
      catch(Exception e){
          throw new RuntimeException(e);
      }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Legal().setVisible(true);
            }
        });
    }
    
    private Point initialClick;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JPanel base;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton close;
    private javax.swing.JButton decline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton minimise;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
