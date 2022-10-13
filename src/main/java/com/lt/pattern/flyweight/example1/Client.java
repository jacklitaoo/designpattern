package com.lt.pattern.flyweight.example1;

import java.sql.Connection;

/**
 * @author lt
 * @date 2022/10/6 14:31
 * @describe
 */
public class Client {

    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection = connectionPool.getConnection();
        System.out.println(connection);
    }
}
