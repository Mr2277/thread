package com.test.four;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread1 a = new MyThread1(service);
        a.setName("AA");
        a.start();

        MyThread2 b = new MyThread2(service);
        b.setName("BB");
        b.start();

        Thread.sleep(2000);
        //service.signalAll_A(); //这里只唤醒线程A
        service.signal_A();
    }
}
