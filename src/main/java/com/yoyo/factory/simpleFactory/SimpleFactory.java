package com.yoyo.factory.simpleFactory;

import com.yoyo.factory.Apple;
import com.yoyo.factory.Dell;
import com.yoyo.factory.Lenovo;
import com.yoyo.factory.Notebook;

public class SimpleFactory {
    public Notebook getNoteBook(String name){
        if("联想".equals(name)){
            return new Lenovo();
        }else if ("戴尔".equals(name)){
            return new Dell();
        }else if ("苹果".equals(name)){
            return new Apple();
        }else{
            System.out.println("无法生产此类的笔记本");
            return  null;
        }
    }
}
