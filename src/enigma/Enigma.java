/*
 *
 * 
 * 
 */
package enigma;

/**
 *
 * @author Abhishek Balam
 */


import javax.swing.*;//JFrame;
public class Enigma {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws InterruptedException{
      try{
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
      catch(Exception e){
          throw new RuntimeException(e);
      }
        //JFrame WS = new WelcomeScreen("Welcome",800,600);
      Welcome.main(null);
    }
    
}
