package StatePattern.DFA;

public class StateStart extends DFAState {
    
    @Override
    public void transition(DFARunner dfa, char input) {
        System.out.println("Inside Start");
        if (input == '0') {
            dfa.setCurrentState(new StateA());
        } else if (input == '1') {
            dfa.setCurrentState(new StateStop());
        } else {
            System.out.println("Invalid input in State C.");
        }
    }
}

    

