package com.lt.pattern.factory.method;


/**
 * @author lt
 * @date 2022/9/29 15:29
 * @describe
 */
public class OperationMul extends Operation {
    @Override
    protected double getResult() {
        return getValue1() * getValue2();
    }
}
