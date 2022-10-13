package com.lt.pattern.flyweight.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @author lt
 * @date 2022/10/6 13:42
 * @describe 享元模式，连接池
 */
public class ConnectionPool {

    private Vector<Connection> pool;


    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "123456";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 100;


    public ConnectionPool(){
        pool = new Vector<>(poolSize);
        try {
            Class.forName(driverClassName);
            for (int i = 0 ; i<poolSize; i++) {
                Connection connection = DriverManager.getConnection(url, username, password);
                pool.add(connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection(){

        if (pool.size()>0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }
        return null;
    }

    public synchronized void  release(Connection connection) {
        pool.add(connection);
    }






}
