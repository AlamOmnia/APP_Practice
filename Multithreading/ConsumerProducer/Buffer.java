package ConsumerProducer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
    private static final int Capacity=1;
    private LinkedList<Integer> itemqueue= new LinkedList<>();
    private static Lock lock= new ReentrantLock();

   private static Condition notEmpty= lock.newCondition();
   private static Condition notFull= lock.newCondition();

   public void write(int value){
    lock.lock();
    try{
        while(itemqueue.size()==Capacity){
            System.out.println("Wait for notFul Condition");
            notFull.await();
        }
        itemqueue.offer(value);
        notEmpty.signal();;
    }catch(InterruptedException es){

    }finally{
        lock.unlock();
    }
   }


   public int read(){
    int value=0;
    lock.lock();
    try{
        while (itemqueue.isEmpty()) {
            System.out.println("Waiting for Not empty condition");
            notEmpty.await();
        }
        value=itemqueue.remove();
        notFull.signal();
    }catch(InterruptedException ex){

    }finally{
        lock.unlock();
        return value;
    }
   }

}
