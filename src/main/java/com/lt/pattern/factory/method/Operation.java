package com.lt.pattern.factory.method;

import lombok.Data;

/**
 * @author lt
 * @date 2022/9/29 15:21
 * @describe 工厂方法模式
 */
@Data
public abstract class Operation {

    private double value1 = 0.0;
    private double value2 = 0.0;


    /**
     * 获得结果
     * @return 结果
     */
    protected abstract double getResult ();
}
