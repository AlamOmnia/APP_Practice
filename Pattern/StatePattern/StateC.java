package StatePattern;

public class StateC extends DFAState{

    @Override
    public void transition(DFARunner dfa, char input) {
        if (input == '0') {
            System.out.print("State C");
            dfa.setCurrentState(new StateD());
        } else if (input == '1') {
            dfa.setCurrentState(new StateStop());
        } else {
            System.out.println("Invalid input in State C.");
        }
    }
    }
   

