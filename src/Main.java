import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMaxSpeed(200);
        car1.setName("Audi");
        Car car2 = new Car();
        car2.setMaxSpeed(220);
        car2.setName("BMW");

        getNameFasterCar(car1, car2);
    }

    private static void getNameFasterCar(Car car1, Car car2) {
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            car1.setName("Faster car");

        } else if (car1.getMaxSpeed() < car2.getMaxSpeed()) {
            car2.setName("Faster car");
        }
        System.out.println(car1.getName());
        System.out.println(car2.getName());
    }
}