package com.lt.pattern.prototype;

import lombok.Data;
import lombok.ToString;

/**
 * @author lt
 * @date 2022/10/14 10:08
 * @describe 原型模式，浅克隆。实现Cloneable接口重新clone方法，浅克隆只能做到创建新的对象并把之前的对象的值传递给
 *          新的对象，但是对象中还包含对象的话还是引用的之前的对象，并不是创建新的
 */
@Data
@ToString
public class ShallowClone implements Cloneable{

    private String name;

    private int age;

    private ShallowClone shallowClone;

    @Override
    protected ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }
}
