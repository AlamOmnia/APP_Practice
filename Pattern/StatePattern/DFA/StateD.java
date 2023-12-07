package StatePattern.DFA;

public class StateD extends DFAState{

    @Override
    public void transition(DFARunner dfa, char input) {
        System.out.println("Inside State D");
        if (input == '0' || input == '1') {
            dfa.setCurrentState(new StateStop());
        } else {
            System.out.println("Invalid input in State D.");
        }

    }
    }
  

