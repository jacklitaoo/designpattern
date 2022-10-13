package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 9:48
 * @describe
 */
public class BenzSportCar implements BenzCar{
    @Override
    public void speed() {
        System.out.println("奔驰跑车速度 150km/h");
    }
}
