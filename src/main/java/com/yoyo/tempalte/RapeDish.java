package com.yoyo.tempalte;
/**
 * 炒油菜
 * @author youmxia
 *
 */
public class RapeDish extends Dish {

    @Override
    protected void cooking() {
        System.out.println("加入油菜，炒熟 ");
    }

    /**
     * 重写父类钩子函数
     * 炒白菜不要辣椒
     * @return
     */
    @Override
    protected boolean isWantsHot() {
        return false;
    }
}
