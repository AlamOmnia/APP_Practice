package StatePattern;

public class StateC extends DFAState{
    private DFARunner dfaRunner;
    public StateC(DFARunner dfaRunner){
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
         System.out.println("C State");
        dfaRunner.setState(new StateD(dfaRunner));
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
