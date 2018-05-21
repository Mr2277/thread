package com.test.nine;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    private ReentrantReadWriteLock lock1=new ReentrantReadWriteLock();
    //private ReentrantReadWriteLock lock1=new ReentrantReadWriteLock();
    public void write() throws InterruptedException {
        lock.writeLock().lock();

            System.out.println("获得读锁：" + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
        lock.writeLock().unlock();
        System.out.println("write end");
    }
   public void read() throws InterruptedException {
        lock1.readLock().lock();

       System.out.println("获得读锁：read" + Thread.currentThread().getName()
               + " " + System.currentTimeMillis());
       Thread.sleep(1000000);

       lock1.readLock().unlock();
       System.out.println("read end");
   }
}
