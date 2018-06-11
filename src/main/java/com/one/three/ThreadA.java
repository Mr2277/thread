package com.one.three;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadA extends Thread{
    private ReentrantLock reentrantLock;
    private Condition condition=reentrantLock.newCondition();
    @Override
    public void run() {

    }
}
