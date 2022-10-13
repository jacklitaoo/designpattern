package com.lt.pattern.wrapper.example;

/**
 * @author lt
 * @date 2022/10/7 14:37
 * @describe 装饰类
 */
public class WindowDecoratorWrapper implements Window{
    private Window wrapper;

    public WindowDecoratorWrapper(Window wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void draw() {
        wrapper.draw();
    }

    @Override
    public String getDescription() {
        return wrapper.getDescription();
    }
}
