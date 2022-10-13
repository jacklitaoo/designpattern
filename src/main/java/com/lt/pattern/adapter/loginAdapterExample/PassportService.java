package com.lt.pattern.adapter.loginAdapterExample;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 14:47
 * @describe 登录适配器例子
 */
public class PassportService {

    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @return         结果
     */
    public ResultMsg<String> register(String username, String password){
        return new ResultMsg<>(200, "注册成功", "成功");
    }

    public ResultMsg<String> login(String username, String password){
        return null;
    }
}
