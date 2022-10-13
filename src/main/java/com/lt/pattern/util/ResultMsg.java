package com.lt.pattern.util;

import lombok.Data;

/**
 * @author lt
 * @date 2022/9/30 14:44
 * @describe
 */
@Data
public class ResultMsg<T> {

    private int code;

    private String msg;

    private T data;

    public ResultMsg(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
