package Exercise;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExecptionFileRead {
    public static void main(String args[]){
       
        try {
            getBr();
        } catch (MapNotFoundException e) {
            e.printCustError();
        }

    }

    private static void getBr() throws MapNotFoundException {
        MapNotFoundException mex= new MapNotFoundException(null);
        System.out.println("Opening a File");
        BufferedReader br=null;
       
        try{
            br = new BufferedReader(new FileReader("/Users/air/Documents/GitHub/APP_Practive/resource/test1.txt"));
            String data= null;
            while ((data=br.readLine())!=null) {
                
                System.out.println(data);
                
            }
        }catch(FileNotFoundException ex){
           throw mex;
        }catch(IOException ex){
            System.out.println("Do nothing");
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }

    
}
