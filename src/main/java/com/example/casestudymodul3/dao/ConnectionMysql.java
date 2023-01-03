package com.example.casestudymodul3.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMysql {
    public static Connection getConnection() {
        String jdbcURL = "jdbc:mysql://localhost:3306/casemodul3";
        String jdbcUsername = "root";
        String jdbcPassword = "12345678";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return connection;
    }
}
