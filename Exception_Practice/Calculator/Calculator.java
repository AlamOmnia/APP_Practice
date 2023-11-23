import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.CancelledKeyException;

import javax.sound.midi.SysexMessage;

public class Calculator{
public static void main(String []args)throws InvalidOperatorException, NonNumberException{
BufferedReader br ;
    try  {
        br=new BufferedReader(new InputStreamReader(System.in));
        String line= br.readLine();
        String[] splitted = line.split(" ");
        if(splitted[1].equals("++")){
            throw new InvalidOperatorException(splitted[1]);
        }
        if(splitted[0].equals("a")){
            throw new NonNumberException(splitted[1]);
        }
        try{
            if (Integer.parseInt(splitted[0])<0) throw new NegativeNumberException(splitted[0]);
        }catch(NegativeNumberException e){
            System.out.println(e.toString());
        }
        try{
            if (Integer.parseInt(splitted[0])>10) throw new LengthOverflow(splitted[0]);
        }catch(LengthOverflow e){
            System.out.println(e.toString());
        }

    } catch (IOException e) {
        
        e.printStackTrace();
    }

}

}
