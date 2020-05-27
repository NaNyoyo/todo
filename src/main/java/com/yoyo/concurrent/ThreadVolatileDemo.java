package com.yoyo.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * volatile可见性例子
 *
 */
public class ThreadVolatileDemo {
    public static Lock lock;
    public volatile static Boolean stop=false;
    public static void main(String[] args) throws InterruptedException {
      new Thread(()->{
            int i =0;
            while(!stop){
                i++;
            }
          System.out.println("结束2");
        },"thread1").start();
        TimeUnit.SECONDS.sleep(5);
        stop= true;
        System.out.println("结束");
    }
}
