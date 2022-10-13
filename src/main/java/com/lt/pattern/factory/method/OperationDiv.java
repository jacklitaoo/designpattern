package com.lt.pattern.factory.method;

/**
 * @author lt
 * @date 2022/9/29 15:30
 * @describe
 */
public class OperationDiv extends Operation {
    @Override
    protected double getResult() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为0");
    }
}
