package Section_07;

public class L02 {
    public static void main(String[] args) {
        L01_Car car = new L01_Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("brown");
        car.setConvertible(true);
        car.setDoor(3);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        car.describeCar();

        L01_Car targa = new L01_Car();
        targa.setMake("Porsche");
        targa.setModel("targa");
        targa.setColor("brown");
        targa.setConvertible(false);
        targa.setDoor(3);

        targa.describeCar();

    }
    
}
