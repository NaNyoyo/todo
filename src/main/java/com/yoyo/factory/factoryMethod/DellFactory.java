package com.yoyo.factory.factoryMethod;

import com.yoyo.factory.Dell;
import com.yoyo.factory.Notebook;

/**
 * 专业的生产戴尔笔记本的工厂
 */
public class DellFactory implements Factory {
    @Override
    public Notebook getNotebook() {
        return new Dell();
    }
}
