package com.lt.pattern.flyweight;

/**
 * @author lt
 * @date 2022/10/6 10:30
 * @describe
 */
public class Client {

    public static void main(String[] args) {

        IFlyweight aa = FlyweightFactory.getFlyweight("aa");
        IFlyweight bb = FlyweightFactory.getFlyweight("bb");
        aa.operation("a");
        aa.operation("b");

    }
}
