package DatabaseSQLConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Replace the placeholder values with your actual database credentials.
public class Database {
    public static void main(String[] args) {
        // Define the connection URL with appropriate parameters.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" + // Replace 1433 with your port number if different
                "databaseName=Students;" + // Replace with your actual database name
                "user=yourUsername;" + // Replace with your SQL Server username
                "password=yourPassword;" + // Replace with your SQL Server password
                "encrypt=true;" + // Set to true to enable encryption
                "trustServerCertificate=true;"; // Set to true to trust the server's certificate

        // Use try-with-resources to ensure the Connection is closed properly.
        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            System.out.println("Connected to the database successfully.");

            // SQL query to insert a new student
            String sqlInsert = "INSERT INTO Students (id, firstName, lastName, gpa) VALUES (?, ?, ?, ?)"; 
            
            // SQL query to select all students (this is not executed in this example)
            String sqlSelect = "SELECT * FROM Students";

            // Create a PreparedStatement object for the insert query
            try (PreparedStatement insertStatement = connection.prepareStatement(sqlInsert)) {
                // Set the parameter values for the SQL query
                insertStatement.setInt(1, 1); // id
                insertStatement.setString(2, "John"); // firstName
                insertStatement.setString(3, "Doe"); // lastName
                insertStatement.setDouble(4, 3.5); // gpa

                // Execute the SQL insert query
                int rowsInserted = insertStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new row has been inserted.");
                }
            }

            // Optional: You can add code here to execute the select query and process results
            // ...

        } catch (SQLException e) {
            System.out.println("An error occurred while connecting to the database or executing SQL.");
            e.printStackTrace();
        }
    }
}
