package Decorator.Coffee;

public class Chocolate extends CoffeeDecorator{

    public Chocolate(Coffee coffee) {
        super(coffee);
       
    }
    public double getCost(){
        return super.getCost()+1.5;
    }

    public String getItem(){
        return super.getItem()+"added Chocolate";
    }
}
