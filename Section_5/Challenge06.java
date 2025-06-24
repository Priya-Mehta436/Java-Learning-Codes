package Section_5;

public class Challenge06 {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
          return (((long)(num1 * 1000)) == ((long)(num2 * 1000)));
     }
     public static void main(String[] args) {
          boolean isTrue = areEqualByThreeDecimalPlaces(1.787, 1.787);
          System.out.println(isTrue);
     }
}
