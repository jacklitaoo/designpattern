package com.lt.pattern.factory.method;

/**
 * @author lt
 * @date 2022/9/29 16:34
 * @describe
 */
public class DivFactory extends IFactory{
    @Override
    Operation createOperation() {
        return new OperationDiv();
    }
}
