import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Engine engine = new Engine();
        engine.setPower(2000);
        car1.setName("Audi");
        car1.setMaxSpeed(200);
        car1.setEngine(engine);
        car1.setColour(Colour.GREEN);
        System.out.println("Auto " + car1.getName() + ", O mocy " + car1.getEngine().getPower() + " KW "
                + ", Posiada kolor " + car1.getColour());

    }
}