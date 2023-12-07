package Factory;

public class FactoryPattern {
    public static void main(String [] args){
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape shape=shapeFactory.getShapeType("Circle");
        shape.draw();
        shape=shapeFactory.getShapeType("Rectangle");
        shape.draw();

    }
}
