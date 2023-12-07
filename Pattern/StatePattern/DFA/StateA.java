package StatePattern.DFA;

public class StateA extends DFAState {
    @Override
    public void transition(DFARunner dfa, char input) {
        System.out.println("Inside State A");
        if (input == '0') {
            dfa.setCurrentState(new StateB());
        } else if (input == '1') {
            dfa.setCurrentState(new StateStop());
        } else {
            System.out.println("Invalid input in State C.");
        }
    }

    
}
