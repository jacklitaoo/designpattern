package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 10:39
 * @describe
 */
public class TeslaHomeCar implements TeslaCar{
    @Override
    public void speed() {
        System.out.println("特斯拉家庭用车 120km/h");
    }
}
