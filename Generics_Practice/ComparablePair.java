public class ComparablePair <First extends Comparable<First>,Second extends Comparable<Second>> implements Comparable<ComparablePair<First,Second>>{
    private First first;
    private Second second;
    
    public First getFirst() {
        return first;
    }
    public void setFirst(First first) {
        this.first = first;
    }
    public Second getSecond() {
        return second;
    }
    public void setSecond(Second second) {
        this.second = second;
    }
    public ComparablePair(First first,Second second){
        this.first=first;
        this.second=second;
    }
    public ComparablePair(ComparablePair<First,Second> newComparablePair){
        this.first= newComparablePair.getFirst();
        this.second= newComparablePair.getSecond();
    }

    public String toString() {
        return first.getClass().getName() + ":" + first.toString() + " , "
        + second.getClass().getName() + ":" + second.toString();
        }
    public int compareTo(ComparablePair<First,Second> other){
        int first1= first.compareTo(other.getFirst());
        int second1= second.compareTo(other.getSecond());
        if(first1!=0){
            return first1;
        }
        else{
            return second1;
        }

    }
}
