package Decorator.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw(){
        System.out.println("RedShapDecorator");
        setBorder();
    }
    public void setBorder(){
        System.out.println("Border");
    }
}
