package Question;

public class OverloadSensorException extends SensorException{

    public OverloadSensorException(Object value) {
        super("Overload value"+value, value);
    }
    public String toString(){
        return super.getMessage();
    }
}
