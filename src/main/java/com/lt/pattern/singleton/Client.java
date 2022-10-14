package com.lt.pattern.singleton;

/**
 * @author lt
 * @date 2022/10/14 9:19
 * @describe
 */
public class Client {

    public static void main(String[] args) {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        System.out.println(instance == instance1);

    }
}
