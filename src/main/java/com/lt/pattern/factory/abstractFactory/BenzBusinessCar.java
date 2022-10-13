package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 9:49
 * @describe
 */
public class BenzBusinessCar implements BenzCar{
    @Override
    public void speed() {
        System.out.println("奔驰业务车速度 120km/h");
    }
}
