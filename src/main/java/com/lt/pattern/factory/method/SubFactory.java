package com.lt.pattern.factory.method;

/**
 * @author lt
 * @date 2022/9/29 16:46
 * @describe
 */
public class SubFactory extends IFactory{
    @Override
    Operation createOperation() {
        return new OperationSub();
    }
}
