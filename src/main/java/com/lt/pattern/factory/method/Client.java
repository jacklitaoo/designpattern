package com.lt.pattern.factory.method;

/**
 * @author lt
 * @date 2022/9/29 16:53
 * @describe 工厂方法模式
 */
public class Client {
    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        operation.setValue1(10);
        operation.setValue2(5);
        System.out.println(operation.getResult());
    }
}
