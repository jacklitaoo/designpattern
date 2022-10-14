package com.lt.pattern.prototype;

import lombok.Data;
import lombok.ToString;

/**
 * @author lt
 * @date 2022/10/14 9:37
 * @describe 原型模式（正常编写）,将属性值原封不动的放入一个新的对象
 *           如果属性比较多编写起来就比较麻烦，考虑到每一个属性值都需要放入新的对象中
 */
@Data
@ToString
public class NormalSheep {

    private String name;

    private int age;

    private NormalSheep repeatSheep;


    @Override
    public NormalSheep clone(){
        NormalSheep normalSheep = new NormalSheep();
        normalSheep.setAge(age);
        normalSheep.setName(name);

        NormalSheep normalSheep1 = new NormalSheep();
        normalSheep1.setRepeatSheep(repeatSheep.getRepeatSheep());
        normalSheep1.setAge(repeatSheep.getAge());
        normalSheep1.setName(repeatSheep.getName());
        normalSheep.setRepeatSheep(normalSheep1);

        return normalSheep;
    }
}
