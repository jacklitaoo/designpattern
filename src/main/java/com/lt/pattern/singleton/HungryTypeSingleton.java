package com.lt.pattern.singleton;

/**
 * @author lt
 * @date 2022/10/14 8:59
 * @describe 饿汉式，不存在线程安全的问题。初始化就实例化对象，可能存在内存浪费。推荐使用
 */
public class HungryTypeSingleton {

    private static final HungryTypeSingleton HUNGRY_TYPE_SINGLETON = new HungryTypeSingleton();


    private HungryTypeSingleton(){}


    public static HungryTypeSingleton getInstance(){
        return HUNGRY_TYPE_SINGLETON;
    }
}
