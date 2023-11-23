package Decorator.Coffee;

public class DecoratorDriver {
    public static void main(String [] args){
        Coffee coffee= new SimpleCoffee();
        System.out.println(""+coffee.getCost()+""+coffee.getItem());

        coffee= new WhipCream(coffee);
         System.out.println(""+coffee.getCost()+""+coffee.getItem());
    }
}
