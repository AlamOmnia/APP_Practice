package Builder;

public abstract class ColdDrink implements Item{
    @Override
    public Packaging packing() {
        return new Bottle();
    }
    @Override
    public abstract int price();
}
