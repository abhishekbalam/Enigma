/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful;

/**
 *
 * @author Abhishek Balam
 */    

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class Blowfish {

  public static void main(String[] args) throws Exception {
    blowfishEncrypt("plaintextfile", "ciphertextfile");
  }

  public static void blowfishEncrypt(String f1, String f2) throws Exception {
    SecretKey key = null;

    ObjectInputStream keyFile = new ObjectInputStream(new FileInputStream("BlowfishKey.ser"));
    key = (SecretKey) keyFile.readObject();
    keyFile.close();

    KeyGenerator keygen = KeyGenerator.getInstance("Blowfish");
    key = keygen.generateKey();
    ObjectOutputStream keyFileOut = new ObjectOutputStream(new FileOutputStream("BlowfishKey.ser"));
    keyFileOut.writeObject(key);
    keyFileOut.close();
    Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, key);

    BufferedInputStream in = new BufferedInputStream(new FileInputStream(f1));
    CipherOutputStream out = new CipherOutputStream(new BufferedOutputStream(new FileOutputStream(
        f2)), cipher);
    int i;
    do {
      i = in.read();
      if (i != -1)
        out.write(i);
    } while (i != -1);
    in.close();
    out.close();
  }
}

/*
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
 
public class BlowfishTest {
 
    public static void main(String[] args) throws Exception {
        encrypt("edwin","password");
        decrypt("6VsVtA/nhHKUZuWWmod/BQ==");
    }
 
    private static void encrypt(String username, String password) throws Exception {
        byte[] keyData = (username+password).getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] hasil = cipher.doFinal(password.getBytes());
        System.out.println(new BASE64Encoder().encode(hasil));
    }
     
    private static void decrypt(String string) throws Exception {
        byte[] keyData = ("edwin"+"password").getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] hasil = cipher.doFinal(new BASE64Decoder().decodeBuffer(string));
        System.out.println(new String(hasil));
    }
}
*/



/*
/*
 * Based on https://raw.githubusercontent.com/usefulfor/usefulfor/master/security/JBoss.java
 *
 * JBoss.java - Blowfish encryption/decryption tool with JBoss default password
 *    Daniel Martin Gomez <daniel@ngssoftware.com> - 03/Sep/2009
 *
 * This file may be used under the terms of the GNU General Public License 
 * version 2.0 as published by the Free Software Foundation:
 *   http://www.gnu.org/licenses/gpl-2.0.html
 
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

import java.math.BigInteger;
import javax.xml.bind.DatatypeConverter;

public class JBlowfish 
{
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

	// Converts byte array to hex string
	// From: http://stackoverflow.com/questions/9655181/convert-from-byte-array-to-hex-string-in-java
	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for ( int j = 0; j < bytes.length; j++ ) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	public static void main(String[] args) throws Exception
	{

		if ( ( args.length != 2 ) || !( args[0].equals("-e") | args[0].equals("-d") ) )
		{
			System.out.println( "Usage:\n\tjava JBlowfish <-e|-d> <encrypted_password>" );
			return;
		}

		String mode = args[0];

		// Configuration
		byte[] key	= "secret".getBytes();
		String IV  	= "12345678";

		
		System.out.println("-- Settings -----------");
		System.out.println("KEY:\t " + bytesToHex(key));
		System.out.println("IV:\t " + bytesToHex(IV.getBytes()));
		
		// Create new Blowfish cipher
		SecretKeySpec keySpec = new SecretKeySpec(key, "Blowfish"); 
		Cipher cipher = Cipher.getInstance("Blowfish/CBC/PKCS5Padding"); 
		String out = null;

		if ( mode.equals("-e") )
		{
			String secret = args[1];
			cipher.init(Cipher.ENCRYPT_MODE, keySpec, new javax.crypto.spec.IvParameterSpec(IV.getBytes())); 
			byte[] encoding = cipher.doFinal(secret.getBytes());

			System.out.println("-- Encrypted -----------");
			System.out.println("Base64:\t " + DatatypeConverter.printBase64Binary(encoding));
			System.out.println("HEX:\t " + bytesToHex(encoding));
		} 
		else
		{
			// Decode Base64
			byte[] ciphertext = DatatypeConverter.parseBase64Binary(args[1]);

			// Decrypt 
			cipher.init(Cipher.DECRYPT_MODE, keySpec, new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
			byte[] message = cipher.doFinal(ciphertext);

			System.out.println("-- Decrypted -----------");
			System.out.println("HEX:\t " + bytesToHex(message));
			System.out.println("PLAIN:\t " + new String(message));
			 
		}
	}
}
*/



/*
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;

/**
 * This program demonstrates how to encrypt/decrypt input
 * using the Blowfish Cipher with the Java Cryptograhpy.
 *
 *
public class BlowfishCipher {

  public static void main(String[] args) throws Exception {

    // create a key generator based upon the Blowfish cipher
    KeyGenerator keygenerator = KeyGenerator.getInstance("Blowfish");

    // create a key
    SecretKey secretkey = keygenerator.generateKey();

    // create a cipher based upon Blowfish
    Cipher cipher = Cipher.getInstance("Blowfish");

    // initialise cipher to with secret key
    cipher.init(Cipher.ENCRYPT_MODE, secretkey);

    // get the text to encrypt
    String inputText = JOptionPane.showInputDialog("Input your message: ");

    // encrypt message
    byte[] encrypted = cipher.doFinal(inputText.getBytes());

    // re-initialise the cipher to be in decrypt mode
    cipher.init(Cipher.DECRYPT_MODE, secretkey);

    // decrypt message
    byte[] decrypted = cipher.doFinal(encrypted);

    // and display the results
    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                                  "encrypted text: " + new String(encrypted) + "\n" +
                                  "decrypted text: " + new String(decrypted));

    // end example
    System.exit(0);
  }
}
*/
