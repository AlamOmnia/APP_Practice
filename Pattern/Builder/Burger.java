package Builder;

public abstract class Burger implements Item{
   @Override
   public Packaging packing(){
    return new Wrapper();
   }
   @Override
   public abstract int price();
}
