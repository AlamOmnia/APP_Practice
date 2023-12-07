public class PairUtil {
    public static <A extends Number, B extends Number> double add(Pair<A,B>p){
        return p.getFrist().doubleValue()+p.getSecond().doubleValue();
    }
    public static <A,B> Pair<B,A> swap(Pair<A,B>p){
        A a= p.getFrist();
        B b=p.getSecond();
        return new Pair<B,A>(b, a);
    }

    public static void main(String [] args){
        Pair<Integer, Integer> pair= new Pair<Integer,Integer>(10, 20);
        System.out.println(""+add(pair));
         Pair<Integer, Integer> pair1=swap(pair);
        System.out.println(""+pair1.getFrist()+","+pair1.getSecond());

    }
}
