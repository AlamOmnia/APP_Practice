public class CalculatorException extends Exception{
    private Object item;
    public CalculatorException(String msg, Object new_item){
        super(msg);
        item= new_item;
    }
    public String toString(){
        return "Inside the Calculator Exception: "+item;
    }
    
}
