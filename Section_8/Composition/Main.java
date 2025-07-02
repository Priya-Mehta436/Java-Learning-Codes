package Section_8.Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2300", "Dell", "245");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 X 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);
       
        // thePC.getMonitor().drawPixelAt(10, 10, "red");
        // thePC.getMotherboard().loadProgram("Windows OS");
        // thePC.getComputerCase().pressPowerButton();
            thePC.powerUp();
    
    }
}
