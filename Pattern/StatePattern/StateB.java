package StatePattern;

public class StateB extends DFAState{
    private DFARunner dfaRunner;
    public StateB(DFARunner dfaRunner){
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
         System.out.println("B State");
        dfaRunner.setState(new StateC(dfaRunner));
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
