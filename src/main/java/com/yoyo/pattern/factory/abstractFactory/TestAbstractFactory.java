package com.yoyo.pattern.factory.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        //对用户而言更加简单了，用户只有选择权，保证了程序的健壮性
        NotebookFactory notebookFactory = new NotebookFactory();
        System.out.println(notebookFactory.getAppleNotebook().getName());

    }
}
