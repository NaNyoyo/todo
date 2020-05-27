package com.yoyo.pattern.proxy.staticproxy;

/**
 * 求职者
 */
public class JobSeeker  implements Job {

    @Override
    public void findJob() {
        System.out.println("找工作");
    }
}
