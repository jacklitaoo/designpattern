package com.lt.pattern.wrapper;

/**
 * @author lt
 * @date 2022/10/7 10:10
 * @describe  具体构件：拥有自己的行为 包装器设计模式（降龙十八掌）
 */
public class EighteenHandsToFallDragon implements GongFu {
    @Override
    public int attack() {
        System.out.println("降龙18掌，输出战力20");
        return 20;
    }
}

