package com.yoyo.pattern.factory.factoryMethod;

import com.yoyo.pattern.factory.Apple;
import com.yoyo.pattern.factory.Notebook;

/**
 *专业的生产苹果笔记本的工厂
 */
public class AppleFactory implements Factory {
    @Override
    public Notebook getNotebook() {
        return new Apple();
    }
}
