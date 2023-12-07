package StatePattern.another;

public class Main {
    public static void main(String [] args){
        Context context= new Context();
        context.setState(new Start());
        context.request();
        context.getState().doAction(context);

    }
}
