package com.yoyo.tempalte;

public class DishTest {
    public static void main(String[] args) {
        System.out.println("炒油菜start。。。");
        Dish dish = new RapeDish();
        dish.dishTemplate();
        System.out.println("炒油菜end");

        System.out.println("==============我是分割线================");

        System.out.println("炒白菜start。。。");
        Dish dish2 = new CabbageDish();
        dish2.dishTemplate();
        System.out.println("炒白菜end");



    }
}
