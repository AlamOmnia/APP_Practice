public class SensorException extends HardwareException{
    int valueRead;
    
    public SensorException(int new_v){
        super();
        valueRead= new_v;
    }

    public String toString(){
        return this.exc_time+":"+this.getClass()+":"+valueRead;
    }

}
