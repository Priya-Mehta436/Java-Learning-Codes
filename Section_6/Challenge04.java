package Section_6;

public class Challenge04 {
     public static boolean isPalindrome(int number) {
        
        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
}
