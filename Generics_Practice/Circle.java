public class Circle implements IShape{
    private int radious;
    public int getRadious() {
        return radious;
    }
    public void setRadious(int radious) {
        this.radious = radious;
    }
    public Circle(int radious){
        this.radious=radious;
    }
    public void printRadiuous(){
        System.out.println(""+this.radious);
    }
    @Override
    public double getArea() {
        return 3.1416*radious;
    }
}
