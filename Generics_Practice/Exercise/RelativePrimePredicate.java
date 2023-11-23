package Exercise;

import java.util.Collection;

public class RelativePrimePredicate implements UnaryPerdicate<Integer>{
    private Collection<Integer>c;
    public RelativePrimePredicate(Collection<Integer>c){
    this.c=c;
    }
    @Override
    public boolean test(Integer x) {
        for(Integer i:c){
            if(Algorithm.gcd(x,i)!=1){
                return false;
            }
        }
        return c.size()>0;
    }
    
}
