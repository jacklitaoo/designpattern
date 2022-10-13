package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 9:53
 * @describe 抽象工厂
 */
public class SportCarFactory implements CarFactory{
    @Override
    public BenzCar getBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}
