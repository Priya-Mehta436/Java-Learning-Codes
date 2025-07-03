package Section_8.Challenge38;

    public class bedroom {
    // write code here
    private String name;
    private wall wall1;
    private wall wall2;
    private wall wall3;
    private wall wall4;
    private ceiling ceiling;
    private bed bed;
    private lamp lamp;
 
    public bedroom(String name, wall wall1, wall wall2, wall wall3, wall wall4, ceiling ceiling, bed bed, lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
 
    public lamp getLamp() {
        return this.lamp;
    }
 
    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
}