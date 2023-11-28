package StatePattern;

public class StateA extends DFAState {
    @Override
    public void transition(DFARunner dfa, char input) {
            if (input == '0') {
                System.out.print("State A");
                dfa.setCurrentState(new StateB());
            } else if (input == '1') {
                dfa.setCurrentState(new StateStop());
            } else {
                System.out.println("Invalid input in State A.");
            }
        
    }

    
}
