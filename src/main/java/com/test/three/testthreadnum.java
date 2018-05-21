package com.test.three;
class A extends Thread{
    private Object object;
    public A(Object object){
        this.object=object;
    }
    @Override
    public void run() {
        synchronized (object){
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class testthreadnum {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Object o=new Object();

            A a=new A(o);
            a.start();
            System.out.println(i);
        }
    }
}
