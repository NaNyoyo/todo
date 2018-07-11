package com.yoyo.factory.factoryMethod;

import com.yoyo.factory.Notebook;

public interface Factory {
    //工厂必然具备生产产品的技能，统一的产品入口
    Notebook getNotebook();
}
