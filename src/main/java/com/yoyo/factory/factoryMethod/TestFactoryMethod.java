package com.yoyo.factory.factoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Factory factory = new AppleFactory();//苹果
        System.out.println(factory.getNotebook().getName());
    }
}
