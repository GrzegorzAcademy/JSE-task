public class Engine {
    private Integer power;

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    private Integer capacity;

    public Integer getPower() {
        return power;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void getCapacityCar() {
        System.out.println(capacity);
    }

}
