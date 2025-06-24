package Section_5;

import java.util.Scanner;

public class Challenge10 {
     public static void main(String[] args) {
          
         
          Scanner sc = new Scanner(System.in);
          System.out.print("\n\nEnter the number of minutes: ");

          printYearsAndDays(sc.nextLong());
          sc.close();
          System.out.println();
     }
     public static void printYearsAndDays (long minutes) {
          if (minutes < 0) {
               System.out.println("Invalid Value");

          } else {
               System.out.print("\n" + minutes + " min = ");
               long years = minutes / (60 * 24 * 365); 

               System.out.print(years + " y and "); 
               long days = ((minutes - (years * 60 * 24 * 365)) / (60 * 24)); 
               System.out.print(days + " d"); 
          }
     }
}