package com.test.two.one;

public class ConsumeThread extends Thread {
    private Consumer c;
    public ConsumeThread(Consumer c){
        this.c = c;
    }
    @Override
    public void run() {
        while (true) {
            c.consmer();
        }
    }
}
