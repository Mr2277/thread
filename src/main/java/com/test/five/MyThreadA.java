package com.test.five;

public class MyThreadA extends Thread{
    private MyService myService;
    public MyThreadA(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        try {
            myService.waitMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
