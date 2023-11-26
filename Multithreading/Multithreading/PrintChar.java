package Multithreading;

public class PrintChar implements Runnable{
    private char c;
    private int num;
    public PrintChar(char c, int num){
        this.c=c;
        this.num=num;
    }
    @Override
    public void run() {
        for(int i=0;i<=num;i++){
            System.out.print(c);
        }
    }
    
}
