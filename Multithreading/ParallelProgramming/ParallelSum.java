package ParallelProgramming;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ParallelSum {
 public static void main(String [] args){
    final int N=10000;
    int [] list= new int[N];
    for(int i= 0; i<list.length;i++){
        list[i]=i;
    }
    long startTime = System.currentTimeMillis();
    System.out.println("Sum of the list:"+ parallelsum(list));
    long endTime= System.currentTimeMillis();
    System.out.println("Time: "+(endTime-startTime));
 } 
 public static int parallelsum(int[] list){
    RecursiveTask<Integer> task= new SumTask(list,0,list.length);
    ForkJoinPool pool= new ForkJoinPool();
    return pool.invoke(task);
}
}

class SumTask extends RecursiveTask<Integer> {
    private final static int THRESHOLD=1000;
    private int [] list;
    private int low;
    private int high;
    public SumTask(int [] list, int low, int high){
        this.high=high;
        this.list=list;
        this.low=low;
    }
    @Override
    protected Integer compute() {
        if(high-low<THRESHOLD){
            int resutl=list[0];
            for(int i=low; i<high;i++){
                resutl=resutl+list[i];
            }
            return resutl;
        }
        else{
            int mid=(low+high)/2;
            RecursiveTask<Integer>left= new SumTask(list, low, mid);
            RecursiveTask<Integer>right= new SumTask(list, mid, high);
            right.fork();
            left.fork();
            return Integer.sum(left.join(), right.join());
        }
    }

    
}