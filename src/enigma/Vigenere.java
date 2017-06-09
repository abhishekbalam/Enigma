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
public class Vigenere {
  public String Msg="";
  
    Vigenere(String msg,String Key,int mode){
         if (mode%2==0){
            Msg=encrypt(msg,Key);
            VigenereUI.textArea2.setText(Msg);
        }
        else if(mode%2==1){
            Msg=decrypt(msg,Key);
            VigenereUI.textArea2.setText(Msg);
        }
    }

 
    static String encrypt(String text, String key) {
        String res = "";
        text = text.toUpperCase();
        key= key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') {
                res += (char)(c);
                continue;
                }
            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
 
    static String decrypt(String text, String key) {
        String res = "";
        text = text.toUpperCase();
        key= key.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') {
                res += (char)(c);
                continue;
            }
            else{
            res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            j++;
            }
            j = (j % key.length());
            
        }
        return res;
    }
    
        public static void main(String[] args) {
            
        /*String key = "VIGENERECIPHER";
        String ori = "Beware the Jabberwock, my son! The jaws that bite, the claws that catch!";
        String enc = encrypt(ori, key);
        System.out.println(enc);
        System.out.println(decrypt(enc, key));*/
    
        }
}  

