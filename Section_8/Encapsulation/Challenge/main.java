package Section_8.Encapsulation.Challenge;

public class main {
    public static void main(String[] args) {

        printer printer = new printer(50, false);
        System.out.println("intial page count = " + printer.getPagesPrinted());

        int pagesPrinted =  printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted =  printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
        
    }
    
}
