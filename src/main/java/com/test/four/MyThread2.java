package com.test.four;

public class MyThread2 extends Thread {
    private MyService myService;
    MyThread2(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
