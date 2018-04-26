package com.test.two.three;

import java.util.ArrayList;

public class Produce {
    private ArrayList<Integer> list;
    private Object lockproduce;

    public Produce(ArrayList<Integer> list) {
        this.list = list;
    }

    public void produce() {
        synchronized (lockproduce) {
            while (true) {
                if (list.isEmpty()) {
                     for(int i=1;i<=10;i++){
                         list.add(i);
                     }
                     lockproduce.notifyAll();

                }

            }
        }
    }
}
