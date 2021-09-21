// for MySQL
//        String url = "jdbc:mysql://localhost/courses?autoReconnect=true&useSSL=false&serverTimezone=JST";
//        String user = "as";
//        String password = "arisa8585";
package fundamentaljava;
import java.sql.*;

public class ch15 {

    public static void main(String[] args) {
        Connection connection = null;
        String url = "jdbc:postgresql://localhost:5432/courses";
        String user = "postgres";
        String password = "arisa";
        try
        {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("connected");

            Statement statement = connection.createStatement();
            String selectAllSql = "SELECT * FROM courses";
            String selectCost = "SELECT * FROM courses WHERE cost < 1000";
            ResultSet result = statement.executeQuery(selectCost);
            while(result.next()){
                String name = result.getString("name");
                String nod = result.getString("numberofdays");
                String cost = result.getString("cost");
                System.out.println(name





                        + ": " + nod + ", " + cost);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
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
