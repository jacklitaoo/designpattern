package com.lt.pattern.wrapper.example1;

import lombok.Data;

/**
 * @author lt
 * @date 2022/10/7 15:32
 * @describe 抽象装饰类：继承了抽象构件，
 *          并且内部维护一个抽象构件的对象
 */
@Data
public class HouseWrapper implements House{

    private House house;

    public HouseWrapper(House house) {
        this.house = house;
    }

    @Override
    public void livingRoom() {
        house.livingRoom();
    }
}
