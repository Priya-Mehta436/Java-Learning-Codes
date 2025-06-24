package Section_5;

public class Challenge03 {

     public static void printMegaBytesAndKiloBytes(int kiloBytes) {
          if (kiloBytes < 0) {
               System.out.println("Invalid Value");
          } else {
               System.out.print(kiloBytes + " KB = ");
               int megabytes = kiloBytes/1000;
               kiloBytes -= (megabytes*1000);
               System.out.println(megabytes + " MB and " + kiloBytes + " KB");
          }
     }
}
