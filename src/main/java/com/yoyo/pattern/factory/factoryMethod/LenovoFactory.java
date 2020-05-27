package com.yoyo.pattern.factory.factoryMethod;

import com.yoyo.pattern.factory.Lenovo;
import com.yoyo.pattern.factory.Notebook;

/**
 * 专业的生产联想笔记本的电脑
 */
public class LenovoFactory implements Factory {
    @Override
    public Notebook getNotebook() {
        return new Lenovo();
    }
}
