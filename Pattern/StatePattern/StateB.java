package StatePattern;

public class StateB extends DFAState{

        @Override
        public void transition(DFARunner dfa, char input) {
             if (input == '0') {
                System.out.print("State B");
                dfa.setCurrentState(new StateC());
            } else if (input == '1') {
                dfa.setCurrentState(new StateStop());
            } else {
                System.out.println("Invalid input in State B.");
            }
        }
    }
   

