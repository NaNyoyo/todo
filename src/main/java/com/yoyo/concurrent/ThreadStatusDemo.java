package com.yoyo.concurrent;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 线程状态演示的demo
 * jps
 * jstack pid
 */
public class ThreadStatusDemo {

    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"time_watting").start();

        new Thread(()->{
            while (true){
                synchronized (ThreadStatusDemo.class){
                    try {
                        ThreadStatusDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        },"watting").start();

        new BlockThread("block0").start();
        new BlockThread("block1").start();



    }

    static  class BlockThread extends Thread{
        public BlockThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (BlockThread.class){
                while (true){
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
