package com.lt.pattern.template;

/**
 * @author lt
 * @date 2022/10/19 15:35
 * @describe 模板方法模式
 */
public class HomeCooking extends Cooking{
    @Override
    void selectIngredients() {
        System.out.println("潮汕牛肉");
    }

    @Override
    void addSeasoning() {
        System.out.println("少许盐");
    }

    /**
     * 重写钩子方法
     */
    @Override
    protected void drinkWine() {
        System.out.println("喝点少许果酒");
    }
}
