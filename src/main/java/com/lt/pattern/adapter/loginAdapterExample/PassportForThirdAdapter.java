package com.lt.pattern.adapter.loginAdapterExample;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 15:51
 * @describe 登录适配器
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird{
    @Override
    public ResultMsg<String> loginForQQ(String openId) {
        return loginForRegister(openId, null);
    }

    @Override
    public ResultMsg<String> loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg<String> loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg<String> loginForTelPhone(String phone, String code) {
        return null;
    }

    private ResultMsg<String> loginForRegister(String username, String password) {
        if (password == null) {
            password = "THIRD_EMPTY";
        }
        super.register(username, password);
        return super.login(username, password);
    }
}
