package com.yoyo.factory.abstractFactory;

import com.yoyo.factory.Apple;
import com.yoyo.factory.Dell;
import com.yoyo.factory.Lenovo;
import com.yoyo.factory.Notebook;

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
