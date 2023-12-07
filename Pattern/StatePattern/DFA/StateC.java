package StatePattern.DFA;

public class StateC extends DFAState{

    @Override
    public void transition(DFARunner dfa, char input) {
        System.out.println("Inside State C");
        if (input == '0') {
            dfa.setCurrentState(new StateD());
        } else if (input == '1') {
            dfa.setCurrentState(new StateStop());
        } else {
            System.out.println("Invalid input in State C.");
        }
    }
}

   

