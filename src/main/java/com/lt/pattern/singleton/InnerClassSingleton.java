package com.lt.pattern.singleton;

/**
 * @author lt
 * @date 2022/10/14 9:15
 * @describe 单例模式，静态内部类。线程安全，相对于其他类型单例模式略微复杂一点
 */
public class InnerClassSingleton {


    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return Inner.innerClassSingleton;

    }

    private static class Inner{
        static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
}
