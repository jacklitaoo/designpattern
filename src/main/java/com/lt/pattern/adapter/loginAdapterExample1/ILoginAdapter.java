package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 16:32
 * @describe 登录适配器 接口
 */
public interface ILoginAdapter {

    boolean support(Object object);

    ResultMsg<String> login(String id, Object adapter);
}
