package com.lt.pattern.wrapper.example1;

/**
 * @author lt
 * @date 2022/10/7 15:36
 * @describe
 */
public class Client {

    public static void main(String[] args) {

        House house = new HardcoverHouse(new CementHouse());
        house.livingRoom();
    }
}
