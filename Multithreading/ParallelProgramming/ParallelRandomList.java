package ParallelProgramming;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelRandomList extends RecursiveAction{
    private static final int THRESHOLD=10000;
    private double[] list;
    private int low;
    private int high;

    public ParallelRandomList(double[] list, int low, int high){
        this.list=list;
        this.low=low;
        this.high=high;
    }
    @Override
    protected void compute() {
       if(high-low<THRESHOLD){
        initializeArray();
       }
       else{
        int mid= low+(high-low)/2;
        ParallelRandomList left= new ParallelRandomList(list, low, mid);
        ParallelRandomList right= new ParallelRandomList(list, mid, high);
        invokeAll(left,right);
       }
    }
    private void initializeArray(){
        Random random= new Random();
        for(int i=low;i<high;i++){
            list[i]= random.nextDouble();
        }
    }
    public static void parallelAssigneValues(double[] list,String poolName){
        ForkJoinPool pool= new ForkJoinPool();
        long startTime= System.currentTimeMillis();
        ParallelRandomList task= new ParallelRandomList(list, 0, list.length);
        pool.invoke(task);
        long endTime=System.currentTimeMillis();
        System.out.println("For: "+poolName+"Pooltime"+(endTime-startTime));
    }

    public static void main(String [] args){
        double[] list1= new double[9000000];
        double[] list2= new double[9000000];
        parallelAssigneValues(list1,"pool1");
        parallelAssigneValues(list2,"pool2");
        //System.out.println("Array"+Arrays.toString(Arrays.copyOfRange(list, 0, THRESHOLD)));
    }
    
}
