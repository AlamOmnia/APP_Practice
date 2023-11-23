package Question;

public class SensorException extends Exception{
    private Object value;
    public SensorException(String msg,Object value){
        super(msg);
        value=value;
    }

    public String toString(){
        return "Pressure Sensor value: "+value;
    }
}
