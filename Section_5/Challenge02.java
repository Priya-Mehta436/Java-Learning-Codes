package Section_5;

public class Challenge02 {
     public static long toMilesPerHour(double kilometersPerHour) {
          if (kilometersPerHour > 0) {
               double answer = kilometersPerHour * 0.621371;
               return Math.round(answer);
          } else {
               return -1;
          }
     }
    
     public static void printConversion(double kilometersPerHour) {
          if (kilometersPerHour < 0) {
               System.out.println("Invalid Value");
          } else {
               System.out.println(kilometersPerHour + " km/h = " + (kilometersPerHour * 0.621371) + " mi/h");
          }
     }
     public static void main(String[] args) {
          
        System.out.println(toMilesPerHour(10.25));
        printConversion(10.25);

     }
}
