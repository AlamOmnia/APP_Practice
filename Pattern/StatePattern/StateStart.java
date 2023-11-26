package StatePattern;

public class StateStart extends DFAState{
    private DFARunner dfaRunner;
    public StateStart(DFARunner dfaRunner){
        super(dfaRunner);
    }
    @Override
    public void start() {
        System.out.println("Start State");
        dfaRunner.setState(new StateA(dfaRunner));
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
        printInvalidCommandMessage();
    }

    @Override
    public void stop() {
       printInvalidCommandMessage();
    }
    
}
