package com.yoyo.pattern.tempalte;

/**
 * 炒菜的抽象基类
 * @author youmxia
 */
public abstract class Dish {

    /**
     * 1.提供模板方法
     * 采用final来修饰，就是保证不会被子类修改
     */
    public final void dishTemplate(){
        //1.加入油，加热
        heatingOil();
        //2.加入蒜蓉，葱花
        addGarlicOnion();
        //3.加入辣椒
        if(isWantsHot()){
            addPepper();
        }
        //4.加入油菜，炒熟
        cooking();
        //5.加入盐，盛盘
        dishOkay();

    }

    /**
     * 加入油，加热
     */
    private void heatingOil() {
        System.out.println("加入油，加热");

    }

    /**
     * 加入蒜蓉，葱花
     */
    private void addGarlicOnion() {
        System.out.println("加入蒜蓉，葱花");

    }

    /**
     * 加入辣椒
     */
    private void addPepper() {
        System.out.println("加入辣椒");

    }

    /**
     * 炒菜的具体方法
     * 采用protected abstract修饰  用于在子类中具体去实现
     */
    protected abstract void cooking();

    /**
     * 加入盐，盛盘
     */
    private void dishOkay() {
        System.out.println("加入盐，盛盘 ");

    }

    /**
     * Hook,钩子函数，子类可以选择是否覆盖
     * @return
     */
    protected boolean isWantsHot() {
        return true;
    }
}
