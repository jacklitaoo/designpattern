package com.lt.pattern.factory.method;


/**
 * @author lt
 * @date 2022/9/29 16:35
 * @describe
 */
public class MulFactory extends IFactory{
    @Override
    Operation createOperation() {
        return new OperationMul();
    }
}
