package Section_6;

public class Challenge05 {
     public static int sumFirstAndLastDigit(int number)
    {
        if(number < 0){
            return -1;
        }
        
      int LastDigit = number % 10;
        while(number >= 10){
            number/=10;
        }
        
        int FirstDigit = number;
        
        return FirstDigit + LastDigit;
        
    }
}
