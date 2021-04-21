package com.mycompany.formularzdaneosobowe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtils {
    private String file_name = "formularz_dane.txt";
    
    public void saveToFile(String text){
        try{
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text+"\n");
            fw.close();
        }catch(IOException ex){
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}