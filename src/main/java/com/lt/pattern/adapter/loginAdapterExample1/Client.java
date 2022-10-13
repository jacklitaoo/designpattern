package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.adapter.loginAdapterExample.IPassportForThird;

/**
 * @author lt
 * @date 2022/9/30 17:28
 * @describe
 */
public class Client {

    public static void main(String[] args) {
        IPassportForThird passportForThirdAdapter = new PassportForThirdAdapter();
        passportForThirdAdapter.loginForQQ("asdasdsca213gvdfqaed");
    }
}
