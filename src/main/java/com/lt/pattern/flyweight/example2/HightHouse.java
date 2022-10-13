package com.lt.pattern.flyweight.example2;

/**
 * @author lt
 * @date 2022/10/7 15:41
 * @describe
 */
public class HightHouse implements House{

    private final String highly;

    public HightHouse(String highly) {
        this.highly = highly;
    }

    @Override
    public void livingRoom(String light) {
        System.out.println(highly + "楼层的客厅" + "采光" + light);
    }
}
