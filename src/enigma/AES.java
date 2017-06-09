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

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.*;
import java.io.*;

public class AES {
            static Cipher cipher;

                public AES(File text,int  mode, String key){
       
        try {
                /*StringBuilder stringBuilder = new StringBuilder();
                FileReader fr=new FileReader(text);
                BufferedReader reader= new BufferedReader(fr);
                 
                                while (reader.ready()) {
                    stringBuilder.append(reader.readLine() + "\n");
                }
                reader.close();
                
                String plainText = stringBuilder.toString();
		*/
            
                if (mode==1){
                byte[] encodedKey = Base64.getDecoder().decode(key);
                SecretKey originalKey= new SecretKeySpec(encodedKey,0,encodedKey.length,"AES");
                cipher = Cipher.getInstance("AES");
                String encryptedText = encrypt(TextEditor.editPane.getText(),originalKey );
		TextEditor.editPane.setText(encryptedText);
                System.out.println("en");
                }
                
                if(mode==2){
                System.out.println("de");
                byte[] decodedKey = Base64.getDecoder().decode(key);
                System.out.println("de3");
                SecretKey ogKey= new SecretKeySpec(decodedKey,0,decodedKey.length,"AES");
                System.out.println("de2");
                String decryptedText = decrypt(TextEditor.editPane.getText(),ogKey);
		TextEditor.editPane.setText(decryptedText);
                System.out.println(decryptedText);
                
                }
        }
        catch(Exception e){
        }
        }
                

	public static String encrypt(String plainText, SecretKey secretKey)
			throws Exception {
		byte[] plainTextByte = plainText.getBytes();
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptedByte = cipher.doFinal(plainTextByte);
		Base64.Encoder encoder = Base64.getEncoder();
		String encryptedText = encoder.encodeToString(encryptedByte);
		return encryptedText;
	}

	public static String decrypt(String encryptedText, SecretKey secretKey)
			throws Exception {
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] encryptedTextByte = decoder.decode(encryptedText);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
		String decryptedText = new String(decryptedByte);
		return decryptedText;
	}
        
    private static String base64String(SecretKey secretKey) {
        return new String(Base64.getEncoder().encode(secretKey.getEncoded()));
    }
}

