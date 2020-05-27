package com.yoyo.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * InterruptedException异常，线程标识位的复位
 *
 */
public class ThreadInterruptedExceptionDemo {

    public static void main(String[] args) {

        Thread t = new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().isInterrupted());
            }
        },"interruptedExceptionThread");
        t.start();
        t.interrupt();//主线程调用t的interrupt方法
    }
}
