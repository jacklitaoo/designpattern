package com.lt.pattern.factory.simple;

/**
 * @author lt
 * @date 2022/9/29 15:27
 * @describe
 */
public class OperationAdd extends Operation{
    @Override
    protected double getResult() {
        return getValue1() + getValue2();
    }
}
