package com.lt.pattern.adapter.classAdapter;

/**
 * @author lt
 * @date 2022/9/30 11:42
 * @describe 适配器类
 */
public class PowerAdapter extends AC220 implements DC5{
    @Override
    public int output5V() {
        int input = super.outputAC220V();
        int output = input/44;
        System.out.println("使用Adapter输出AC " + input + " V,输出DC" + output + "v");
        return output;
    }
}
