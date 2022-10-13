package com.lt.pattern.factory.method;


/**
 * @author lt
 * @date 2022/9/29 15:28
 * @describe
 */
public class OperationSub extends Operation {
    @Override
    protected double getResult() {
        return getValue1() - getValue2();
    }
}
