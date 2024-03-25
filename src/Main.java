
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setText("MyClass Text");
        myClass.setNumber(1);

        System.out.println(myClass.getText());
        System.out.println(myClass.getNumber());

        Engine engine1 = new Engine();
        engine1.setCapacity(2000);
        engine1.setPower(200);
        Engine engine2 = new Engine();
        engine2.setCapacity(2200);
        engine2.setPower(260);

        Car car1 = new Car();
        car1.setName("BMW");
        car1.setMaxSpeed(200);
        car1.setEngine(engine1);

        Car car2 = new Car();
        car2.setName("Audi");
        car2.setMaxSpeed(220);
        car2.setEngine(engine2);
        System.out.println("Car 1 " + car1.getName());
        System.out.print("Ma moc ");
        car1.getEngine().getPowerCar();
        System.out.println("Oraz pojemność ");
        car1.getEngine().getCapacityCar();
        System.out.println("Car 2 " + car2.getName());
        System.out.print("Ma moc ");
        car2.getEngine().getPowerCar();
        System.out.println("Oraz pojemność ");
        car2.getEngine().getCapacityCar();
    }
}