package Deadlock;

public class Resource {
    public synchronized void method1(Resource anothResource){
        System.out.println(Thread.currentThread().getName()+"is executing Method1()");
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        anothResource.method2(this);
    }
public synchronized void method2(Resource othResource){
    System.out.println(Thread.currentThread().getName()+"is excecuting method2");
try{
    Thread.sleep(100);
}catch(InterruptedException e){
    e.printStackTrace();
}
othResource.method1(this);
}
}
