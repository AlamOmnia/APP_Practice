package StatePattern;

public class StateD extends DFAState{

    @Override
    public void transition(DFARunner dfa, char input) {
        if (input == '0' || input == '1') {
            System.out.print("State D");
            dfa.setCurrentState(new StateStop());
        } else {
            System.out.println("Invalid input in State D.");
        }
    }
    }
  

