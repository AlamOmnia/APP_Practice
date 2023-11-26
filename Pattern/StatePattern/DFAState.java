package StatePattern;

public abstract class DFAState {
    private DFARunner dfaRunner;
    public DFAState(DFARunner dfaRunner){
        this.dfaRunner=dfaRunner;
    }
    public abstract void start();
    public abstract void stateA();
    public abstract void stateB();
    public abstract void stateC();
    public abstract void stateD();
    public abstract void stop();
    // methods common to all states
public void printInvalidCommandMessage() {
    System.out.println("Invalid command in state "
    + this.getClass().getSimpleName() );
    }
}
