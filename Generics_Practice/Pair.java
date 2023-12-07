public class Pair <X,Y> {
    private X frist;
    private Y second;
    public void setFrist(X frist) {
        this.frist = frist;
    }
    public void setSecond(Y second) {
        this.second = second;
    }
    public X getFrist() {
        return frist;
    }
    public Y getSecond() {
        return second;
    }
    public Pair(X frist, Y second){
        this.frist=frist;
        this.second=second;
    }
    public String toString(){
        return frist.getClass().getName()+":"+frist.toString()+", "
        +second.getClass().getName()+":"+second.toString();
    }
}
