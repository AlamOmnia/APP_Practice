

public  class ShapeAreaCalculator<S extends IShape> {
    private S s;
    
 
public ShapeAreaCalculator(S s){
        this.s=s;
   }
    public void printArea() {
        System.out.println("Rectangle Area "+s.getArea());
    }
    public static void main(String [] args){
        Rectangle r = new Rectangle(10,10);
        Circle c = new Circle(10);
        ShapeAreaCalculator<?> calc= new ShapeAreaCalculator<Rectangle>(r);
        calc.printArea();
        calc= new ShapeAreaCalculator<Circle>(c);
        calc.printArea();
    }
}
