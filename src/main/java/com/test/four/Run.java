package com.test.four;

public class Run {
    public static void main(String[] args){
        MyService myService=new MyService();
        MyThread a=new MyThread(myService);
        MyThread b=new MyThread(myService);
        MyThread c=new MyThread(myService);
        MyThread e=new MyThread(myService);
        MyThread d=new MyThread(myService);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
