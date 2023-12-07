package StatePattern.Sir;

public class StateOne implements State {
    
    @Override
    public void goNext(Context context) {
        System.out.println("Inside One");
        context.setState(new StateTwo());
    }
    
}
