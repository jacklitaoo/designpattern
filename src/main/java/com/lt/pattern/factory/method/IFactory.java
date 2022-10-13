package com.lt.pattern.factory.method;

/**
 * @author lt
 * @date 2022/9/29 16:29
 * @describe 工厂方法模式
 */
public abstract class IFactory {

    /**
     * 创建实例（产品）对象
     * @return 实例（产品）
     */
   abstract  Operation createOperation();
}
