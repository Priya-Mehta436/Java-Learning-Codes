package Section_6;

public class Challenge10 {
     public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int smallerNumber = Math.min(first, second);

        int gcd = 1;

        for (int j = 1; j <= smallerNumber; j++) {
            if (first % j == 0 && second % j == 0) {
                gcd = j;
            }
        }

        return gcd;
    }
}

