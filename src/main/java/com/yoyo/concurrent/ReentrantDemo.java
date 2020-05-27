package com.yoyo.concurrent;

public class ReentrantDemo {

    public  synchronized  void demo(){
        System.out.println("begin:demo1");
        demo2();
    }
    public  void demo2(){
        System.out.println("begin:demo2");
        synchronized (this){}
    }

    public static void main(String[] args) {
        ReentrantDemo rd=new ReentrantDemo();
        new Thread(rd::demo).start();
    }
}
