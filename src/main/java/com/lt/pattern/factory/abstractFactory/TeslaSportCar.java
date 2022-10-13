package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 9:50
 * @describe
 */
public class TeslaSportCar implements TeslaCar{

    @Override
    public void speed() {
        System.out.println("特斯拉跑车 180km/h");
    }
}
