package StatePattern;

public class StateA extends DFAState {
    private DFARunner dfaRunner;
    public StateA(DFARunner dfaRunner){
        this.dfaRunner=dfaRunner;
    }
    @Override
    public void start() {
        printInvalidCommandMessage();
    }

    @Override
    public void stateA() {
        System.out.println("A State");
        dfaRunner.setState(new StateB(dfaRunner));
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
