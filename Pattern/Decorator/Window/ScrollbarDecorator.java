package Decorator.Window;

public class ScrollbarDecorator extends WindowDecorator{

    private Window window;
    public ScrollbarDecorator(Window window){
        this.window=window;
    }
    @Override
    public void draw() {
      System.out.println("Adding Scroll bar:");
    }
    
}
