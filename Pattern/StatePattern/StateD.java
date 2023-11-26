package StatePattern;

public class StateD extends DFAState{
    private DFARunner dfaRunner;
    public StateD(DFARunner dfaRunner){
        this.dfaRunner=dfaRunner;
    }
    @Override
    public void start() {
        printInvalidCommandMessage();
    }

    @Override
    public void stateA() {
       printInvalidCommandMessage();
    }

    @Override
    public void stateB() {
     printInvalidCommandMessage();  
    }

    @Override
    public void stateC() {
        printInvalidCommandMessage();
    }

    @Override
    public void stateD() {
        System.out.println("D State");
        dfaRunner.setState(new StateStop(dfaRunner));
    }

    @Override
    public void stop() {
       printInvalidCommandMessage();
    }
}
