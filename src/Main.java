
public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.power = 100;
        engine1.capacity = 1000;
        Engine engine2 = new Engine();
        engine2.power = 200;
        engine2.capacity = 2000;

        Car car = new Car();
        Car car2 = new Car();

        car.name = "BMW";
        car.maxSpeed = 200;
        car2.name = "Audi";
        car2.maxSpeed = 220;
        System.out.println(car.name);
        System.out.println(car2.name);


    }
}