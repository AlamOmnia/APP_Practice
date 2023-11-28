package Deadlock;
public class DeadlockDemo {
    public static void main(String [] args){
        Resource resource1= new Resource();
        Resource resource2= new Resource();
        Thread thread1 = new Thread(() -> {
            resource1.method1(resource2);
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            resource2.method1(resource1);
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
