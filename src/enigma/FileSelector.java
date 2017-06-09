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
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.io.File;


public class FileSelector {
      
    	public static File chooseFile(String description, String... extensions) {
		  try{
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                       }
                    catch(Exception e){
                        throw new RuntimeException(e);
                    }
                JFileChooser chooser = new JFileChooser();
                chooser.setDialogTitle("Choose A File To Encrypt");
                FileNameExtensionFilter filter = new FileNameExtensionFilter(description, extensions);
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile(); 
                        return selectedFile;
		} else {
                        return null;
		}
	}
}