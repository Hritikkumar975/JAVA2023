import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseManager {

    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try {
            Connection connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Connection to the database is successful!");
            connection.close(); // Don't forget to close the connection when done.
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database. Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
