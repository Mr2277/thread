package com.test.six;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    public void read() throws InterruptedException {
        lock.readLock().lock();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(4555);
        lock.readLock().unlock();
    }
}
