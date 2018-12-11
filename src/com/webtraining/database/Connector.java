package com.webtraining.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static final String _USERNAME = "root";
    private static final String _PASSWORD = "root";
    private static final String _URL = "jdbc:mysql://localhost:3306/";
    private static final String _DB = "webanimals";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(_URL+_DB,_USERNAME,_PASSWORD);
        return con;
    }
}
