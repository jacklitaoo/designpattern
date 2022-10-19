package com.lt.pattern.template;

/**
 * @author lt
 * @date 2022/10/19 14:30
 * @describe 模板方法设计模式（一个抽象类中公开定义了执行它的方法模板，它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行）
 */
public abstract class Cooking {

    /**
     * 煮饭模板算法
     */
    final void cookRice(){
        selectIngredients();
        clearIngredients();
        if (isCutting()) {
            cutIngredients();
        }
        cookingIngredients();
        addSeasoning();
        outPot();
        // 钩子方法
        drinkWine();
    };

    /**
     * 选择食材
     */
    abstract void selectIngredients();

    /**
     * 清洗食材
     */
    void clearIngredients(){
        System.out.println("清洗食材");
    }

    /**
     * 切割食材
     */
    void cutIngredients(){
        System.out.println("切割食材");
    }

    /**
     * 烹煮食材
     */
    void cookingIngredients(){
        System.out.println("烹煮食材");
    }

    /**
     * 放入调味品
     */
    abstract void addSeasoning();

    /**
     * 出锅
     */
    void outPot(){
        System.out.println("出锅");
    }

    /**
     * 喝酒 （钩子方法），子类可实现可不实现
     */
    protected void drinkWine(){
    }

    /**
     * 方法开关
     */
    protected boolean isCutting(){
        return true;
    }


}
