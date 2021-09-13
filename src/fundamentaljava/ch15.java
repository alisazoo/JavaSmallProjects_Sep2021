package fundamentaljava;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ch15 {

    public static void main(String[] args) {

        Connection conn = null;
        String url = "jdbc:mysql://localhost/courses?autoReconnect=true&useSSL=false";
        String user = "as";
        String password = "arisa8585";

        try
        {
            conn = DriverManager.getConnection(url, user, password);
//            Statement statement = connection.createStatement();
            System.out.println("connected");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            try{
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException sqle){
                sqle.printStackTrace();
            }
        }

    }

}
