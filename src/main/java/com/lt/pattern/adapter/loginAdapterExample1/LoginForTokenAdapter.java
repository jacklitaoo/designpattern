package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 16:57
 * @describe
 */
public class LoginForTokenAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    @Override
    public ResultMsg<String> login(String id, Object adapter) {
        return super.loginForRegister(id,null);
    }
}
