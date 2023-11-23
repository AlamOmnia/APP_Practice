package Exercise;
public class Swap<T> {
    private T a;
    private T b;
    public T getA() {
        return a;
    }
    public T getB() {
        return b;
    }
    public Swap(T a, T b){
        this.a=a;
        this.b=b;
    }
    public void swap(){
    T temp= a;
    a=b;
    b=temp;

    }
}
