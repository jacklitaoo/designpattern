package com.lt.pattern.proxy.staticstate;

/**
 * @author lt
 * @date 2022/10/13 9:14
 * @describe
 */
public class TeacherProxy implements ITeacherDao{

    private ITeacherDao iTeacherDao;

    public TeacherProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("静态代理，执行方法前");
        iTeacherDao.teach();
        System.out.println("静态代理，执行方法后");
    }
}
