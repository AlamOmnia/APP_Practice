package StatePattern.another;

public class Start implements State{

    @Override
    public void doAction(Context context) {
       System.out.println("Inside the start");
       context.setState(new Stop());
    }
public String toString(){
    return "Start State";
}
    
}