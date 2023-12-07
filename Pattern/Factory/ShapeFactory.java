package Factory;

public class ShapeFactory {
    private String shapeType;

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public Shape getShapeType(String shapeType) {
        if(shapeType.equals("Circle")){
            return new Circle();
        }
        if (shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }


}
