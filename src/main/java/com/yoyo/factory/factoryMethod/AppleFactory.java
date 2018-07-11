package com.yoyo.factory.factoryMethod;

import com.yoyo.factory.Apple;
import com.yoyo.factory.Notebook;

/**
 *专业的生产苹果笔记本的工厂
 */
public class AppleFactory implements Factory {
    @Override
    public Notebook getNotebook() {
        return new Apple();
    }
}
