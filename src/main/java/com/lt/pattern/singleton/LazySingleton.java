package com.lt.pattern.singleton;

/**
 * @author lt
 * @date 2022/10/14 8:54
 * @describe 单例模式（懒加载） ，存在线程安全问题。不推荐使用，推荐dcl方式
 */
public class LazySingleton {

    private static LazySingleton singleton;


    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (singleton == null) {
           singleton = new LazySingleton();
        }
        return singleton;
    }

}
