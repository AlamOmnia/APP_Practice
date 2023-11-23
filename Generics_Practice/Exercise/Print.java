package Exercise;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Print {
    public static void main(String [] args) throws Exception{
        Swap<Integer> s1= new Swap<Integer>(1, 2);
        s1.swap();
        System.out.println("Swap: "+s1.getA()+" "+s1.getB());
        Copy<Integer> copy= new Copy<Integer>(1, 2);
        copy.copy();
        System.out.println("Copy: "+copy.getA()+" "+copy.getB());


        /// Count Odd
        ArrayList<Integer> ci= new ArrayList<Integer>(Arrays.asList(1,2,4,5));;
        int count= Algorithm.CountOdd(ci,new OddPredict());
        System.out.println("Number of odd:"+count);

        //print prime numbers
        ArrayList<Integer> li= new ArrayList<Integer>(Arrays.asList(3,4,6,8,11,15,28,32));
        Collection<Integer>c= new ArrayList<Integer>(Arrays.asList(7,18,19,25));
        UnaryPerdicate<Integer> p= new RelativePrimePredicate(c);
        int i= Algorithm.findPrime(li,0, li.size(),p);
        if(i!=-1){
            System.out.print(li.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }

    }
}
