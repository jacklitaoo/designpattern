package com.lt.pattern.adapter.classAdapter;

/**
 * @author lt
 * @date 2022/9/30 11:45
 * @describe 客户端
 */
public class Client {

    public static void main(String[] args) {
        DC5 powerAdapter = new PowerAdapter();
        System.out.println(powerAdapter.output5V());
    }
}
