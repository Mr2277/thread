package com.test.three;

public class test {
    private Object object;
    public test(Object o){
        this.object=o;
    }
    public void test() throws InterruptedException {
        while (true){
            synchronized (object){

            }
        }
    }
}
