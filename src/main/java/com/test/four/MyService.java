package com.test.four;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
        lock.unlock();
    }

}
