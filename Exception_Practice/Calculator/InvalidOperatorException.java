public class InvalidOperatorException extends CalculatorException{
    public InvalidOperatorException(String item){
        super("Inside the Invalid Operator Exception "+ item, item);
    }
    public String toString(){
        return super.getMessage();
    }
}
