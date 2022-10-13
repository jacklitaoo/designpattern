package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.adapter.loginAdapterExample.IPassportForThird;
import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 17:17
 * @describe
 */
public class PassportForThirdAdapter implements IPassportForThird {
    @Override
    public ResultMsg<String> loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg<String> loginForWechat(String openId) {
        return processLogin(openId, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg<String> loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg<String> loginForTelPhone(String phone, String code) {
        return processLogin(phone, LoginForTelPhoneAdapter.class);
    }

    private ResultMsg<String> processLogin(String id,Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
