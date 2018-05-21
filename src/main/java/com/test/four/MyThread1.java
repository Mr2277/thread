package com.test.four;

public class MyThread1 extends Thread{
    private MyService myService;
    MyThread1(MyService myService){
        this.myService=myService;
    }
    @Override
    public void run() {
        myService.awaitA();
    }
}
