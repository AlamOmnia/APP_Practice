package Decorator.Coffee;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    public double getCost(){
        return super.getCost()+0.50;
    }

    public String getItem(){
        return super.getItem()+"added Milk";
    }
    
}
