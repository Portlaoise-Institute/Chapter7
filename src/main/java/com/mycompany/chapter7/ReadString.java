
package com.mycompany.chapter7;
import java.io.*;

public class ReadString {

  
    public static void main(String[] args) {
     
        //prompt user for input
        System.out.print("Enter the title"
                + " of this book: ");
        
        //Create an InputStreamReader Object
        //to read bytes from command line
        InputStreamReader isr = 
                new InputStreamReader(System.in);
        
        //Create a BufferedReader object to
        //read the decoded input
        BufferedReader buffer = 
                new BufferedReader(isr);
        
        //String to store the input
        String input="";
        
        //Read input from the command line
        // and store in the variable
        
        try {
            input = buffer.readLine();
            buffer.close();
        }
        catch (IOException e){
            System.out.println("Input Error");
        }
        
        
        System.out.println("Thanks you are reading "+
                input);
        
        
        
        
               
    }

}
