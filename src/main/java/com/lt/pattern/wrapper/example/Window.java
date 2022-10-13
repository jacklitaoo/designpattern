package com.lt.pattern.wrapper.example;

/**
 * @author lt
 * @date 2022/10/7 14:31
 * @describe 装饰设计模式
 */
public interface Window {
    /**
     *  绘制窗口
     */
    void draw();


    /**
     * 返回窗口描述
     */
    String getDescription();
}
