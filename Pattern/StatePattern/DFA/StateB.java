package StatePattern.DFA;

public class StateB extends DFAState{

        @Override
        public void transition(DFARunner dfa, char input) {
            System.out.println("Inside State B");
            if (input == '0') {
                dfa.setCurrentState(new StateC());
            } else if (input == '1') {
                dfa.setCurrentState(new StateStop());
            } else {
                System.out.println("Invalid input in State C.");
            }
    }
}
   

