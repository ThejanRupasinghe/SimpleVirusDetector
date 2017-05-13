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

/**
 *
 * @author thejan
 */
public class FileHandler {
    
    
    public ArrayList virusDefinitionReader(){
        
        /** This method reads the file that includes virus definitions
            (md5 checksum values of identified viruses) and returns an 
            ArrayList of them **/
        
        String file_name = null;
        
        ArrayList<String> virusDefinitions = new ArrayList<String>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file_name))) {
            
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            
            virusDefinitions.add(sb.toString());
            
            br.close();
            
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        } catch(IOException e){
            System.out.println("IO Exception");
            return null;
        }
        
        return virusDefinitions;
    }
}
