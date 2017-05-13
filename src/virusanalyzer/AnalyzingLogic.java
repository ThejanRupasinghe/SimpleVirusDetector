/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virusanalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author thejan
 */
public class AnalyzingLogic {
    
    
    public String md5Generator(String file_path){
        
        /** This method generates and returns the md5 checksum value 
            of any file located at the given file_path **/
        
        String md5Checksum=null;
        
        try{
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(Files.readAllBytes(Paths.get(file_path)));
            byte[] digest = md.digest();
            md5Checksum = DatatypeConverter.printHexBinary(digest).toLowerCase();
            
        }catch (NoSuchAlgorithmException e){
            System.out.println("Algorithm Exception");
        }catch (IOException e){
            System.out.println("IO Exception");
        }
        
        return md5Checksum;
    }
    
    public boolean analyze(String fileChecksum, ArrayList<String> virusDefinitions){
        
        boolean isVirus = false;
        
        for(int i=0;i<virusDefinitions.size();i++){
            if(fileChecksum.equals(virusDefinitions.get(i))){
                isVirus = true;
                return isVirus;
            }
        }
        
        return false;
    }
    
}
