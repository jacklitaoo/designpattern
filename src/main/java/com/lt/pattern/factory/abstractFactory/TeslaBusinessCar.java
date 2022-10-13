package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 9:51
 * @describe
 */
public class TeslaBusinessCar implements TeslaCar{

    @Override
    public void speed() {
        System.out.println("特斯拉商务车速度 140km/h");
    }
}
