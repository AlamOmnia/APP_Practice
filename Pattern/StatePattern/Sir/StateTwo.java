package StatePattern.Sir;

public class StateTwo implements State{

    @Override
    public void goNext(Context context) {
        System.out.println("Inside Two");
        context.setState(new StateThree());
    }
    
}
