package Section_5;

public class Challenge12 {
     public static void main(String[] args) {
          
     }
 
    public static boolean isCatPlaying(boolean summer, int temperature) {
        
        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}