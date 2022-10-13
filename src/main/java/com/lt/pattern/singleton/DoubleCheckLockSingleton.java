package com.lt.pattern.singleton;

/**
 * @author lt
 * @date 2022/10/13 15:58
 * @describe 单例模式，双重检锁
 */
public class DoubleCheckLockSingleton {

    private static DoubleCheckLockSingleton DOUBLE_CHECK_LOCK_SINGLETON;

    private DoubleCheckLockSingleton(){
    }

    public static DoubleCheckLockSingleton getInstance(){
        if (DOUBLE_CHECK_LOCK_SINGLETON == null ){
            // 可能会有多个线程通过判空条件进入，加上synchronized代码块
            synchronized (DoubleCheckLockSingleton.class) {
                // 此处一次只能进入一个线程，然后每一个进来的线程判断对象是否实例化，如果已经实例化则不再实例化
                if (DOUBLE_CHECK_LOCK_SINGLETON == null) {
                     DOUBLE_CHECK_LOCK_SINGLETON = new DoubleCheckLockSingleton();
                }
            }
        }
        return DOUBLE_CHECK_LOCK_SINGLETON;
    }
}
