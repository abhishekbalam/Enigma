/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.*;
import java.util.Base64;

/**
 *
 * @author Abhishek Balam
 */
public class Blowfish {
    static Cipher cipher;
    public Blowfish(File text,int  mode, String Key){
        try{
                
                if (mode==1){
                    cipher = Cipher.getInstance("Blowfish");
                    byte[] encodedKey = Base64.getDecoder().decode(Key);
                    SecretKey originalKey= new SecretKeySpec(encodedKey,0,encodedKey.length,"Blowfish");
                    String encryptedText = encrypt(TextEditor.editPane.getText(),originalKey );
                    TextEditor.editPane.setText(encryptedText);
                    }
                
                if(mode==2){
                    byte[] decodedKey = Base64.getDecoder().decode(Key);
                    SecretKey originalKey= new SecretKeySpec(decodedKey,0,decodedKey.length,"Blowfish");
                    String decryptedText = decrypt(TextEditor.editPane.getText(),originalKey);
                    TextEditor.editPane.setText(decryptedText);
                    System.out.println(decryptedText);
                }
        }
        catch(Exception e){
            
        }
    }
    	public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
		byte[] plainTextByte = plainText.getBytes();
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptedByte = cipher.doFinal(plainTextByte);
		Base64.Encoder encoder = Base64.getEncoder();
		String encryptedText = encoder.encodeToString(encryptedByte);
		return encryptedText;
	}

	public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
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
