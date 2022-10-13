package com.lt.pattern.adapter.loginAdapterExample;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 15:58
 * @describe
 */
public class Client {

    public static void main(String[] args) {

        IPassportForThird passportForThirdAdapter = new PassportForThirdAdapter();
        ResultMsg<String> tom = passportForThirdAdapter.loginForTelPhone("tom", "18328594415");


    }
}
