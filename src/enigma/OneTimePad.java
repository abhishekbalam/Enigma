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
import java.util.Random;

public class OneTimePad {
    private String Msg="";
    private String Key=""; 
    private String dKey="";
    
    public OneTimePad(String msg,String dKey,int mode){
          Key = genKey(msg.length());
            if (mode%2==0){
              Msg=encrypt(msg,Key);
              OneTimePadUI.padField.setText(Key);
              OneTimePadUI.result.setText(Msg);
              }
            else if(mode%2==1){
              Msg=decrypt(msg,dKey);
              OneTimePadUI.result.setText(Msg);
              }  
        }
    
        public String encrypt(String message, String key) {
                if (message.length() != key.length()) error("Lengths must be equal");
                int[] im = charArrayToInt(message.toCharArray());
                int[] ik = charArrayToInt(key.toCharArray());
                int[] data = new int[message.length()];
                
                for (int i=0;i<message.length();i++) {
                        data[i] = im[i] + ik[i];
                }
                
                return new String(intArrayToChar(data));
        }
        
        public String decrypt(String message, String key) {
                if (message.length() != key.length()) error("Lengths must be equal");
                int[] im = charArrayToInt(message.toCharArray());
                int[] ik = charArrayToInt(key.toCharArray());
                int[] data = new int[message.length()];
                
                for (int i=0;i<message.length();i++) {
                        data[i] = im[i] - ik[i];
                }
                
                return new String(intArrayToChar(data));
        }
        
        public String genKey(int length) {
                Random rand = new Random();
                char[] key = new char[length];
                for (int i=0;i<length;i++) {
                        key[i] = (char) rand.nextInt(132);
                        if ((int) key[i] < 97) key[i] = (char) (key[i] + 72);
                        if ((int) key[i] > 122) key[i] = (char) (key[i] - 72);
                }
                
                return new String(key);
        }
        
        public static void main(String[] args){
               /* OneTimePad otp = new OneTimePad();
                String message = "hello";
                String key = otp.genKey(message.length());
                String enMessage = otp.encrypt(message, key);
                String deMessage = otp.decrypt(enMessage, key);
                
                System.out.println("Message: "+message);
                System.out.println("Key: "+key);
                System.out.println("Encrypted Message: "+enMessage);
                System.out.println("Decrypted Message: "+deMessage);
                */
        }
        
        private int chartoInt(char c) {
                return (int) c;
        }
        
        private char intToChar(int i) {
                return (char) i;
        }
        
        private int[] charArrayToInt(char[] cc) {
                int[] ii = new int[cc.length];
                for(int i=0;i<cc.length;i++){
                        ii[i] = chartoInt(cc[i]);
                }
                return ii;
        }
        
        private char[] intArrayToChar(int[] ii) {
                char[] cc = new char[ii.length];
                for(int i=0;i<ii.length;i++){
                        cc[i] = intToChar(ii[i]);
                }
                return cc;
        }
        
        private void error(String msg) {
                System.out.println(msg);
                System.exit(-1);
        }
}