package Exercise;

import java.util.Collection;
import java.util.List;

public final class Algorithm {
   // https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-answers.html
    //count odd
    public static <T> int CountOdd(List<T> ts, UnaryPerdicate<T> p){
        int count=0;
        for(T t:ts){
            if(p.test(t)){
                count++;
            }
        
        }
        return count;
    }
///Check prime
    public static <T>int findPrime(List<T> l, int begin, int end, UnaryPerdicate<T> p){
        for(;begin<end;begin++){
            if(p.test(l.get(begin)))
            return begin;
        }
        return -1;
    }

    public static int gcd (int x, int y){
        for(int r;(r=x%y)!=0;x=y,y=r){
            
        }
            return y;
    }

}
