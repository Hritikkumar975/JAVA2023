import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DatabaseUpdateWithStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/codevengers";
        String username = "root";
        String password = "";

        // SQL update statement
        String updateSql = "UPDATE students SET name = 'Gaurav Mishra', course = 'BCA' WHERE id = 1";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(updateSql);

            if (rowsAffected > 0) {
                System.out.println("Row updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}