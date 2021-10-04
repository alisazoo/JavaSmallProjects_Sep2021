package crudbaby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crudbaby {

    static String url = "jdbc:postgresql://localhost:5432/cludbaby";
    static String user = "postgres";
    static String pass = "arisa";

    static String sqlInsert = "INSERT INTO users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
    static String sqlUpdate = "UPDATE users SET password = ?, fullname = ?, email=? WHERE username = ?";
    static String sqlDelete = "DELETE FROM users WHERE username = ?";

    public static void main(String[] args) {
        try( Connection connection = DriverManager.getConnection(url, user, pass) ){

            if(connection != null)
                System.out.println("connected");

            // Insert a new user
            PreparedStatement statementInsert = connection.prepareStatement(sqlInsert);
            statementInsert.setString(1, "bill");
            statementInsert.setString(2, "pass");
            statementInsert.setString(3, "Bill Gates");
            statementInsert.setString(4, "bill.gates@microsoft.com");

            int rowsInserted = statementInsert.executeUpdate();
            if(rowsInserted > 0)
                System.out.println("A new user 'Bill' was inserted successfully!");

            // Update
            PreparedStatement statementUpdate = connection.prepareStatement(sqlUpdate);
            statementUpdate.setString(1, "12345679");
            statementUpdate.setString(2, "William Henry Bill Gates");
            statementUpdate.setString(3, "bill.gates@microsoft.com");
            statementUpdate.setString(4, "bill");

            int rowsUpdated = statementUpdate.executeUpdate();
            if(rowsUpdated > 0)
                System.out.println("An existing user was updated successfully!");

            // Delete
            PreparedStatement statementDelete = connection.prepareStatement(sqlDelete);
            statementDelete.setString(1, "bill");

            int rowsDeleted = statementDelete.executeUpdate();
            if(rowsDeleted > 0)
                System.out.println("A user was deleted successfully!");

        } catch (SQLException | NullPointerException ex){
            ex.printStackTrace();
        }

    }
}
