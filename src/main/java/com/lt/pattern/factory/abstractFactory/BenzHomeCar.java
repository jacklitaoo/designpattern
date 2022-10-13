package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 10:39
 * @describe
 */
public class BenzHomeCar implements BenzCar{
    @Override
    public void speed() {
        System.out.println("奔驰家庭用车速度 110km/h");
    }
}
