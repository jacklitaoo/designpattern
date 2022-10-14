package com.lt.pattern.prototype;

import java.io.IOException;

/**
 * @author lt
 * @date 2022/10/14 9:41
 * @describe
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 使用正常情况下写的，缺点如果属性越多编写就越多（不推荐使用）
        System.out.println("********************正常情况下编写******************");
        normalSheep();

        // 使用继承了Cloneable的情况
        System.out.println("********************使用继承了Cloneable******************");
        cloneableModel();

        // 深克隆使用序列化的方式
        System.out.println("*********************深克隆序列化方式************************");
        deepCloneModel();
    }


    private static void deepCloneModel() throws IOException, ClassNotFoundException {
        DeepClone deepClone = new DeepClone();
        deepClone.setAge(26);
        deepClone.setName("周五");

        DeepClone officialDeepClone = new DeepClone();
        officialDeepClone.setAge(24);
        officialDeepClone.setName("周六");
        officialDeepClone.setDeepCloneObject(deepClone);

        DeepClone clone = officialDeepClone.deepClone();
        clone.setName("周天");
        deepClone.setName("周天");
        System.out.println(officialDeepClone);
        System.out.println(clone);
        System.out.println(clone == officialDeepClone);
        System.out.println(clone.getDeepCloneObject() == officialDeepClone.getDeepCloneObject());

    }

    private static void cloneableModel() throws CloneNotSupportedException {
        ShallowClone shallClone = new ShallowClone();
        shallClone.setName("王五");
        shallClone.setAge(23);

        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setAge(25);
        shallowClone.setName("李四");
        shallowClone.setShallowClone(shallClone);


        ShallowClone clone = shallowClone.clone();
        clone.setName("克隆李四");
        shallClone.setName("克隆王五");
        System.out.println(shallowClone);
        System.out.println(clone);
        System.out.println(clone == shallClone);
        System.out.println(clone.getShallowClone() == shallowClone.getShallowClone());


    }


    private static void normalSheep() {
        NormalSheep sleepSheep = new NormalSheep();
        sleepSheep.setName("睡眠羊");
        sleepSheep.setAge(23);


        NormalSheep normalSheep = new NormalSheep();
        normalSheep.setAge(26);
        normalSheep.setName("小丑羊");
        normalSheep.setRepeatSheep(sleepSheep);


        NormalSheep clone = normalSheep.clone();
        clone.setName("克隆的小丑羊");
        System.out.println(normalSheep);
        System.out.println(clone);
        System.out.println(normalSheep == clone);
        System.out.println(normalSheep.getRepeatSheep() == clone.getRepeatSheep());
    }
}
