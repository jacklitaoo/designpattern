package com.lt.pattern.adapter.interfaceAdapter;



/**
 * @author lt
 * @date 2022/9/30 14:23
 * @describe
 */
public class Client {

    public static void main(String[] args) {
        DC powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.output5V();
    }
}
