package com.example.jdbcexam_trantienmanh.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySql {
    public static Connection getconnection(){
        String jdbcURL = "jdbc:mysql://localhost:3306/testmodul3";
        String jdbcUsername = "root";
        String jdbcPassword = "123456";
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return connection;
    }
}
