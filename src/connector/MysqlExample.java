package connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlExample {
    public static void insertExample(){
        Connection con = null;
        try{
            con = MysqlConnector.getConnection();

            String query = "insert into student(full_name,grade, age, gender) values('Ram Bahadur','3','7','male');";
            Statement stmt = con.createStatement();
            stmt.execute(query);

            con.close();

        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    public static void main(String args[]){
        //insertExample();
       selectExample();
    }

    public static void selectExample(){
        Connection con = null;
        try{
            con = MysqlConnector.getConnection();

            String query = "select * from student;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()){
                System.out.println("\nprinting information of one of the row:- \n------------------------");
                System.out.print(rs.getInt("id") +" ");
                System.out.print(rs.getString("full_name") +" ");
                System.out.print(rs.getString("grade") +" ");
                System.out.print(rs.getString("age") +" ");
                System.out.print(rs.getString("gender") +" ");
            }

            con.close();

        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    public static void updateExample(){
        //update student set full_name = "someone something" where id = 3;
    }

    public static void deleteExample(){
       // delete from student where id = 4;

    }
}
