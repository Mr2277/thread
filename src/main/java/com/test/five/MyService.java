package com.test.five;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void waitMethod() throws InterruptedException {
        lock.lock();
        System.out.println("A");
        condition.await();
        System.out.println("B");
        lock.unlock();
        System.out.println("锁释放");
    }
}
