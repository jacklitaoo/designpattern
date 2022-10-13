package com.lt.pattern.proxy.staticstate;

/**
 * @author lt
 * @date 2022/10/13 9:13
 * @describe 静态代理
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("开始学习");
    }
}
