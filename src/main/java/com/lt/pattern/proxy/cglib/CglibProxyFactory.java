package com.lt.pattern.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lt
 * @date 2022/10/13 10:40
 * @describe cglib动态代理，不需要实现具体接口，
 *             内存中创建被代理类的子类，被代理类不能是final修饰（被final修饰的类不能被继承），被代理类方法不能是final和static的
 */
public class CglibProxyFactory implements MethodInterceptor {

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 代理类的父类（就是目标类，因为代理类是目标类的子类）
        enhancer.setSuperclass(target.getClass());
        /**
         * enhancer.setCallback(new MethodInterceptor() {
         *             @Override
         *             public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy)
         *                     throws Throwable {
         *                 System.out.println("before");
         *                 Object res = methodProxy.invokeSuper(obj, args);
         *                 System.out.println("after");
         *                 return res;
         *             }
         *         });
         */
        // 回调，该回调必须实现了MethodInterceptor接口，并重写intercept方法
        enhancer.setCallback(this);

        // 创建
        return enhancer.create();
    }

    /**
     *
     * @param o 被代理的目标类
     * @param method 调用的被代理类的方法
     * @param args   被调用方法的具体参数
     * @param methodProxy 被调用方法的代理
     * @return       代理类方法的返回参数
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行cglib动态代理方法之前");
        Object invoke = method.invoke(target, args);
        System.out.println("执行cglib动态代理方法之后");
        return invoke;
    }
}
