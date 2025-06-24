package Section_5;

public class Lecture07 {
   
     public static void displayHighScoreposition ( String playerName, int playerPosition) {
          System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
     }

    
     public static int calculateHighScoreposition (int playerScore) {
          if (playerScore >= 1000) {
               return 1;
          } else if ((playerScore >= 500 ) & (playerScore < 1000)) {
               return 2;
          } else if ((playerScore >= 100) && (playerScore < 500)) {
               return 3;
          } else {
               return 4;
          }
     }

    
     public static void answers (int score) {
          int position = calculateHighScoreposition(score);
          displayHighScoreposition("Harsh", position);
     }
     public static void main(String[] args) {
          
        answers(1500);
        answers(1000);
        answers(500);
        answers(100);
        answers(25);
     }

    
}
