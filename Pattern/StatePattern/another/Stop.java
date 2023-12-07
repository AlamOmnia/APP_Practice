package StatePattern.another;

public class Stop implements State {
    
    @Override
    public void doAction(Context context) {
       System.out.println("Inside the stop:");
       context.setState(new Start());
    }
    public String toString(){
        return "Start State";
    }
}
