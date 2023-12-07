package StatePattern.DFA;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class StateDFArunnerDriver {
    public static void main(String[] args) {
        DFARunner dfa = new DFARunner();
        String inputString = "0000001110";
        dfa.setCurrentState(new StateStart());
        dfa.processInput(inputString);
    }
}

	

