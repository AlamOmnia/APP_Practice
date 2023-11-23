package MarioCarExampleEnum.Question;
public class Driver {
    private DriverStrategy strategy;
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void accelerate() {
        strategy.accelerate();
    }

    public void steer() {
        strategy.steer();
    }

    public void brake() {
        strategy.brake();
    }


    public void setStrategy(DriverStrategy strategy) {
        this.strategy = strategy;
    }
public String getName(){
    return name;
}
}
