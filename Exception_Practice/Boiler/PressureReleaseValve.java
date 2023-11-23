import java.util.Random;

public class PressureReleaseValve {
    private ActuatorState act_state;
    private HardwareState hw_State;
    private Random randomGenerator;
 public ActuatorState getAct_state() {
        return act_state;
    }
    public void setAct_state(ActuatorState act_state) {
        this.act_state = act_state;
    }
    public HardwareState getHw_State() {
        return hw_State;
    }
    public void setHw_State(HardwareState hw_State) {
        this.hw_State = hw_State;
    }
    public Random getRandomGenerator() {
        return randomGenerator;
    }
    public void setRandomGenerator(Random randomGenerator) {
        this.randomGenerator = randomGenerator;
    }
public PressureReleaseValve(HardwareState new_s){
    this.hw_State= new_s;

    //manually closing actuator
    this.act_state= ActuatorState.closed;
    this.randomGenerator= new Random();
 }
  //checks valves before close
 public void close() throws StuckValveException{
    if(randomGenerator.nextInt(100)<=2){
        hw_State= HardwareState.stuck;
    }
    if(hw_State== HardwareState.stuck&& act_state== ActuatorState.closed){
        throw new StuckValveException(hw_State);

    }
 }
 //checks valves before open

 public void open() throws StuckValveException{
    if(randomGenerator.nextInt(100)<=2){
        hw_State=HardwareState.stuck;
    }
    if(hw_State==HardwareState.stuck&& act_state==ActuatorState.closed){
        throw new StuckValveException(hw_State);
    }

 }
 }

