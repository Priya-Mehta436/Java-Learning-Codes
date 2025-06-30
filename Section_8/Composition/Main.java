package Section_8.Composition;

import Section_8.Composition.Product.Motherboard;
import Section_8.Composition.Product.Monitor;
import Section_8.Composition.Product.ComputerCase;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase ("2300", "Dell", "245");
    }
    public static void main(String[] args) {
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 X 1440");
    }
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2300", "Dell", "245");
    }

    
}
