package Section_6;

public class Challenge02 {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1: 
            System.out.println("January");
            case 3: 
            System.out.println("March");
            case 5:
            System.out.println("May");
            case 7:
            System.out.println("July");
            case 8:
            System.out.println("August");
            case 10:
            System.out.println("October");
            case 12:
            System.out.println("December");
                return 31;
            case 2:
            System.out.println("February");
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4: 
            System.out.println("April");
            case 6:
            System.out.println("June");
            case 9:
            System.out.println("September"); 
            case 11:
            System.out.println("November"); 
                return 30;
            default:
                return -1;
        }
    }
}
