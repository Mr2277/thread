package com.test.two.three;

public class ConsumerThread extends Thread {
    private Consumer consumer;
    public ConsumerThread(Consumer consumer){
        this.consumer=consumer;
    }

    @Override
    public void run() {
        try {
            consumer.Consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
