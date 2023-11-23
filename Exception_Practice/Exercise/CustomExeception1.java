package Exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.processing.FilerException;

public class CustomExeception1 {
    public static void main(String args[]){
        exDemo();
    }
private static void exDemo(){ 
    String data=null;
data= getData();
System.out.println("Data = "+data);
//  if(data.equals("Mota")){
//         System.out.println("Harry");
//     }
//     else{
//         System.out.println("Potar");
//     }
 }
    private static String getData() {
        var reader = new MapReader();

       return reader.readLine();
    //    try {
    //    // throw new IOException();
    //    return reader.readLine();
    // } catch (Exception e) {
    //     e.printStackTrace();
    //     //return "pogu";
    // }
    // finally{
    //     System.out.println("On Finally");
    //     //return "tasnim";
    // }
//     System.out.println("End");
//    return "shakil";
    }

    public static class  MapReader {
        
        public MapReader(){

        }

        public String readLine() throws Exception{
            throw new IOException("Gu");
        }
        
    }
}
