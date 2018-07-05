package com.yoyo.proxy.jdkproxy;

import com.yoyo.proxy.staticproxy.Job;
import com.yoyo.proxy.staticproxy.JobSeeker;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

public class TestJdkProxy {
    public static void main(String[] args) throws IOException {
        JobSeeker jobSeeker = new JobSeeker();
        //生成代理类
        Job job = (Job)Proxy.newProxyInstance(jobSeeker.getClass().getClassLoader(),
                               jobSeeker.getClass().getInterfaces(),
                               new JobHandler(jobSeeker));
        System.out.println(job.getClass());
        job.findJob();


        /**原理
         * 1.拿到被代理对象的引用，并且获取他的所有接口,反射获取
         * 2.JDK Proxy类重新生成一个类，同时新的类要实现被代理类实现的所有的接口
         * 3.动态生成java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中实现）
         * 4.把代码编译生成.class
         * 5.load到jvm中
         * 以上这个过程就叫字节码重组
         *
         */



        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Job.class});
        FileOutputStream fileOutputStream = new FileOutputStream("D://proxy//proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();

    }
}
