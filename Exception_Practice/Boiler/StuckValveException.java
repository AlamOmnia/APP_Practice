public class StuckValveException extends ActuatorException{
    public StuckValveException(HardwareState new_State){
        super(new_State);
    }
}
