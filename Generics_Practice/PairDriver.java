import java.util.ArrayList;

public class PairDriver {
    public static void main(String [] args){
        Pair<String, Integer> p1= new Pair<String,Integer>("Hello",1);
        System.out.println(p1);

        ArrayList<Integer> v1= new ArrayList<Integer>();
        for(int i=1; i<=3;i++){
            v1.add(i);
        }
        ArrayList<String> v2= new ArrayList<String>();
        v2.add("Omnia");
        v2.add("Shiblu");
        v2.add("Khan");

        ArrayList<Pair<String,Integer>> p2= new ArrayList<Pair<String,Integer>>();
        for (int i=0;i<=2;i++){
            p2.add(new Pair<String,Integer>(v2.get(i),v1.get(i)));
        }
        for (int i=0;i<=2;i++){
           System.out.println(""+p2.toString());
        }
    }

}
