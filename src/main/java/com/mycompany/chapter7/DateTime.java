package com.mycompany.chapter7;
import java.time.*;

public class DateTime {
   
    public static void main(String[] args) {
        
        LocalDateTime date = LocalDateTime.now();
        
        //Output the current date and time details
        System.out.println("\nIt is now "+date);
        
        //Output individual LocalDateTime fields
        
        String fields = "\nYear:\t\t\t" + date.getYear();
        
        fields += "\nMonth:\t\t\t" + date.getMonth();
        fields += "\nMonth Number:\t\t" + date.getMonthValue();
        fields += "\nDay:\t\t\t" + date.getDayOfWeek();
        fields += "\nDay Number:\t\t" + date.getDayOfMonth();
        fields += "\nDay Number Of Year:\t" + date.getDayOfYear();
        
        fields += "\nHour (0-23):\t\t" + date.getHour();
        fields += "\nMinutes:\t\t" + date.getMinute();
        fields += "\nSecond:\t\t\t" + date.getSecond();
        
        System.out.println(fields);
        
        
    } //end main
    
} //end class
