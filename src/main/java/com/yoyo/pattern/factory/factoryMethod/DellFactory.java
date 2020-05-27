package com.yoyo.pattern.factory.factoryMethod;

import com.yoyo.pattern.factory.Dell;
import com.yoyo.pattern.factory.Notebook;

/**
 * 专业的生产戴尔笔记本的工厂
 */
public class DellFactory implements Factory {
    @Override
    public Notebook getNotebook() {
        return new Dell();
    }
}
