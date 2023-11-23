public class ActuatorException extends HardwareException {
    HardwareState hw_state;
    public ActuatorException(HardwareState new_s){
        super();
        hw_state= new_s;
    }
    public String toString(){
        return this.exc_time+":"+this.getClass()+":"+this.hw_state.name();
    }
}
