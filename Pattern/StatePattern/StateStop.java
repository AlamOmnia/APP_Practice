package StatePattern;

public class StateStop extends DFAState{
    private DFARunner dfaRunner;
    public StateStop(DFARunner dfaRunner){
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
     printInvalidCommandMessage();
    }

    @Override
    public void stop() {
          System.out.println("End State");
        dfaRunner.setState(new StateStart(dfaRunner));
    }
}
