package Section_6;

public class Challenge06 {
    public static int getEvenDigitSum (int number)
    {
        if (number < 0){
            return -1;
        }
    int sum = 0;
    for (int i = number; i > 0  ; i/=10 ){
        int lastDigit = i % 10;
        if (lastDigit % 2 == 0){
            sum += lastDigit;
        }
    }
        return sum;
    }
    
}
