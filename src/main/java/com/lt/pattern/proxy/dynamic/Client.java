package com.lt.pattern.proxy.dynamic;

/**
 * @author lt
 * @date 2022/10/13 10:08
 * @describe
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        //                      *****注意******
        // 代理工厂返回代理类需要强转成接口，因为是对接口做的代理对象，转成实际代理类会报
        // com.sun.proxy.$Proxy0 cannot be cast to com.lt.pattern.proxy.dynamic.TeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();

    }
}
