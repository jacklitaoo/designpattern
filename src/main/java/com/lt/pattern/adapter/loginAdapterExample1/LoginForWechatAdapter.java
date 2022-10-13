package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 17:14
 * @describe
 */
public class LoginForWechatAdapter extends AbstractAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    @Override
    public ResultMsg<String> login(String id, Object adapter) {
        return super.loginForRegister(id,null);
    }
}
