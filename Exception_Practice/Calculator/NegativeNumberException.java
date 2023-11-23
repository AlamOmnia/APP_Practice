public class NegativeNumberException extends CalculatorException{
    public NegativeNumberException(String item){
        super("Inside the Negative Number Exception "+ item, item);
    }
    public String toString(){
        return super.getMessage();
    }
}
