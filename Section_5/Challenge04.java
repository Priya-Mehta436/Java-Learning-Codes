package Section_5;

import java.util.Scanner;

public class Challenge04 {
    
     public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
          if (hourOfDay < 0 || hourOfDay > 23) {
               return false;
          }
          return (barking && (hourOfDay < 8 || hourOfDay >= 23));
     }
     public static void main(String[] args) {

         
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the hours of the day: ");
          int hours = sc.nextInt();
          System.out.print("Please tell if the dog is barking: ");
          boolean barking = sc.nextBoolean();

        
          if (shouldWakeUp(barking, hours)) {
               System.out.println("Please wake up the dog is barking");
          } else {
               System.out.println("The dog is barking but you need to sleep");
          }
          sc.close();
     }
}