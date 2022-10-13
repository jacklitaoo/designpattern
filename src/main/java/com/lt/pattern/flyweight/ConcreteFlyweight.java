package com.lt.pattern.flyweight;

/**
 * @author lt
 * @date 2022/10/6 10:19
 * @describe 具体享元角色
 */
public class ConcreteFlyweight implements IFlyweight{

    private final String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address" + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + this.intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
