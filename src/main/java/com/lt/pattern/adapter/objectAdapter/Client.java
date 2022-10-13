package com.lt.pattern.adapter.objectAdapter;

/**
 * @author lt
 * @date 2022/9/30 11:51
 * @describe
 */
public class Client {

    public static void main(String[] args) {
        AC220 ac220 = new AC220();
        PowerAdapter powerAdapter = new PowerAdapter(ac220);
        System.out.println(powerAdapter.output5V());
    }
}
