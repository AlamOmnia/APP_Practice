package StatePattern;

public class StateStop extends DFAState{
    @Override
    public void transition(DFARunner dfa, char input) {
        // No transitions from Stop state
        System.out.println("DFA stopped.");
    }
}


