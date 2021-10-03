package crudbaby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Crudbaby {

    static String url = "jdbc:postgresql://localhost:5432/cludbaby";
    static String user = "postgres";
    static String pass = "arisa";
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(url, user, pass)){

            if(connection != null)
                System.out.println("connected");
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
