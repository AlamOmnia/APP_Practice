package StatePattern.DFA;

public class StateStop extends DFAState{
    @Override
    public void transition(DFARunner dfa, char input) {
        System.out.println("DFA stopped.");
    }
}


