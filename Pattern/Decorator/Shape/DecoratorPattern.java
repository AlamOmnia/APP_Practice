package Decorator.Shape;

import java.sql.ShardingKey;

public class DecoratorPattern {
    public static void main(String [] args){
        Shape cir= new Circle();
        Shape rec= new Rectangle();
        Shape redCir= new RedShapeDecorator(new Circle());
        Shape redRec= new RedShapeDecorator(new Rectangle());

        cir.draw();
        redCir.draw();
    }
}
