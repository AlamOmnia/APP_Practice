package Decorator.Window;

public class VerticalScrollbar extends ScrollbarDecorator{

    public VerticalScrollbar(Window window) {
        super(window);
    }

    public void draw(){
        System.out.println("Verical");
    }
    
}
