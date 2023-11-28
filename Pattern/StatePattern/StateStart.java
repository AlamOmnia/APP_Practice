package StatePattern;

public class StateStart extends DFAState {
    
    @Override
    public void transition(DFARunner dfa, char input) {
        if (input == '0') {
            dfa.setCurrentState(new StateA());
            System.out.println("Start");
        } else if (input == '1') {
            dfa.setCurrentState(new StateStop());
        } else {
            // Handle invalid input
            System.out.println("Invalid input in Start state.");
        }
    }
}

    

