package MarioCarExampleEnum.Question;

public abstract class DriverStrategy {
    public abstract void accelerate();
    public abstract void steer();
    public abstract void brake();

    protected Car car;

    public DriverStrategy(Car car){
        this.car = car;
    }

    protected void print(String msg){
        System.out.println(car.getDriver().getName() + ": " + msg);
    }
}
