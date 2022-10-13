package com.lt.pattern.factory.simple;

/**
 * @author lt
 * @date 2022/9/29 15:32
 * @describe
 */
public class Client {
    public static void main(String[] args) {

        Operation operation = OperationFactory.createOperation("+");
        operation.setValue1(6.0);
        operation.setValue2(4.0);
        System.out.println(operation.getResult());

    }
}
