package Section_5;

import java.util.Scanner;

public class Challenge09 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println();
  
          System.out.print("Please enter the radius of the circle: ");
          System.out.println("The area of the circle is " + area(sc.nextDouble()));
          System.out.println("\n");

          System.out.print("Please enter the length of the rectangle: ");
          double length = sc.nextDouble();
          System.out.print("Please enter the width of the rectangle: ");
          double width = sc.nextDouble();
          System.out.println("The area of the rectangle is " + area(length, width));
          
          System.out.println();
          sc.close();
     }

     public static double area (double radius) {
          if (radius < 0) {
               return -1.0;
          } else {
               return (radius * radius * (22.0/7.0));
          }
     }

     public static double area (double x, double y) {
          if ((x < 0) || (y < 0)) {
               return -1.0;
          } else {
               return x * y;
          }
     }
}
    

