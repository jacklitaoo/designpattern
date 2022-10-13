package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 16:46
 * @describe QQ登录适配器
 */
public class LoginForQQAdapter extends AbstractAdapter{
    @Override
    public boolean support(Object object) {

        return object instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg<String> login(String id, Object adapter) {
        if (support(adapter)){return null;}
        //accesseToken
        //time
        return super.loginForRegister(id,null);
    }
}
