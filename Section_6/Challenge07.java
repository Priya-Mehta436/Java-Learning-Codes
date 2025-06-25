package Section_6;

public class Challenge07 {
    public static boolean hasSharedDigit(int first, int second) {

        boolean isFirstValid = (first >= 10 && first <= 99);
        boolean isSecondValid = (second >= 10 && second <= 99);

        if (!isFirstValid || !isSecondValid) {
            return false;
        }

        int firstEndDigit = first % 10;
        int firstStartDigit = first / 10;

        int secondEndDigit = second % 10;
        int secondStartDigit = second / 10;

        boolean sharedWithFirstStart = (firstStartDigit == secondStartDigit || firstStartDigit == secondEndDigit);

        boolean sharedWithFirstEnd = (firstEndDigit == secondStartDigit || firstEndDigit == secondEndDigit);

        return sharedWithFirstStart || sharedWithFirstEnd;
    }
}
    

