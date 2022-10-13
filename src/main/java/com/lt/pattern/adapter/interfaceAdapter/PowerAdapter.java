package com.lt.pattern.adapter.interfaceAdapter;

/**
 * @author lt
 * @date 2022/9/30 14:11
 * @describe 接口适配器
 */
public class PowerAdapter implements DC{
    private final AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int input = ac220.outputAC220V();
        int output = input / 44;
        System.out.println("使用Adapter输入AC" + input +"V,输出DC" + output +"V");
        return output;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
