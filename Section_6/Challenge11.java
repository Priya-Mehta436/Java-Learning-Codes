package Section_6;

public class Challenge11 {
    public static boolean isPerfectNumber (int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number ; i++ ) {
            if(number % i == 0){
            sum +=i;
            }
        }
        return sum ==number;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); 
        System.out.println(isPerfectNumber(28)); 
        System.out.println(isPerfectNumber(5)); 
        
    }
    
}
