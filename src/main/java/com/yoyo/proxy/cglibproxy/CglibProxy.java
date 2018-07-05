package com.yoyo.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy  implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clz){
        //设置创建子类的类
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    /**
     * obj:被代理类
     * method：被代理方法的反射对象
     * args：方法参数
     * proxy：代理类的实例
     */
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("根据条件筛选房源信息");
        proxy.invokeSuper(obj,args);
        System.out.println("双方是否满意");
        return null;
    }
}
