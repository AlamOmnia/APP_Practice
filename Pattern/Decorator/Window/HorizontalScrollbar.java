package Decorator.Window;

public class HorizontalScrollbar extends ScrollbarDecorator {

    public HorizontalScrollbar(Window window) {
        super(window);
    }
    
    public void draw(){
        System.out.println("Horizontail");
    }
}
