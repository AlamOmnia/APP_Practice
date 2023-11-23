package MarioCarExampleEnum.Question;

public class HardDriverStrategy extends DriverStrategy{

    public HardDriverStrategy(Car car) {
        super(car);
    }

    @Override
    public void accelerate() {
        car.depressAcceletorPedal(ActuationLevel.hard);
        print("Haha Eat my dust!");
        printState();
    }

    @Override
    public void steer() {
        car.steerWheel(ActuationLevel.hard);
        print("Out of my way");
        printState();
    }

    @Override
    public void brake() {
        car.depressAcceletorPedal(ActuationLevel.hard);
        print("Waaa!");
    }    

    public void printState() {
        System.out.println(car.getDriver().getName() + " Car: " + car.getState());
        }
}
