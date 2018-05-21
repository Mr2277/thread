package com.test.eight;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("获得读锁：" +Thread.currentThread().getName()
                    +" " +System.currentTimeMillis());
        } finally {
            lock.readLock().unlock();
        }
    }
}
