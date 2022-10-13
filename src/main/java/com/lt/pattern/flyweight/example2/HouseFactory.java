package com.lt.pattern.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lt
 * @date 2022/10/7 15:46
 * @describe
 */
public class HouseFactory {

    private static final Map<String, House> MAP = new HashMap<>();

    public static synchronized House getHouse(String highly){

        if (!MAP.containsKey(highly)) {
            HightHouse house = new HightHouse(highly);
            MAP.put(highly, house);
        }
        return  MAP.get(highly);
    }
}
