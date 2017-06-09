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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
//triple
public class DES 
{
    SecretKey key;

    DES(byte [] rawkey) throws Exception
    {
        key = readKey(rawkey);
    }

    public SecretKey readKey(byte[] rawkey) throws Exception
    {
         DESedeKeySpec keyspec = new DESedeKeySpec(rawkey);
         SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("DESede");
         SecretKey key = keyfactory.generateSecret(keyspec);
         return key;
    }

    public byte[] encrypt(byte[] plain ) throws Exception
    {
        Cipher cipher = Cipher.getInstance("DESede");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plain);
        return encrypted;
    }
    public byte[] decrypt(byte[] cipher ) throws Exception
    {
        Cipher dcipher = Cipher.getInstance("DESede");
        dcipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = dcipher.doFinal(cipher);
        return decrypted;
    }  
}

/*
DES algorithm :

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DES 
{
    SecretKey key;
    DES(byte []  KEY) throws Exception
    {
        key = readKey(KEY);
    }

    public SecretKey readKey(byte[] rawkey) throws Exception
    {
         DESKeySpec keyspec = new DESKeySpec(rawkey);
         SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("DES");
         SecretKey key = keyfactory.generateSecret(keyspec);
         return key;
    }

    public byte[] encrypt(byte[] plain ) throws Exception
    {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plain);
        return encrypted;
    }
    public byte[] decrypt(byte[] cipher ) throws Exception
    {
        Cipher dcipher = Cipher.getInstance("DES");
        dcipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = dcipher.doFinal(cipher);
        return decrypted;
    }  
}
*/



//USEAGE

/*
public class Cryptography 
{
    Cryptography() {}

    public byte[] Encryption_AES128(byte[] plain  , byte[] key) throws Exception
    {
        AES128 aes128 = new AES128();
        return aes128.encrypt(key, plain);
    }
    public byte[] Decryption_AES128(byte[] cipher  , byte[] key) throws Exception
    {
        AES128 aes128 = new AES128();
        return aes128.decrypt(key, cipher);
    }

    public byte[] Encryption_DES(byte[] plain  , byte[] key) throws Exception
    {
        DES des = new DES(key);
        return des.encrypt(plain);
    }
    public byte[] Decryption_DES(byte[] cipher  , byte[] key) throws Exception
    {
        DES des = new DES(key);
        return des.decrypt(cipher);
    }

    public byte[] Encryption_TripleDES(byte[] plain  , byte[] key) throws Exception
    {
        TripleDES Tdes = new TripleDES(key);
        return Tdes.encrypt(plain);
    }
    public byte[] Decryption_TripleDES(byte[] cipher  , byte[] key) throws Exception
    {
        TripleDES Tdes = new TripleDES(key);
        return Tdes.decrypt(cipher);
    }
}
*/

/*
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AES128 
{
    private byte[] getRawKey(byte[] seed) throws Exception 
    {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        sr.setSeed(seed);
        kgen.init(128, sr); // 192 and 256 bits may not be available
        SecretKey skey = kgen.generateKey();
        byte[] raw = skey.getEncoded();
        return raw;
    }

    public byte[] encrypt(byte[] raw, byte[] clear) throws Exception 
    {
        SecretKeySpec skeySpec = new SecretKeySpec(getRawKey(raw), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(clear);
        return encrypted;
    }

    public byte[] decrypt(byte[] raw, byte[] encrypted) throws Exception 
    {
        SecretKeySpec skeySpec = new SecretKeySpec(getRawKey(raw), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] decrypted = cipher.doFinal(encrypted);
        return decrypted;
    }
}
*/