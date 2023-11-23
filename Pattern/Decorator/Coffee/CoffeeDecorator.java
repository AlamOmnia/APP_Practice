package Decorator.Coffee;

public abstract class CoffeeDecorator extends Coffee{
 private Coffee coffee;
 public CoffeeDecorator(Coffee coffee){
    this.coffee=coffee;
 }
 @Override 
    public double getCost(){
        return coffee.getCost();
    }
    @Override
    public String getItem(){
        return coffee.getItem();
    }
}
