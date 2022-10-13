package com.lt.pattern.wrapper.example1;

/**
 * @author lt
 * @date 2022/10/7 15:30
 * @describe 具体构件：拥有自己的行为
 */
public class CementHouse implements House{

    @Override
    public void livingRoom() {
        System.out.println("清水房客厅");
    }
}
