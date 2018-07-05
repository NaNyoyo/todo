package com.yoyo.proxy.myproxy;

import java.lang.reflect.Method;

public class MyJobHandler implements MyInvocationHandler{
    private  Object target;
    public MyJobHandler(Object target){
        this.target = target;
    }
    @Override
    /**
     * proxy 被代理类
     * method 被代理方法
     * args 方法参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("物色求职者要求的工作");
        System.out.println(proxy.getClass());
        method.invoke(target,args);
        System.out.println("是否双方都满意");
        return null;
    }

}
