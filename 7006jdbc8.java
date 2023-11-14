import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {
    public static void main(String[] args) {
        try {
            // Database connection parameters
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";

            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a scrollable, updatable ResultSet
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

            // Insert a new row
            resultSet.moveToInsertRow();
            resultSet.updateInt("id", 4);
            resultSet.updateString("name", "John");
            resultSet.updateDouble("salary", 55000.0);
            resultSet.insertRow();
            resultSet.moveToCurrentRow();

            // Update an existing row
            while (resultSet.next()) {
                if (resultSet.getInt("id") == 2) {
                    resultSet.updateString("name", "Updated Name");
                    resultSet.updateDouble("salary", 60000.0);
                    resultSet.updateRow();
                }
            }

            // Delete a row
            resultSet.beforeFirst();
            while (resultSet.next()) {
                if (resultSet.getInt("id") == 3) {
                    resultSet.deleteRow();
                }
            }

            // Commit the changes to the database
            connection.commit();

            // Display the updated ResultSet
            resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name") + ", Salary: " + resultSet.getDouble("salary"));
            }

            // Close the ResultSet, Statement, and Connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
