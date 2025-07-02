package Section_8.Composition;

//MONITOR
class Monitor extends Product { 
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer){
        super(model, manufacturer);
    }
    public Monitor(String model, String manufacturer, int size , String resolution){
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAt (int x, int y, String color){
        System.out.println(String.format(
            "Drawing pixel at %d, %d in color is", x, y, color
            ));
    
    }
}

//MOTHERBOARD
class Motherboard extends Product { 
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer){
        super(model, manufacturer);
    }
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + "is now loading....");
    }

}

class ComputerCase extends Product {
    private String powerSupply; 

    public ComputerCase(String model, String manufacturer){
        super(model, manufacturer);
    }
    public ComputerCase(String model, String manufacturer, String powerSupply){
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power Button pressed");
    }
     }
