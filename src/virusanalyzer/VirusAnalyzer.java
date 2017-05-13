/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusanalyzer;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author thejan
 */
public class VirusAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            System.out.println("Select the file to detect for virus ");
            
            File file = fileChooser();
            String file_name = file.getName();
                        
//            String text = fh.fileReader(textFile.toString());
            AnalyzingLogic al = new AnalyzingLogic();
            al.md5Generator(file.toString());
         
        } catch (Exception ex) {
            System.out.println("IO Exception");
        }
    }
    
        public static File fileChooser(){
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select the file to detect");

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
          return chooser.getSelectedFile();
        } else {
          return null;
        }    
    }
    
}
