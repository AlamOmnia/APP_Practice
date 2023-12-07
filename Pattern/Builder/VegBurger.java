package Builder;

public class VegBurger extends Burger{

    @Override
    public String name() {
      return "VegBurger";
    }

    @Override
    public int price() {
        return 10;
    }
    
}
