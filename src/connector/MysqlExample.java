package connector;

import java.sql.Connection;
import java.sql.Statement;

public class MysqlExample {
    public static void insertExample(){
        Connection con = null;
        try{
            con = MysqlConnector.getConnection();

            String query = "insert into student(full_name,grade, age, gender) values('something something','3','7','male');";
            Statement stmt = con.createStatement();
            stmt.execute(query);

            con.close();

        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    public static void main(String args[]){
        insertExample();
    }
}
