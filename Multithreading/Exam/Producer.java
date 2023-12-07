package Exam;

import java.nio.Buffer;

public class Producer implements Runnable{
  
  private Q q;
  public Producer(Q q){
    this.q=q;
  }
  @Override
  public void run() {
    try{
for(int i=1;i<10;i++){
  q.setItem(i);
//System.out.println("Producer produce: "+i);

}

    }catch(Exception ex){
      ex.printStackTrace();
    }
    

  }

  
}

