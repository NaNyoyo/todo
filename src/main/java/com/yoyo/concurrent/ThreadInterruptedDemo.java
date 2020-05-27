package com.yoyo.concurrent;

/**
 * interrupted复位中断标识
 *
 */
public class ThreadInterruptedDemo {

    public static void main(String[] args) {

        Thread t = new Thread(()->{
            while(true){
                if(Thread.currentThread().isInterrupted()){//检查当前线程的中断标识
                    System.out.println("中断标识"+Thread.currentThread().isInterrupted());
                    Thread.interrupted();//复位中断标识
                    System.out.println("中断标识"+Thread.currentThread().isInterrupted());
                    break;
                }
            }
        },"interruptedThread");
        t.start();

        t.interrupt();//主线程调用t的interrupt方法
    }
}
