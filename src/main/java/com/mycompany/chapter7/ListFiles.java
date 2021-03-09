
package com.mycompany.chapter7;
import java.io.*;

public class ListFiles {

  
    public static void main(String[] args) {
     
        // Create a file object to represent 
        // a directory folder named "data"
//        File dir = new File("E:/Work Tonight");
         File dir = new File("data");
        
        //output contents if folder exists
        if (dir.exists()){
            String[] files = dir.list();
            
            System.out.println(files.length + " files found");
            for (int i=0; i<files.length; i++){
                System.out.println(files[i]);
            }
        }
        else 
        {
                System.out.println("Folder not found");
        }
            
            
        }
        
    }


