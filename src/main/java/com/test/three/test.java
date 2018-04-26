package com.test.three;

public class test {
    private Object object;
    public test(Object o){
        this.object=o;
    }
    public void test() throws InterruptedException {
        synchronized (object){
               while (true){
                   if(Thread.currentThread().getName().equals("A")){
                     System.out.println("A");
                     object.wait();
                 }
                 else{
                     System.out.println("B");
                     object.wait();
                 }
            }
        }
    }
}
