package com.test.two.three;

import java.util.ArrayList;

public class Produce {
    private ArrayList<Integer> list;
    private Object lock;

    public Produce(ArrayList<Integer> list,Object lock) {
        this.lock=lock;
        this.list = list;
    }
    public void produce() throws InterruptedException {
        synchronized (lock) {
             while (true){
                 if(list.isEmpty()){
                     for(int i=1;i<=10;i++){
                         System.out.println("生产者 "+i);
                         list.add(i);
                     }
                     lock.notifyAll();
                     }
                 lock.wait();

             }
        }
    }
}
