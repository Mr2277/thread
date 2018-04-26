package com.test.two.three;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object o=new Object();
        ArrayList<Integer>list=new ArrayList<Integer>();

        Produce produce=new Produce(list,o);
        Consumer consumer=new Consumer(o,list);

        ProduceThread produceThread=new ProduceThread(produce);

        ConsumerThread consumerThread=new ConsumerThread(consumer);

        ConsumerThread consumerThread1=new ConsumerThread(consumer);
        produceThread.start();
        Thread.sleep(1000);
        consumerThread.start();
        consumerThread1.start();
    }
}
