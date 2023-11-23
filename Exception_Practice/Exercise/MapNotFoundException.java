package Exercise;
import java.io.IOException;

public class MapNotFoundException extends IOException {
    public MapNotFoundException(String errorMsg){
        super(errorMsg);
    }
    public void printCustError(){
        System.out.println("File not found custom!");
    }
}
