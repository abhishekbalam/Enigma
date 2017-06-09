package Useful;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abhishek Balam
 */

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.KeyStore.PasswordProtection;
import java.util.Base64;

/**
 * Created by  on 05/11/14.
 */
public class keyStore {
    public static void main(String[] args) throws Exception {
        final String keyStoreFile = "output/javacirecep.keystore";
        KeyStore keyStore = createKeyStore(keyStoreFile, "javaci123");

        // generate a secret key for AES encryption
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
        System.out.println("Stored Key:\t" + base64String(secretKey));

        // store the secret key
        KeyStore.SecretKeyEntry keyStoreEntry = new KeyStore.SecretKeyEntry(secretKey);
        PasswordProtection keyPassword = new PasswordProtection("pw-secret".toCharArray());
        keyStore.setEntry("mySecretKey", keyStoreEntry, keyPassword);
        keyStore.store(new FileOutputStream(keyStoreFile), "javaci123".toCharArray());

        // retrieve the stored key back
        KeyStore.Entry entry = keyStore.getEntry("mySecretKey", keyPassword);
        SecretKey keyFound = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        System.out.println("Found Key:\t" + base64String(keyFound));
    }

    private static String base64String(SecretKey secretKey) {
        return new String(Base64.getEncoder().encode(secretKey.getEncoded()));
    }

    private static KeyStore createKeyStore(String fileName, String pw) throws Exception {
        File file = new File(fileName);

        final KeyStore keyStore = KeyStore.getInstance("JCEKS");
        if (file.exists()) {
            // .keystore file already exists => load it
            keyStore.load(new FileInputStream(file), pw.toCharArray());
            System.out.println("Existing .keystore file loaded!");
        } else {
            // .keystore file not created yet => create it
            keyStore.load(null, null);
            keyStore.store(new FileOutputStream(fileName), pw.toCharArray());
            System.out.println("New .keystore file created!");
        }

        return keyStore;
    }
}