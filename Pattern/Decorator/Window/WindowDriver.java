package Decorator.Window;

public class WindowDriver {
    public static void main(String [] args){
        Window window = new Border();
        window.draw();
        window= new ScrollbarDecorator(window);
        window.draw();
        window= new HorizontalScrollbar(window);
        window.draw();

    }
}
