package com.yoyo.pattern.factory.abstractFactory;

import com.yoyo.pattern.factory.Apple;
import com.yoyo.pattern.factory.Dell;
import com.yoyo.pattern.factory.Lenovo;
import com.yoyo.pattern.factory.Notebook;

public class NotebookFactory extends AbstractFactory {
    //公共的方法逻辑
    @Override
    public Notebook getAppleNotebook() {
        return new Apple();
    }

    @Override
    public Notebook getDellNotebook() {
        return new Dell();
    }

    @Override
    public Notebook getLenovoNotebook() {
        return new Lenovo();
    }
}
