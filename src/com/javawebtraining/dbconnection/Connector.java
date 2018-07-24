package com.javawebtraining.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static final String _USERNAME = "root";
    private static final String _PASSWORD = "root";
    private static final String _HOST = "jdbc:mysql://localhost:3306/";
    private static final String _DB = "bookstore";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = _HOST+_DB;
        Connection con = DriverManager.getConnection(url,_USERNAME,_PASSWORD);
        return con;
    }
}
