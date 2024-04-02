import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Engine engine = new Engine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj marke");
        car1.setName(sc.nextLine());
        System.out.println("podaj moc");
        engine.setPower(sc.nextInt());
        car1.setEngine(engine);
        System.out.println("Car name " + car1.getName());
        System.out.println("Engine Power");
        car1.getEngine().getPowerCar();

    }
}
