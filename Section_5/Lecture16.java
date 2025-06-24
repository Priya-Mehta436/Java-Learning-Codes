package Section_5;

public class Lecture16 {
    public static void main(String[] args) {
          System.out.println("New score is " + calculateScore("abc", 500));
          System.out.println("New Score for the unnamed player is " + calculateScore(200));
          System.out.println("New Score for the unnamed player is " + calculateScore(200));
     }

    
     public static int calculateScore(String playerName, int score) {
          System.out.println("\nPlayer " + playerName + " scored " + score + " points");
          return score * 1000;
     }

   
     public static int calculateScore(int score) {
          System.out.println("\nUnnamed player scored " + score + " points");
          return score * 1000;
     }

    
     public static int calculateScore() {
          System.out.println("\nNo player name, no player score");
          return 0;
     }
}