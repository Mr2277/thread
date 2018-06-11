package com.one.three;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
   private ReentrantReadWriteLock reentrantReadWriteLock;
   private ReentrantLock reentrantLock;
   private Condition condition=reentrantLock.newCondition();
   public void test() throws InterruptedException {
       reentrantLock.lock();
       System.out.println("f");
       condition.await();
       System.out.println("end");
       reentrantLock.unlock();
       }

}
