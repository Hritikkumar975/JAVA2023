import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://your_mysql_host:3306/your_database_name";
        String user = "your_username";
        String password = "your_password";

        // Initialize the connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            System.out.println("Connected to the database");

            // Perform database operations here

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
