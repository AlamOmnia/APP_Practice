package StatePattern;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class StateDFArunnerDriver {
    public static void main(String[] args) {
        DFARunner dfa = new DFARunner();
        String inputString = "000101";
        dfa.processInput(inputString);
    }
}

	

