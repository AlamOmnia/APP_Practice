package Accounts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountModelWithoutSync {
    private int balance=0;
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        int newBalance=0;
        try {
             newBalance= balance+amount;
            Thread.sleep(5);
             System.out.println("Before Balance "+balance);
            balance=newBalance; 
        System.out.println("After Balance "+balance);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       
    }
}
