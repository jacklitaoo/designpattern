package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 16:56
 * @describe
 */
public class LoginForTelPhoneAdapter extends AbstractAdapter{
    @Override
    public boolean support(Object object) {
        return false;
    }

    @Override
    public ResultMsg<String> login(String id, Object adapter) {
        return super.loginForRegister(id,null);
    }
}
