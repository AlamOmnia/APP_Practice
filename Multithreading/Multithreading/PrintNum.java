package Multithreading;

import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;

public class PrintNum  implements Runnable{
    private int num;
    
    public PrintNum(int num){
        this.num=num;
    }
    @Override
    public void run() {
        PrintChar printChar3= new PrintChar('c', 3);
    Thread threadc= new Thread(printChar3);
    threadc.start();
      try {
       for(int i=0;i<=num;i++){
        System.out.print(i);
         Thread.yield();//doesnot garantee
         if(i==num)
          threadc.join();
       }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
         
         
       }
    }
    

