package Question;

public class NegativeSensorExpecption extends SensorException{

    public NegativeSensorExpecption(Object value) {
        super("Negative Sensor Value:"+value, value);
        
    }
    public String toString(){
        return super.getMessage();
    }
    
}
