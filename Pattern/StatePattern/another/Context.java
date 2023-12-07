package StatePattern.another;

public class Context {
    private State state;
    public State getState() {
        return state;
    }
    public Context(){
        this.state=null;
    }
    public void setState(State state){
        this.state=state;
    }
    public void request(){
        state.doAction(this);
    }
}
