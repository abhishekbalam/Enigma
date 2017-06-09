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
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TextEditor extends javax.swing.JFrame {

    /**
     * Creates new form TextEditor
     */
    public TextEditor(File textFile) {
        initComponents();
        main(null);
        super.setBackground(Color.BLACK);
        super.setLocationRelativeTo(null);
        Title=textFile.getName();
        super.setTitle("EnigmaEditor ("+Title+")");
        text=textFile;
        
            BufferedReader reader;
            StringBuilder stringBuilder = new StringBuilder();
            try {
                reader = new BufferedReader(new FileReader(text));
                while (reader.ready()) {
                    stringBuilder.append(reader.readLine() + "\n");
                }
                reader.close();
                this.editPane.setText(stringBuilder.toString());
                this.editPane.setCaretPosition(0);
                this.fileName = text;
                this.statusLabel.setText(text.getName()+" Opened.");
            }
            catch (IOException ioe) {
                this.statusLabel.setText("Can't open file.");
            }
        
        super.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/container_file.png")).getImage()); // NOI18N
        super.setVisible(true);
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
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenuItem();
        SelectAll = new javax.swing.JMenuItem();
        ClearAll = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        closePopupItem = new javax.swing.JMenuItem();
        choseLoc = new javax.swing.JFileChooser();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        editPane = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        loadMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        backMenuItem = new javax.swing.JMenuItem();
        closeMenuItem = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        cutMenu = new javax.swing.JMenuItem();
        copyMenu = new javax.swing.JMenuItem();
        pasteMenu = new javax.swing.JMenuItem();
        selectAllMenu = new javax.swing.JMenuItem();
        clearMenu = new javax.swing.JMenuItem();
        back = new javax.swing.JMenu();
        Encrypt = new javax.swing.JMenu();
        Decrypt = new javax.swing.JMenu();

        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        popup.add(Copy);

        Paste.setText("Paste");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        popup.add(Paste);

        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        popup.add(Cut);

        SelectAll.setText("Select All");
        SelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllActionPerformed(evt);
            }
        });
        popup.add(SelectAll);

        ClearAll.setText("Clear All");
        ClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearAllActionPerformed(evt);
            }
        });
        popup.add(ClearAll);
        popup.add(jSeparator2);

        closePopupItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        closePopupItem.setText("Close");
        closePopupItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closePopupItemActionPerformed(evt);
            }
        });
        popup.add(closePopupItem);

        choseLoc.setAccessory(New);
        choseLoc.setApproveButtonToolTipText("");
        choseLoc.setCurrentDirectory(new java.io.File("C:\\Users\\ABHISHEK\\Desktop"));
        choseLoc.setDialogTitle("Chose where to create a new file.");
        choseLoc.setOpaque(true);
        choseLoc.getAccessibleContext().setAccessibleParent(New);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");
        setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        editPane.setBackground(new java.awt.Color(51, 51, 51));
        editPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        editPane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editPane.setForeground(new java.awt.Color(255, 255, 255));
        editPane.setToolTipText("View And Edit Your File");
        editPane.setCaretColor(new java.awt.Color(255, 255, 255));
        editPane.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        editPane.setMargin(new java.awt.Insets(3, 20, 3, 20));
        editPane.setPreferredSize(new java.awt.Dimension(1920, 1080));
        editPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editPaneMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(editPane);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        statusLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        statusLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menuBar.setBackground(new java.awt.Color(0, 0, 0));
        menuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        menuBar.setForeground(new java.awt.Color(0, 255, 255));
        menuBar.setBorderPainted(false);
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBar.setInheritsPopupMenu(true);
        menuBar.setOpaque(false);

        File.setText("File");
        File.setOpaque(true);

        New.setText("New");
        New.setOpaque(true);
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        loadMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadMenu.setText("Open");
        loadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuActionPerformed(evt);
            }
        });
        File.add(loadMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        File.add(saveMenu);

        saveAsMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenu.setText("Save as...");
        saveAsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuActionPerformed(evt);
            }
        });
        File.add(saveAsMenu);
        File.add(jSeparator1);

        backMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        backMenuItem.setText("Back");
        backMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuItemActionPerformed(evt);
            }
        });
        File.add(backMenuItem);

        closeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        closeMenuItem.setText("Close");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });
        File.add(closeMenuItem);

        menuBar.add(File);

        Edit.setText("Edit");
        Edit.setOpaque(true);

        cutMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenu.setText("Cut");
        cutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuActionPerformed(evt);
            }
        });
        Edit.add(cutMenu);

        copyMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenu.setText("Copy");
        copyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuActionPerformed(evt);
            }
        });
        Edit.add(copyMenu);

        pasteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenu.setText("Paste");
        pasteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuActionPerformed(evt);
            }
        });
        Edit.add(pasteMenu);

        selectAllMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        selectAllMenu.setText("Select All");
        selectAllMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllMenuActionPerformed(evt);
            }
        });
        Edit.add(selectAllMenu);

        clearMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        clearMenu.setText("Clear All");
        clearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuActionPerformed(evt);
            }
        });
        Edit.add(clearMenu);

        menuBar.add(Edit);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        menuBar.add(back);

        Encrypt.setText("Encrypt");
        Encrypt.setDelay(0);
        Encrypt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Encrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncryptMouseClicked(evt);
            }
        });
        menuBar.add(Encrypt);

        Decrypt.setText("Decrypt");
        Decrypt.setDelay(0);
        Decrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DecryptMouseClicked(evt);
            }
        });
        menuBar.add(Decrypt);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (txt only)","txt");
    fileChooser.setFileFilter(filter);
		
    if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

        BufferedReader reader;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
            while (reader.ready()) {
                stringBuilder.append(reader.readLine() + "\n");
            }
            reader.close();
            this.editPane.setText(stringBuilder.toString());
            this.editPane.setCaretPosition(0);
            this.fileName = fileChooser.getSelectedFile();
        }
        catch (IOException ioe) {
            this.statusLabel.setText("Can't open file.");
        }
    }
    }//GEN-LAST:event_loadMenuActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
       save();
    }//GEN-LAST:event_saveMenuActionPerformed

    private void saveAsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuActionPerformed
        saveAs();
    }//GEN-LAST:event_saveAsMenuActionPerformed

    private void copyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuActionPerformed
        this.editPane.copy();
    }//GEN-LAST:event_copyMenuActionPerformed

    private void cutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuActionPerformed
        this.editPane.cut();
    }//GEN-LAST:event_cutMenuActionPerformed

    private void pasteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuActionPerformed
        this.editPane.paste();
    }//GEN-LAST:event_pasteMenuActionPerformed

    private void selectAllMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllMenuActionPerformed
        this.editPane.selectAll();
    }//GEN-LAST:event_selectAllMenuActionPerformed

    private void clearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuActionPerformed
        this.editPane.setText("");
    }//GEN-LAST:event_clearMenuActionPerformed

    private void editPaneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPaneMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            popup.show(this,evt.getX()+10,evt.getY()+67);
        }
    }//GEN-LAST:event_editPaneMouseReleased

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        // TODO add your handling code here:
        this.editPane.copy();
    }//GEN-LAST:event_CopyActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        // TODO add your handling code here:
        this.editPane.cut();
    }//GEN-LAST:event_CutActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        // TODO add your handling code here:
        this.editPane.paste();
    }//GEN-LAST:event_PasteActionPerformed

    private void SelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAllActionPerformed
        // TODO add your handling code here:
        this.editPane.selectAll();
    }//GEN-LAST:event_SelectAllActionPerformed

    private void ClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearAllActionPerformed
        // TODO add your handling code here:
        this.editPane.setText("");
    }//GEN-LAST:event_ClearAllActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:
     newFile();           
    }//GEN-LAST:event_NewActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Select.main(null);
    }//GEN-LAST:event_backActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Select.main(null);
    }//GEN-LAST:event_backMouseClicked

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed
        // TODO add your handling code here:
        this.dispose();
        thank.main(null);
    }//GEN-LAST:event_closeMenuItemActionPerformed

    private void backMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuItemActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Select.main(null);    
    }//GEN-LAST:event_backMenuItemActionPerformed

    private void EncryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncryptMouseClicked
        SelectFileEncryption k= new SelectFileEncryption(text);
    }//GEN-LAST:event_EncryptMouseClicked

    private void DecryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecryptMouseClicked
        SelectFileDecryption k=new SelectFileDecryption(text);
    }//GEN-LAST:event_DecryptMouseClicked

    private void closePopupItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closePopupItemActionPerformed
        super.dispose();
        thank.main(null);
    }//GEN-LAST:event_closePopupItemActionPerformed

    public void save(){
         BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(this.fileName));
            writer.write(this.editPane.getText());
            writer.close();
            this.statusLabel.setText("File Saved");
        }
        catch (IOException ioe) {
            this.statusLabel.setText("Can't save file.");
        }
    }    
    
    public void saveAs(){
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (add .txt at end of filename)","txt");
		fileChooser.setFileFilter(filter);
		fileChooser.setDialogTitle("Save As");
                fileChooser.setBackground(Color.BLACK);
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            BufferedWriter writer;
            try {
                writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
                writer.write(this.editPane.getText());
                writer.close();
                this.statusLabel.setText(fileChooser.getSelectedFile().getName()+ " saved at "+fileChooser.getSelectedFile().getPath());
            }
            catch (IOException ioe) {
                this.statusLabel.setText("Can't save file.please try again.");
            }
        }
    }
    
    public  void newFile(){
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (add .txt at end of filename)","txt");
		fileChooser.setFileFilter(filter);
                fileChooser.setDialogTitle("Create File");
                fileChooser.setApproveButtonText("Create");
		
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            BufferedWriter writer;
            try {
                writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
                writer.write("");
                writer.close();
                this.statusLabel.setText(fileChooser.getSelectedFile().getName()+ " created at "+fileChooser.getSelectedFile().getPath());
                TextEditor t= new TextEditor(fileChooser.getSelectedFile());
            }
            catch(IOException e){
                this.statusLabel.setText("Can't create file.Please try again.");
            }
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
            }
        });
    }
    
    private String Title;
    
    private Point initialClick;
    private File fileName = new File("noname");
    private File text;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ClearAll;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenu Decrypt;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu Encrypt;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem SelectAll;
    private javax.swing.JMenu back;
    private javax.swing.JMenuItem backMenuItem;
    private javax.swing.JFileChooser choseLoc;
    private javax.swing.JMenuItem clearMenu;
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JMenuItem closePopupItem;
    private javax.swing.JMenuItem copyMenu;
    private javax.swing.JMenuItem cutMenu;
    public static javax.swing.JEditorPane editPane;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenu;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JMenuItem saveAsMenu;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JMenuItem selectAllMenu;
    public static javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}