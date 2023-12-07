package Exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q {
    volatile int item;
    volatile boolean valueSet = false;

    synchronized int getItem() {
        if(!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Got: " + item);
        valueSet=false;
       notify();
       return item;

    }

    synchronized void setItem(int item) {
        if(valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        this.item = item;
        System.out.println("Put: " + item);
        valueSet=true;
        notify();
    }
    
}
