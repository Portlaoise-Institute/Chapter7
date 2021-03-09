package com.mycompany.chapter7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dstones
 */
public class WriteFile {


    public static void main(String[] args) {
        
        try {
            
            FileWriter file = new FileWriter("tam.txt",true);
            
            BufferedWriter buffer=  new
                BufferedWriter(file);
            
//            buffer.append("This line of text should be appended");
//                buffer.newLine();
            buffer.write("The wind blew as if it had blown its last");
                buffer.newLine();
            buffer.write("The wind blew as if it had blown its last");
                buffer.newLine();
            buffer.write("The wind blew as if it had blown its last");
            
            buffer.close();
            
            System.out.println("File called tam.txt has successfully"
                    + " been created");
            
        }
        catch (IOException e) {
            System.out.println("A write error has occured!");
       }
        
        
    } //end main
    
} //end class
