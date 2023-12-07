package Exam;


public class Main {
    public static void main(String [] args){
        Q q = new Q();
        
       
        Thread thread1= new Thread(new Producer(q));
        Thread thread2= new Thread( new Consumer(q));
        thread1.start();
        thread2.start();
        System.out.println("Press Control-C to stop.");
    }
}
