package com.lt.pattern.proxy.cglib;

import lombok.Data;

/**
 * @author lt
 * @date 2022/10/13 10:37
 * @describe cglib动态代理
 */
@Data
public class TeacherDao {

    private String name ;

    public TeacherDao(String name) {
        this.name = name;
    }

    public TeacherDao() {
    }

    public void teach(String course) {
        System.out.println(course + " " + name + " 正在学习");
    }

    public String classOver(){
        System.out.println("里斯下课了");
        return "里斯";
    }

}
