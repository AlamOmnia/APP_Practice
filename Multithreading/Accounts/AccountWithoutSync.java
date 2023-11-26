package Accounts;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class AccountWithoutSync {
private static AccountModelWithoutSync account= new AccountModelWithoutSync();
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
    private AccountModelWithoutSync account;
    public AddPennyTask(AccountModelWithoutSync account){
        this.account=account;
    }
    public void run(){
        account.deposit(1);
    }
    
}