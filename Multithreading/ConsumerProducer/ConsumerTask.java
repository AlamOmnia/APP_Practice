package ConsumerProducer;

public class ConsumerTask implements Runnable{
    private Buffer buffer;
    public ConsumerTask(Buffer buffer){
        this.buffer=buffer;
    }
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Consumer consume:"+ buffer.read());
                Thread.sleep(100);
            }
        }catch(InterruptedException esc){
            
        }
    }
    
}
