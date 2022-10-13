package com.lt.pattern.adapter.loginAdapterExample;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 15:09
 * @describe
 */
public interface IPassportForThird {

    /**
     * QQ登录
     * @param openId openId
     * @return 登录信息
     */
    ResultMsg<String> loginForQQ(String openId);

    /**
     * wechat登录
     * @param openId openId
     * @return 登录信息
     */
    ResultMsg<String> loginForWechat(String openId);

    /**
     * token登录
     * @param token token
     * @return 登录信息
     */
    ResultMsg<String> loginForToken(String token);

    /**
     * 电话短信登录
     * @param phone 电话
     * @param code 验证码
     * @return 登录信息
     */
    ResultMsg<String> loginForTelPhone(String phone, String code);
}
