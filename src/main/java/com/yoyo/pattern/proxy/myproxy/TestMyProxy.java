package com.yoyo.pattern.proxy.myproxy;

import com.yoyo.pattern.proxy.staticproxy.Job;
import com.yoyo.pattern.proxy.staticproxy.JobSeeker;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class TestMyProxy {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        JobSeeker jobSeeker = new JobSeeker();
        //生成代理类
        Job job = (Job)MyProxy.newProxyInstance(new MyClassLoader(),
                               jobSeeker.getClass().getInterfaces(),
                               new MyJobHandler(jobSeeker));
       // System.out.println(job.getClass());
        job.findJob();


    }
}
