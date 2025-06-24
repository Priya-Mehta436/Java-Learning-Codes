package Section_6;

public class Lecture02 {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
              System.out.println("Was a 3, a 4, or a 5"); 
              System.out.println("Actually it was a " + switchValue); 
            } 

            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
            
        }
        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    //Traditonal Switch Statement
    /*public static String getQuarter(String month) {

        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "3rd";  

        }
        
        return "bad";
    }
    */

    //Enhanced switch expression
     public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st";}
            case "APRIL", "MAY","JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";  
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;


            }

        };
    }
}


