package ConsumerProducer;

public class ProducerTask implements Runnable{
    private Buffer buffer;
    public ProducerTask(Buffer buffer){
        this.buffer=buffer;
    }
    @Override
    public void run() {
      try{
        int i=1;
        while(true){
            System.out.println("Producer produce: "+i);
            buffer.write(i++);
            Thread.sleep(100);
        }
      }catch(InterruptedException es){
        
      }
    }
    
}
