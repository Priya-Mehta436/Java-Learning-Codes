package Section_5;

import java.util.Scanner;

public class Challenge05 {

  
     public static boolean isLeapYear(int year) {
          if (year >= 1 && year <= 9999) {
               if ((year % 4.0 == 0) && (year % 100.0 != 0)) {
                    return true;
               }
               if (year % 100.0 == 0) {
                    if (year % 400.0 == 0) {
                         return true;
                    }
                    return false;
               }
               return false;

          } else {
               return false;
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the number you need to check: ");
          int year = sc.nextInt();

          if (isLeapYear(year)) {
               System.out.println("This is a leap year!");
          } else {
               System.out.println("This is not a leap year!");
          }
          sc.close();
     }
}