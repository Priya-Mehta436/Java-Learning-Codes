package Section_5;

public class Lecture17 {
    public static void main(String[] args) {

        System.out.println("5ft, 5in = " + convertToCentimeters(5, 5) + "cm");
        System.out.println("89in = " + convertToCentimeters(89) + "cm");
    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
     }
}
