package com.lt.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lt
 * @date 2022/10/6 10:23
 * @describe 享元工厂
 */
public class FlyweightFactory {

    private static final Map<String, IFlyweight> POOL = new HashMap<>(16);


    /**
     * 因为内部状态具有不变性，因此作为缓存的键
     *
     * @param intrinsicState 内部状态
     * @return 具体的享元
     */
    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!POOL.containsKey(intrinsicState)) {
            ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(intrinsicState);
            POOL.put(intrinsicState, concreteFlyweight);
        }
        return POOL.get(intrinsicState);
    }
}
