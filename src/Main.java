
public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.power = 100;
        engine1.capacity = 1000;
        Engine engine2 = new Engine();
        engine2.power = 200;
        engine2.capacity = 2000;
        System.out.println("Engine 1 power " + engine1.power);
        System.out.println("Engine 1 capacity " + engine1.capacity);
        System.out.println("Engine 2 power " + engine2.power);
        System.out.println("Engine 2 capacity " + engine2.capacity);

    }
}