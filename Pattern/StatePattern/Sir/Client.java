package StatePattern.Sir;

public class Client {
    public static void main(String [] args){
        Context context= new Context();
        context.setState(new StateOne());
        context.request();
        context.getState().goNext(context);
        context.getState().goNext(context);
    }
}
