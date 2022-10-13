package com.lt.pattern.factory.method;

/**
 * @author lt
 * @date 2022/9/29 16:32
 * @describe
 */
public class AddFactory extends IFactory{
    @Override
    Operation createOperation() {
        return new OperationAdd();
    }
}
