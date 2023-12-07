package Exam;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable{

   private Q q;
 public Consumer(Q q){
   this.q=q;
  // new Thread(this, "Producer").start();
 }

   @Override
   public void run() {
     try{
      for(int i=1;i<10;i++){

        var item = 0; 
         //while(item == 0)
         {
       item =  q.getItem();
      }

        // System.out.println("Consumer comsume "+  item);
         
      }
      
     }catch(Exception ex){
     }
   }
   
}

