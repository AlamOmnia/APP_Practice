public class SimpleGeneric <E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public SimpleGeneric(E e){
        this.e=e;
    }

}
