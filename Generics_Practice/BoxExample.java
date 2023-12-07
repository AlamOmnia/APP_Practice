import javax.swing.Box;

public class BoxExample <T extends Number>{
private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void inspect(){
        System.out.println("T:"+t.getClass().getName());
    }

    public <U> void inspectWithAdditionalType(U u){
        System.out.println("T:"+t.getClass().getName());
        System.out.println("U:"+u.getClass().getName());
    }
public static void main(String[] args) {
BoxExample<Integer> integerBox = new BoxExample<Integer>();
integerBox.setT(10);
integerBox.inspect();
integerBox.inspectWithAdditionalType("Hello world");
Integer i = integerBox.getT();
}
}
