package com.lt.pattern.wrapper.example;

/**
 * @author lt
 * @date 2022/10/7 14:43
 * @describe
 */
public class VerticalScrollbar extends WindowDecoratorWrapper{

    public VerticalScrollbar(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawVerticalScrollbar();
    }

    @Override
    public String getDescription() {
        drawVerticalScrollbar();
        return super.getDescription();
    }

    private void drawVerticalScrollbar(){
        System.out.println("经过装饰，画垂直滚动条");
    }
}
