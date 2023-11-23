package MarioCarExampleEnum.Question;
public class GentleDriverStrategy extends DriverStrategy{

    public GentleDriverStrategy(Car car) {
        super(car);
    }

    @Override
    public void accelerate() {
        car.depressAcceletorPedal(ActuationLevel.gentle);
        print("Let's go");
    }

    @Override
    public void steer() {
        car.steerWheel(ActuationLevel.gentle);
        print("Whistles gently");
    }

    @Override
    public void brake() {
        car.depressBrakePedal(ActuationLevel.gentle);
        print("Oopise");
    }
}
