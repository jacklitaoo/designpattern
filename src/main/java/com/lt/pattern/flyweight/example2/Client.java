package com.lt.pattern.flyweight.example2;

/**
 * @author lt
 * @date 2022/10/7 17:22
 * @describe
 */
public class Client {

    public static void main(String[] args) {

        House house = HouseFactory.getHouse("16楼");
        house.livingRoom("明亮");

    }
}
