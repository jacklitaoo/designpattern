package com.lt.pattern.adapter.interfaceAdapter;

/**
 * @author lt
 * @date 2022/9/30 14:09
 * @describe 接口设备器
 */
public class AC220 {

    public int outputAC220V() {
        int output = 220;
        System.out.println("输出电压" + 220 + "V");
        return output;
    }
}
