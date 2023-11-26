package StatePattern;

import java.util.Scanner;

public class DFARunner {
    private DFAState dfaState;
        public void setState(DFAState dfaState){
        dfaState=dfaState;
    }
    public void start(){
        setState(new StateStart(this));
       Scanner scanner = new Scanner(System.in);
       
       boolean l_exit = false;
       String Command;
       while (!l_exit) {
        Command = scanner.nextLine();
        switch (Command) {
            case "A":
            dfaState.stateA();
            break;
            case "B":
            dfaState.stateB();
            break;
            case "C":
            dfaState.stateC();
            break;
            case "D":
            dfaState.stateD();
            break;
            case "stop":
            dfaState.stop();
            break;
            default:
            break;
        }
    }
        }

    }

