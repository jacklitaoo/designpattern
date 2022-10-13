package com.lt.pattern.proxy.cglib;

/**
 * @author lt
 * @date 2022/10/13 11:05
 * @describe
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        // 带参数的构造方法
        TeacherDao teacherDao = new TeacherDao("张三");
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) cglibProxyFactory.getProxyInstance();
        // 传参到cglib动态代理对象的方法上
        proxyInstance.teach("cglib动态代理");

        // 获取到cglib动态代理返回的参数
        String s = proxyInstance.classOver();
        System.out.println("最后的结果" + s);
    }
}
