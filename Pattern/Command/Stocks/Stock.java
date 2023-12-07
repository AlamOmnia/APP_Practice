package Command.Stocks;

public class Stock {
    private String name;
    private int quantity;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("Buying: "+name+" Quantity"+quantity);
    }
     public void sell(){
        System.out.println("Selling: "+name+" Quantity"+quantity);
    }

}
