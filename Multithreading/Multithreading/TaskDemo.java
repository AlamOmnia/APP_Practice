package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskDemo{
    public static void main(String [] args){
        PrintNum printNum= new PrintNum(5);
        PrintChar printChar= new PrintChar('a', 5);
        PrintChar printChar2= new PrintChar('b', 3);
        
        // Thread threada= new Thread(printChar);
        // Thread threadb= new Thread(printChar2);
        // Thread threadnum= new Thread(printNum);
        // threada.start();
        // threadb.start();
        // threadnum.start();
        
        
        ExecutorService service= Executors.newFixedThreadPool(3);
        service.execute(printChar);
        service.execute(printChar2);
        service.execute(printNum);
        service.shutdown();

    }
}
