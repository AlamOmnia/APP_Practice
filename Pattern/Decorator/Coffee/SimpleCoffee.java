package Decorator.Coffee;

public class SimpleCoffee extends Coffee{

    @Override
    public double getCost() {
       return 1.00;
    }

    @Override
    public String getItem() {
       return "Simple Coffee";
    }
    
}
