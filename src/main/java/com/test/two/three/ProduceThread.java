package com.test.two.three;

public class ProduceThread extends Thread{
    private Produce produce;
    public ProduceThread(Produce produce){
        this.produce=produce;
    }

    @Override
    public void run() {
        try {
            produce.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
