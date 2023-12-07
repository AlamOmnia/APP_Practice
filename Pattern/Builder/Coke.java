package Builder;

public class Coke extends ColdDrink{

    @Override
    public String name() {
       return "Adding Coke";
    }

    @Override
    public int price() {
        return 2;
    }
    
}
