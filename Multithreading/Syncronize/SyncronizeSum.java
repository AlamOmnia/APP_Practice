package Syncronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Accounts.Account;

public class SyncronizeSum {
    
 private static Sums sums= new Sums();
public static void main(String [] args){
ExecutorService executorService= Executors.newCachedThreadPool();
for(int i=0; i<1000;i++){
    executorService.execute(new AddoneTask(sums));
}
executorService.shutdown();

while(!executorService.isTerminated()){

}
System.out.println("Total: "+sums.getSum());
}
}

class AddoneTask implements Runnable {
    private Sums sums;
    public AddoneTask(Sums sums){
        this.sums=sums;
    }
    public void run(){
        sums.adding(1);
    }
    
}
