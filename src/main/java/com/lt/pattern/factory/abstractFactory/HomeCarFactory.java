package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 10:40
 * @describe
 */
public class HomeCarFactory implements CarFactory{
    @Override
    public BenzCar getBenzCar() {
        return new BenzHomeCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaHomeCar();
    }
}
