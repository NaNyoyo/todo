package com.yoyo.factory.simpleFactory;

import com.yoyo.factory.Notebook;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getNoteBook("联想").getName());

    }
}
