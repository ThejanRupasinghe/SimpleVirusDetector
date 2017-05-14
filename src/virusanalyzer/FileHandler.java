/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusanalyzer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author thejan
 */
public class FileHandler {
    
    
    public boolean readVirusDefinition(){
        
        /** This method reads the file that includes virus definitions
            (md5 checksum values of identified viruses) and returns an 
            ArrayList of them **/
        
        //to the virusDef.txt file in the VirusAnalyzer_140536K folder
        String file_name = "virusDef.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(file_name))) {
            
            String line = br.readLine();

            while (line != null) {
                String[] lineArray = line.split("\\|");
                VirusAnalyzer.virusDefinitions.add(lineArray[1]);
                VirusAnalyzer.virusNames.add(lineArray[2]);
                VirusAnalyzer.virusTypes.add(lineArray[3]);
                line = br.readLine();
            }
                        
            br.close();
            
        } catch(FileNotFoundException e) {
            return false;
        } catch(IOException e){
            System.out.println("IO Exception in FileHandler");
            return false;
        }
        
        return true;
    }
}
