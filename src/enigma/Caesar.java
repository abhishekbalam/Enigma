/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

 import java.util.*;
/**
 *
 * @author ABHISHEK
 */
public class Caesar {

    /**
     * @param args the command line arguments
     */
    public static String  eMsg= new String("");
    public static String  dMsg= new String("");
   
    
    Caesar(String msg , int Shift, int mode){
       if (mode%2==0){
            eMsg=encrypt(msg,Shift);
            CaesarUI.textArea2.setText(eMsg);
        }
        else if(mode%2==1){
            dMsg=decrypt(msg,Shift);
            CaesarUI.textArea2.setText(dMsg);
        }
    }
        
        public static String encrypt (String Msg, int shift)
    {
        String encryptedMessage= new String();
        
        Msg  = Msg.toUpperCase();
        
        for (int i=0;i<Msg.length();i++){
            char ch=Msg.charAt(i);
            
            if(ch>='A'&&ch<='Z'){
                int oldP =ch-'A';
                int newP=(oldP+shift)%26;
                encryptedMessage=encryptedMessage +(char)(newP + 'A');
            }
            else{
                encryptedMessage=encryptedMessage+(char)(ch);
            }
        }
        return encryptedMessage;
    }

public static String decrypt (String encryptedMessage, int shift)
    {
        String decryptedMessage= new String();
        
       encryptedMessage= encryptedMessage.toUpperCase();
        
        for (int i=0;i<encryptedMessage.length();i++){
            char ch=encryptedMessage.charAt(i);
            if(ch>='A'&&ch<='Z'){
                int oldP =ch - 'A';
                int newP = oldP-shift;
                if(newP<0){
                    newP=newP+26;
                }
                decryptedMessage=decryptedMessage +(char)(newP+'A');
               }
            else{
                decryptedMessage=decryptedMessage+(char)(ch);
            }
           
        }
        return decryptedMessage;
    }

 public static void main(String[] args) {
   /* Scanner input = new Scanner(System.in);
    System.out.println("Enter the message:");
    String msg= new String();
    msg=input.nextLine();
    int shift;
    System.out.println("Enter the shift value");
    shift=input.nextInt();
    System.out.println("The Encrypted message is :   "+encrypt(msg,shift));
    System.out.println("Press Enter to decrypt again");
    input.next();
    System.out.println("The Decrypted message is :   "+decrypt(encrypt(msg,shift),shift));
    */
 }


}