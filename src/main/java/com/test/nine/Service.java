package com.test.nine;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    public void write() throws InterruptedException {
        lock.writeLock().lock();

            System.out.println("获得读锁：" + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
        lock.writeLock().unlock();
    }
   public void read() throws InterruptedException {
        lock.readLock().lock();

       System.out.println("获得读锁：read" + Thread.currentThread().getName()
               + " " + System.currentTimeMillis());
       Thread.sleep(1000000);

       lock.readLock().unlock();

   }
}
