/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useless;

import static enigma.AES.decrypt;
import static enigma.AES.encrypt;
import enigma.TextEditor;
import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Abhishek Balam
 */
public class code {
    static Cipher cipher;
        
        /*public AES(File text,int  mode){
       
        try {
                /*StringBuilder stringBuilder = new StringBuilder();
                FileReader fr=new FileReader(text);
                BufferedReader reader= new BufferedReader(fr);
                 
                                while (reader.ready()) {
                    stringBuilder.append(reader.readLine() + "\n");
                }
                reader.close();
                
                String plainText = stringBuilder.toString();
		
                if (mode==1){
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();
                //TextEditor.secretKey=base64String(secretKey);
                //System.out.println(TextEditor.secretKey);
                //TextEditor.s=secretKey;
		cipher = Cipher.getInstance("AES");
                String encryptedText = encrypt(TextEditor.editPane.getText(), secretKey);
		TextEditor.editPane.setText(encryptedText);
                }
                /*String decryptedText = decrypt(encryptedText, secretKey);
		TextEditor.editPane.setText(encryptedText+"\n"+decryptedText);
                System.out.println(encryptedText+"\n"+decryptedText);
                
                s
                
                if(mode==2){
                String decryptedText = decrypt(TextEditor.editPane.getText(),TextEditor.s);
		TextEditor.editPane.setText(decryptedText);
                System.out.println(decryptedText);
                }
        }
        catch(Exception e){
        }
        }*
    	/*public static void main(String[] args) throws Exception {
                
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();
		cipher = Cipher.getInstance("AES");
                BufferedReader r= new BufferedReader(new FileReader(txtFile));
                
		String plainText = "";
		System.out.println("Plain Text Before Encryption: " + plainText);

		String encryptedText = encrypt(plainText, secretKey);
		System.out.println("Encrypted Text After Encryption: " + encryptedText);

		String decryptedText = decrypt(encryptedText, secretKey);
		System.out.println("Decrypted Text After Decryption: " + decryptedText);
                
	}*/
    
    
        /*
     public static void main(String[] args) throws URISyntaxException {
    final URI uri = new URI("http://java.sun.com");
    class OpenUrlAction implements ActionListener {
      @Override public void actionPerformed(ActionEvent e) {
        open(uri);
      }
    }
    JFrame frame = new JFrame("Links");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(100, 400);
    Container container = frame.getContentPane();
    container.setLayout(new GridBagLayout());
    JButton button = new JButton();
    button.setText("<HTML>Click the <FONT color=\"#000099\"><U>link</U></FONT>"
        + " to go to the Java website.</HTML>");
    button.setHorizontalAlignment(SwingConstants.LEFT);
    button.setBorderPainted(false);
    button.setOpaque(false);
    button.setBackground(Color.WHITE);
    button.setToolTipText(uri.toString());
    button.addActionListener(new OpenUrlAction());
    container.add(button);
    frame.setVisible(true);
  }

  private static void open(URI uri) {
    if (Desktop.isDesktopSupported()) {
      try {
        Desktop.getDesktop().browse(uri);
      } catch (IOException e) { /* TODO: error handling }
    } else { /* TODO: error handling  }
  }
    */

}



