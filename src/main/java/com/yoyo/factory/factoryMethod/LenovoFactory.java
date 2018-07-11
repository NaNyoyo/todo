package com.yoyo.factory.factoryMethod;

import com.yoyo.factory.Lenovo;
import com.yoyo.factory.Notebook;

/**
 * 专业的生产联想笔记本的电脑
 */
public class LenovoFactory implements Factory {
    @Override
    public Notebook getNotebook() {
        return new Lenovo();
    }
}
