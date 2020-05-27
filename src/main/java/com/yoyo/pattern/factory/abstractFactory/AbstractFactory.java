package com.yoyo.pattern.factory.abstractFactory;

import com.yoyo.pattern.factory.Notebook;

/**
 *抽象工厂，提供给用户的入口
 */
public abstract class AbstractFactory {

    //生产苹果笔记本
    public abstract Notebook getAppleNotebook();
   //生产戴尔笔记本
    public abstract Notebook getDellNotebook();
    //生产联想笔记本
    public abstract Notebook getLenovoNotebook();

}
