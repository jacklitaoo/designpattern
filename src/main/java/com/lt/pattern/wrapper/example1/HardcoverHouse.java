package com.lt.pattern.wrapper.example1;

/**
 * @author lt
 * @date 2022/10/7 15:34
 * @describe 具体装饰类：负责增强构件的功能或给构件增加新的功能。
 */
public class HardcoverHouse extends HouseWrapper {

    public HardcoverHouse(House house) {
        super(house);
    }

    @Override
    public void livingRoom() {
        super.livingRoom();
        System.out.println("对清水房客厅进行装修");
        System.out.println("得到精装房客厅");
    }
}
