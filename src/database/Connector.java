package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static final String _USERNAME = "root";
    private static final String _PASSWORD = "";
    private static final String _HOST = "jdbc:mysql://localhost:3306/";
    private static final String _DB = "animals";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(_HOST+_DB,_USERNAME,_PASSWORD);
        return con;
    }
}
