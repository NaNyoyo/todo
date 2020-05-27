package com.yoyo.pattern.proxy.staticproxy;

public class Zhilian implements Job {

    private  JobSeeker jobSeeker;

    public  Zhilian(JobSeeker jobSeeker){
        this.jobSeeker = jobSeeker;
    }
    @Override
    public void findJob() {
        System.out.println("物色求职者要求的工作");
        jobSeeker.findJob();
        System.out.println("是否双方都满意");
    }
}
