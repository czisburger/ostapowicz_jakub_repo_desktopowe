package com.mycompany.jakubostapowiczrejestracjalogowanie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jakub Ostapowicz
 */
public class FileUtils {
    private String file_name = "dane.csv";
    String[] column;
    String line = "";
    
    public void saveToFile(String text){
        try{
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text+"\n");
            fw.close();
        }catch(IOException ex){
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void readFromFile(){
        String path = "dane.csv";
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                column = line.split(";");
            }
            
            
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
    }
}
