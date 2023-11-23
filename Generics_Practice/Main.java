import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.StyledEditorKit;

public class Main {
    
public static void main(String[] args) {
    Pair<?, ?> pair= new Pair<String,Integer>("Omnia", 29);
    SimpleGeneric<?> simpleGeneric= new SimpleGeneric<String>("Omnia");
    System.out.println(simpleGeneric.getE());
    SimpleGeneric<?> simpleGeneric1= new SimpleGeneric<Boolean>(false);
    System.out.println(""+simpleGeneric1.getE());
    printPair(pair);
    //Map<String, String > l= new HashMap<>();
    Pair[] intPairArr = new Pair[10] ; 
    addElements(intPairArr); 
  Pair<Integer,Integer> pair1 = intPairArr[1];  // unchecked warning
  Integer i = pair1.getFrist();                // fails with ClassClassException
  pair1.setSecond(i);
  
 }
 static void addElements(Object[] objArr) {
    objArr[0] = new Pair<Integer,Integer>(0,0);
    objArr[1] = new Pair<String,String>("","");    // should fail, but succeeds
  }
public static void  printPair(Pair<?, ?> l_Pair){
    System.out.println(l_Pair.getFrist()+" "+l_Pair.getSecond());
}
}
