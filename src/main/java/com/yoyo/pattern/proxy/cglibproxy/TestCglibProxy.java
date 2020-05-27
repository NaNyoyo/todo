package com.yoyo.pattern.proxy.cglibproxy;

public class TestCglibProxy {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Person personProxy = (Person)proxy.getProxy(Person.class);
        personProxy.findHouse();
    }
}
