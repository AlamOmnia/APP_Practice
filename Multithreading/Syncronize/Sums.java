package Syncronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Sums {
    private int ans;
    private static Lock lock= new ReentrantLock();
    public int getSum(){
        return ans;
    }
    public void adding(int num){
        lock.lock();
        int newAns=0;
        try{
            newAns=ans+num;
            Thread.sleep(5);
            ans= newAns;
            System.out.println("Result: "+ans);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
}
