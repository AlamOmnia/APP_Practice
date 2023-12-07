package ConsumerProducer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerProducer {
   
    public static void main(String [] args){
      //  ArrayBlockingQueue<Integer> buff= new ArrayBlockingQueue<>(2);
        Buffer buffer= new Buffer(); 
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new ProducerTask(buffer));
        executorService.execute(new ConsumerTask(buffer));
    }
}
