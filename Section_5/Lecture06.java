package Section_5;

public class Lecture06 {

     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

          int finalScore = score; 
          if (gameOver) {
               finalScore += (levelCompleted * bonus);
               return finalScore; 
          }
          return -1; 
     }
     public static void main(String[] args) {
          
        
          boolean gameOver = true;
          int score = 800;
          int levelCompleted = 5;
          int bonus = 100;
          
          System.out.println("This is the first method of calculating scores");
          System.out.println("The score is " + calculateScore(gameOver, score, levelCompleted, bonus));
     }
}