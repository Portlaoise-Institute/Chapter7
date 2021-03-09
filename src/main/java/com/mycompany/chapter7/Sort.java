package com.mycompany.chapter7;
import java.util.*;

public class Sort {

  
    public static void main(String[] args) {
     
        //Create two unsorted lists 
        String[] names = {"Mike", "Dave", "Andy"};
        int[] nums = {200, 300, 100};
        
        //Output the contents of each list 
        display(names);
        display(nums);
        
        //Sort the element contents 
        //of both arrays
        Arrays.sort(names);
        Arrays.sort(nums);
        
        //Output the contents of each list 
        //after being sorted 
        display(names);
        display(nums);
        
        
        
    }//main

    public static void display(String[] elems)
    {
        System.out.println("\nString Array: ");
        for (int i =0; i<elems.length; i++ )
        {
            System.out.println("Element "+i+ " is "+
                    elems[i]);
        }//for
        
    }//display
    
    
     public static void display(int[] elems)
    {
        System.out.println("\nInteger Array: ");
        for (int i =0; i<elems.length; i++ )
        {
            System.out.println("Element "+i+ " is "+
                    elems[i]);
        }//for
        
    }//display
    
    
    
    
    
} //class
