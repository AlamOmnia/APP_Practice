package StatePattern;

// DFAState.java (State interface)
public abstract class DFAState {
    public abstract void transition(DFARunner dfa, char input);
}
