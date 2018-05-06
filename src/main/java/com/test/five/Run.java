package com.test.five;

public class Run {
    public static void main(String[] args){
        MyService myService=new MyService();
        MyThreadA myThreadA=new MyThreadA(myService);
        myThreadA.start();
    }
}
