package com.test.eleven;

import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<Integer> future = threadPool.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(10);
            }
        });
        try {
            //Thread.sleep(5000);// 可能做一些事情
            System.out.println(Thread.currentThread().getName());
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        threadPool.shutdown();
    }
}
