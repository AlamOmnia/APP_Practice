package StatePattern.DFA;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class DFARunner {
    private DFAState currentState;

    public DFAState getCurrentState() {
        return currentState;
    }

    public DFARunner() {
        currentState = new StateStart();
    }

    public void setCurrentState(DFAState newState) {
        currentState = newState;
    }

    public void processInput(String inputString) {
        for (char input : inputString.toCharArray()) {
            currentState.transition(this, input);
        }

    }
   
    }

