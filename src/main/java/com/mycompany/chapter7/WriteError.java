
package com.mycompany.chapter7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class WriteError {

  
    public static void main(String[] args) {
        
    
    try {
            
            boolean errorOccur = true;
        
            if (errorOccur) {
                FileWriter file = new FileWriter("errorLog.txt",true);
            
                BufferedWriter buffer=  new
                BufferedWriter(file);
            
                LocalDateTime date = LocalDateTime.now();
            
                String errorMsg = "XYZ error occured at "+ date;
            
            
                buffer.write(errorMsg);
                buffer.newLine();

            
                buffer.close();
            
                 System.out.println("system error logged");
            } //end if
        
            
        } //end try
        catch (IOException e) {
            System.out.println("A write error has occured!");
       } //end catch
        
    } //end main
    
} //end class
