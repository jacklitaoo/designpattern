package com.lt.pattern.wrapper;

import lombok.Data;

/**
 * @author lt
 * @date 2022/10/7 10:16
 * @describe 抽象装饰类：继承了抽象构件，
 *          并且内部维护一个抽象构件的对象
 */
@Data
public class InternalWork implements GongFu{
    private GongFu gongFu;

    public InternalWork(GongFu gongFu) {
        this.gongFu = gongFu;
    }


    @Override
    public int attack() {
        return gongFu.attack();
    }
}
