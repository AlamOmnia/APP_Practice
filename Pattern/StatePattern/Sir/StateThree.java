package StatePattern.Sir;

public class StateThree implements State{

    @Override
    public void goNext(Context context) {
        System.out.println("Inside Three");
        context.setState(new StateOne());
    }
    
    
}
