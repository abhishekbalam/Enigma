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

public class Atbash {
    private String Mesg="";
    
    public Atbash(String msg, int mode){
         if (mode%2==0){
            Mesg=process(msg);
            AtbashUI.TextArea2.setText(Mesg);
        }
        else if(mode%2==1){
            Mesg=process(msg);
            AtbashUI.TextArea2.setText(Mesg);
        }  
        }    

    public static String process( String message ) {
        StringBuilder decoded = new StringBuilder();
 
        for( char c : message.toUpperCase().toCharArray()) {
            if(Character.isLetter(c)) {
                int newChar = ('Z' - c) + 'A';
                decoded.append((char) newChar);
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }

}
