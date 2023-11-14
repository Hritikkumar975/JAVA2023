import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteRowExample {
    public static void main(String[] args) {
        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";
        // SQL query to delete a row
        String deleteQuery = "DELETE FROM your_table WHERE id = ?";
        // ID of the row you want to delete
        int rowIdToDelete = 123;
        try (
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            // Create a prepared statement with the delete query
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        ) {
            // Set the parameter in the prepared statement (assuming the ID is an integer)
            preparedStatement.setInt(1, rowIdToDelete);
            // Execute the delete statement
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Row deleted successfully.");
            } else {
                System.out.println("No rows deleted. Row with ID " + rowIdToDelete + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
