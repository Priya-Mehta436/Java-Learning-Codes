package Section_8.Challenge38;

public class lamp {
    // write code here
    private String style;
    private boolean battery;
    private int globRating;
 
    public lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
 
    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }
 
    public String getStyle() {
        return style;
    }
 
    public boolean isBattery() {
        return battery;
    }
 
    public int getGlobRating() {
        return globRating;
    }
}
