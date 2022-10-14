package com.lt.pattern.prototype;

import lombok.Data;
import lombok.ToString;

import java.io.*;

/**
 * @author lt
 * @date 2022/10/14 11:27
 * @describe 原型模式，深克隆（采用序列化的方式）,克隆目标对象的基本属性对象及目标对象的引用属性对象，引用属性对象将创建新的对象
 */
@Data
@ToString
public class DeepClone extends DeepCloneSerializable implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name ;

    private int age;

    private DeepClone deepCloneObject;

}
