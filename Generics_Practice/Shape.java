public class Shape <R extends Rectangle, C extends Circle>{
    private R rec;
    private C cir;
    public R getRec() {
        return rec;
    }
    public void setRec(R rec) {
        this.rec = rec;
    }
    public C getCir() {
        return cir;
    }
    public void setCir(C cir) {
        this.cir = cir;
    }

    public Shape(R rec, C cir){
        this.rec=rec;
        this.cir=cir;
    }

    public void calculateArea(Shape<R,C> shape){
        System.out.println("Rectangle area: ");
    }
}
