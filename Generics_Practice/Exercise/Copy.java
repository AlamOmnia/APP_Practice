package Exercise;

public class Copy<T> {
    private T a;
    private T b;
    public T getA() {
        return a;
    }
    public T getB() {
        return b;
    }
    public Copy(T a, T b){
        this.a=a;
        this.b=b;
    }
    public void copy(){   
    b=a;
    }
}
