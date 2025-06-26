package Section_07;

public class L01_Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Grey";
    private int doors = 2;
    private boolean convertible = false ;

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getDoor() {
        return doors;
    }
    public boolean getConvertible() {
        return convertible;
    }

    public void setMake (String make){
        if(make== null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> 
            this.make = make;  //this --> to describe itself
        
            default ->{
                this.make = "Unsupported";
            }
        }
       
    }
    public void setModel (String model){
       this.model = model;
    }
    public void setColor (String color){
       this.color = color;
    }
    public void setDoor (int doors){
       this.doors = doors;
    }
    public void setConvertible (boolean convertible){
       this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door"
         + color + " " +
         make + " " +
         model + " " +
         (convertible ? "Convertible" : "")
        );
    }   
}
