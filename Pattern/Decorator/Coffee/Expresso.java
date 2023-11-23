package Decorator.Coffee;

public class Expresso extends Coffee{

    @Override
    public double getCost() {
        return 1.5;
    }

    @Override
    public String getItem() {
        return "Expresso:";
    }
    
}
