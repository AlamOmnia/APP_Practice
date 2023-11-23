public class LengthOverflow extends CalculatorException{
    private Object item;
    public LengthOverflow(Object item){
        super("Inside the Length Overflow Exception " + item, item);
    }
    public String toString(){
        return super.getMessage();
    }
}
