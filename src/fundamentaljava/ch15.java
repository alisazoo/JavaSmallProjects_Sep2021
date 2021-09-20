package fundamentaljava;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ch15 {

    public static void main(String[] args) {

        Connection connection = null;
//        String url = "jdbc:mysql://192.168.3.140/courses?autoReconnect=true&useSSL=false";
//        String url = "jdbc:mysql://localhost/courses?autoReconnect=true&useSSL=false&serverTimezone=JST";
        String url = "jdbc:postgresql://localhost:5432/postgres";

//        String user = "as";
//        String password = "arisa8585";
        String user = "postgres";
        String password = "arisa";

        try
        {
            connection = DriverManager.getConnection(url, user, password);
//            Statement statement = connection.createStatement();
            System.out.println("connected");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            try{
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException sqle){
                sqle.printStackTrace();
            }
        }

    }

}
