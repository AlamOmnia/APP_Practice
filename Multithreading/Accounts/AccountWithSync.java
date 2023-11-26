package Accounts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithSync {
    private static Account account= new Account();
public static void main(String [] args){
ExecutorService executorService= Executors.newCachedThreadPool();
for(int i=0; i<5;i++){
    executorService.execute(new AddPennyTask(account));
}
executorService.shutdown();

while(!executorService.isTerminated()){

}
System.out.println("Balance "+account.getBalance());
}
}

class AddPennyTask implements Runnable {
    private Account account;
    public AddPennyTask(Account account){
        this.account=account;
    }
    public void run(){
        account.deposit(1);
    }
    
}
