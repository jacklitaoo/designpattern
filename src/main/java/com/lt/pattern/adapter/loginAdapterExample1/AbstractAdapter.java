package com.lt.pattern.adapter.loginAdapterExample1;

import com.lt.pattern.util.ResultMsg;

/**
 * @author lt
 * @date 2022/9/30 16:39
 * @describe
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter{

    protected ResultMsg<String> loginForRegister (String username, String password) {
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.register(username, password);
        return super.login(username, password);
    }
}
