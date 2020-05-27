package com.yoyo.pattern.factory.factoryMethod;

import com.yoyo.pattern.factory.Notebook;

public interface Factory {
    //工厂必然具备生产产品的技能，统一的产品入口
    Notebook getNotebook();
}
