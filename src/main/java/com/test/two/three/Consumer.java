package com.test.two.three;

import java.util.ArrayList;

public class Consumer {
    private Object object;
    private ArrayList<Integer>list;
    public Consumer(Object o,ArrayList<Integer>list){
        this.list=list;
        this.object=o;
    }

    public void Consume() throws InterruptedException {
        synchronized (object) {
            while (true) {
                while (!list.isEmpty()) {
                    System.out.println("消费者 " + list.get(0) +"   "+ Thread.currentThread().getId());
                    list.remove(0);
                }
                object.notifyAll();
                object.wait();
            }
        }
    }
}
