package com.lt.pattern.adapter.objectAdapter;

/**
 * @author lt
 * @date 2022/9/30 11:47
 * @describe 对象适配器
 */
public class PowerAdapter implements DC5{

    private final AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int input = ac220.outputAC220V();
        int output = input / 44;
        System.out.println("使用Adpater输入AC " + input + "V,输出DC"  + output  + "V");
        return output;
    }
}
