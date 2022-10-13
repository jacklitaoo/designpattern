package com.lt.pattern.adapter.classAdapter;

/**
 * @author lt
 * @date 2022/9/30 11:31
 * @describe 类适配器
 */
public class AC220 {

    /**
     * 输出电压
     * @return 输出电压
     */
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电压 :" + output + "v");
        return output;
    }
}
