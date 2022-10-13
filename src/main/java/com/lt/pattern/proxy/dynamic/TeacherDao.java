package com.lt.pattern.proxy.dynamic;


/**
 * @author lt
 * @date 2022/10/13 9:26
 * @describe JDK动态代理，被代理类需要实现接口
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("JDk动态代理开始学习");
    }
}
