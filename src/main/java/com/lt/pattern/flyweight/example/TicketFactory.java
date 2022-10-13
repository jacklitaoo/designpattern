package com.lt.pattern.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lt
 * @date 2022/10/6 11:34
 * @describe
 */
public class TicketFactory {

    private static final Map<String, ITicket> POOL = new HashMap<>();


    public static ITicket queryTicket(String from, String to) {

        String key = from + "->" + to;
        if (POOL.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return POOL.get(key);
        }
        System.out.println("首次查询，创建对象：" + key);
        ITicket trainTicket = new TrainTicket(from, to);
        POOL.put(key, trainTicket);
        return trainTicket;
    }
}
