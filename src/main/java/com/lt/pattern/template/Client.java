package com.lt.pattern.template;

/**
 * @author lt
 * @date 2022/10/19 15:36
 * @describe 模板方法模式
 */
public class Client {

    public static void main(String[] args) {

        Cooking homeCooking = new HomeCooking();
        homeCooking.cookRice();
        System.out.println("--------------------------------------------------");
        Cooking wildCooking = new WildCooking();
        wildCooking.cookRice();
    }
}
