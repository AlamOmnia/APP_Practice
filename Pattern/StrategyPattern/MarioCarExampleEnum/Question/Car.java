package MarioCarExampleEnum.Question;
public class Car {

    private Driver driver;
    private CarState state = CarState.safe;

    public Car(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver(){
        return driver;
    }

    public void depressAcceletorPedal(ActuationLevel level) {
        switch (state) {
            case safe:
            if (level == ActuationLevel.hard){
                setState(CarState.skidding);
            }
                break;
            case skidding:
            break;
            default:
                break;
        }
    }

    public void steerWheel(ActuationLevel level) {

        switch (state) {
            case safe:
            if (level == ActuationLevel.hard){
                setState(CarState.skidding);
            }
                break;
            case skidding:
            if (level == ActuationLevel.hard){
                setState(CarState.crashed);
            }
            break;
            default:
                break;
        }
    }

    public void depressBrakePedal(ActuationLevel level) {
        //  switch (state) {
        //     case safe:
        //     if (level == ActuationLevel.hard){
        //         setState(CarState.skidding);
        //     }
        //         break;
        //     case skidding:
        //     if (level == ActuationLevel.hard){
        //         setState(CarState.crashed);
        //     }
        //     break;
        //     default:
        //         break;
        // }
        // printState();
    }

    public void setState(CarState state) {
        this.state = state;
        //printState();
    }

    public CarState getState(){
        return this.state;
    }
}
