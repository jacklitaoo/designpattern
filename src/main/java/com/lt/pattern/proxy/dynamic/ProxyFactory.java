package com.lt.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author lt
 * @date 2022/10/13 9:34
 * @describe　代理工厂喜，ＪＤＫ动态代理，被代理类需要实现接口
 */
public class ProxyFactory {

    /**
     * 被代理目标类
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    /**
     *     public static Object newProxyInstance(ClassLoader loader,
     *                                           Class<?>[] interfaces,
     *                                           InvocationHandler h)
     *      1.ClassLoader loader 被代理类的类加载
     *      2.Class<?>[] interfaces 被代理类的接口
     *      3.InvocationHandler h 被代理类的执行
     *
     *  @return Object 执行代理对象方法后的返回值
     */
    public Object getProxyInstance(){
        Object returnVal = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    /**
                     * target 被代理的类
                     * args   被代理类的方法参数
                     */
                    System.out.println("执行JDK动态代理方法之前");
                    Object invoke = method.invoke(target, args);
                    System.out.println("执行JDK动态代理方法之后");
                    return invoke;
                });
        return returnVal;
    }
}
