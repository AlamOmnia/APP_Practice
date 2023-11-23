import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class HardwareException extends Exception{
    String exc_time;
    public HardwareException(){
        exc_time=getTime();
    }
    public String getTime(){
        DateFormat format= new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }
}
