public class Car {
    private Colour colour;
    private Engine engine;
    private String name;
    private int maxSpeed;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Car " +
                " colour = " + colour +
                ", engine = " + engine +
                ", name = " + name + '\'' +
                ", maxSpeed = " + maxSpeed;
    }
}
