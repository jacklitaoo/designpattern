package com.lt.pattern.singleton;

/**
 * @author lt
 * @date 2022/10/14 9:04
 * @describe 单例模式，静态代码块。不存在线程安全问题，推荐使用
 */
public class StaticTypeSingleton {

    private static final StaticTypeSingleton STATIC_TYPE_SINGLETON;

    static {
        STATIC_TYPE_SINGLETON = new StaticTypeSingleton();
    }

    private StaticTypeSingleton(){}


    public static StaticTypeSingleton getInstance(){
        return STATIC_TYPE_SINGLETON;
    }
}
