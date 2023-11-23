public class Rectangle implements IShape {
    private int Width;
    private int height;
    public int getWidth() {
        return Width;
    }
    public void setWidth(int width) {
        Width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public Rectangle(int Width, int height){
        this.Width=Width;
        this.height=height;
    }
    public void printWidth(){
        System.out.println(""+this.Width);
    }
    @Override
    public double getArea() {
        return height*Width;
    }
}
