public class NonNumberException extends CalculatorException {
    public NonNumberException(String item){
        super("Inside the NoNNumber Exception "+ item, item);
    }
    public String toString(){
        return super.getMessage();
    }

}
