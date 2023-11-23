package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectStreamException;

public class SensorV2 {
    public static void main (String [] args)throws NegativeSensorExpecption,OverloadSensorException{
        
        BufferedReader br ;
        br=new BufferedReader(new InputStreamReader(System.in));
        int value;
        try {
            String line= br.readLine();
            value=Integer.parseInt(line);
            if(value<0) throw new NegativeSensorExpecption(value);
        try{
            if(value>5) throw new OverloadSensorException(value);
        }catch(OverloadSensorException e){
            System.out.println(e.toString());
        }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
