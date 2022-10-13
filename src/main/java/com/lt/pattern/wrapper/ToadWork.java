package com.lt.pattern.wrapper;

/**
 * @author lt
 * @date 2022/10/7 10:21
 * @describe 具体装饰类：负责增强构件的功能或给构件增加新的功能。
 */
public class ToadWork extends InternalWork {
    public ToadWork(GongFu gongFu) {
        super(gongFu);
    }

    @Override
    public int attack() {
        // 具体构件原本的行为
        int attack = super.attack();
        // 具体装饰类增强了具体构件行为
        attack *=100;
        System.out.println("学习了蛤蟆功，功力增强了100倍，输出战力" + attack);
        return attack;
    }
}
