import java.util.Collection;

import Exercise.UnaryPerdicate;

 public class OddPredict implements UnaryPerdicate<Integer>{
   public OddPredict(){
   }
    @Override
    public boolean test(Integer c) {
        return c %2!=0;
    }
}
