package com.lt.pattern.wrapper;

/**
 * @author lt
 * @date 2022/10/7 10:25
 * @describe
 */
public class Client {

    public static void main(String[] args) {

        InternalWork toadWork = new ToadWork(new EighteenHandsToFallDragon());
        int attack = toadWork.attack();
        System.out.println(attack);

    }
}
