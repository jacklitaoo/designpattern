package com.lt.pattern.template;

/**
 * @author lt
 * @date 2022/10/19 15:44
 * @describe 模板方法模式
 */
public class WildCooking extends Cooking{
    @Override
    void selectIngredients() {
        System.out.println("准备鸡脚，肥肠，牛肉，花菜，豆腐干");
    }

    @Override
    void addSeasoning() {
        System.out.println("添加卤料，辣椒，盐");
    }

    @Override
    protected void drinkWine() {
        System.out.println("户外野炊我要喝Rio鸡尾酒");
    }

    /**
     * 不需要切割食材
     */
    @Override
    protected boolean isCutting() {
        return false;
    }
}
