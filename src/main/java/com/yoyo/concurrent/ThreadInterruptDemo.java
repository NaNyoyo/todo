package com.yoyo.concurrent;

import java.io.File;

/**
 * interrupt终止线程的demo
 *
 */
public class ThreadInterruptDemo {

    public static void main(String[] args) {

        Thread t = new Thread(()->{
            while(true){
                if(Thread.currentThread().isInterrupted()){//检查当前线程的中断标识
                    System.out.println("检测到中断，进行中断");
                   break;
                }
            }
            System.out.println("mythread结束");
        },"mythread");
        t.start();

        t.interrupt();//主线程调用t的interrupt方法
    }
    
    
}
