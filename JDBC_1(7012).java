import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "rahul";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connected to the MySQL database");
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found");
        } catch (SQLException e) {
            System.err.println("Connection to the database failed: " + e.getMessage());
        }
    }
}
