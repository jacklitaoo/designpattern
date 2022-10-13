package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 9:52
 * @describe
 */
public interface CarFactory {

    /**
     * 获得奔驰车实例
     * @return 实例
     */
    BenzCar getBenzCar();

    /**
     * 获得特斯拉实例
     * @return 实例
     */
    TeslaCar getTeslaCar();
}
