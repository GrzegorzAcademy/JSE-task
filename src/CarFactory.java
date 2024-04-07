import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarFactory {
    Car car;
    Scanner sc = new Scanner(System.in);

    public Car[] carTable(int number) {
        Car[] car = new Car[number];
        for (int i = 0; i < car.length; i++) {
            System.out.println("podaj nazwe samochodu");
            try {
               String name = sc.nextLine();
                car[i] = new Car(name);
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawny format");
            }
        }
        return car;
    }
}