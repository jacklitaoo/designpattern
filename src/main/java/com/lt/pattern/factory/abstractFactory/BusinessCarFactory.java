package com.lt.pattern.factory.abstractFactory;

/**
 * @author lt
 * @date 2022/9/30 9:56
 * @describe
 */
public class BusinessCarFactory implements CarFactory{
    @Override
    public BenzCar getBenzCar() {
        return new BenzBusinessCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}
