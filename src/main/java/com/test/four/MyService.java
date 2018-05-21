package com.test.four;

<<<<<<< HEAD
import java.util.concurrent.locks.Condition;
=======
>>>>>>> origin/master
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();
<<<<<<< HEAD
    private Condition conditionA=lock.newCondition();
    private Condition conditionB=lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println(" begin awaitA 时间为： " + System.currentTimeMillis()
                    + "  ThreadName=" + Thread.currentThread().getName());

            conditionA.await();
            System.out.println("  end awaitA 时间为： " + System.currentTimeMillis()
                    + "  ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println(" begin awaitA 时间为： " + System.currentTimeMillis()
                    + "  ThreadName=" + Thread.currentThread().getName());

            conditionB.await();
            System.out.println("  end awaitA 时间为： " + System.currentTimeMillis()
                    + "  ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void signalAll() {
        try {
            lock.lock();
            System.out.println("signal 时间为：" + System.currentTimeMillis());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }
    public void signal_A(){
        try {
            lock.lock();
            System.out.println("signal 时间为：" + System.currentTimeMillis());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }
    public void signal_B(){
        try {
            lock.lock();
            System.out.println("signal 时间为：" + System.currentTimeMillis());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

=======
    public void testMethod(){
        lock.lock();
        for(int i=0;i<500000000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
        lock.unlock();
    }

}
>>>>>>> origin/master
