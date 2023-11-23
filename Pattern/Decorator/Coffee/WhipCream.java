package Decorator.Coffee;

public class WhipCream extends CoffeeDecorator{

    public WhipCream(Coffee coffee) {
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+1.00;
    }
    public String getItem(){
        return super.getItem()+"added WhipCream";
    }
}
