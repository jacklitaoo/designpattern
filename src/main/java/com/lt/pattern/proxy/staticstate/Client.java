package com.lt.pattern.proxy.staticstate;

/**
 * @author lt
 * @date 2022/10/13 9:19
 * @describe 静态代理
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        TeacherProxy teacherProxy = new TeacherProxy(teacherDao);
        teacherProxy.teach();
    }
}
