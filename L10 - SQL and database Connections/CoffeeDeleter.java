package JDBCDemo;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program lets the user delete a coffee.
*/
 
public class CoffeeDeleter
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for SQL Server.
    
      final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
      "databaseName=CoffeeDB;integratedSecurity=true;" +
      "encrypt=true; trustServerCertificate=true;";
      
      String pnum;       // To hold the product number
      
      // Create a string with an UPDATE statement. 
      String sql = "DELETE FROM Coffee " +
                   "WHERE ProdNum = ?";
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the product number from the user.
      System.out.print("Product number to delete: ");
      pnum = keyboard.nextLine();
      
      // Connect to the database and create a PreparedStatement.
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          PreparedStatement stmt = conn.prepareStatement(sql))
      {
         // Replace the placeholder with values.
         stmt.setString(1, pnum);     // Placeholder #1
         
         // Execute the DELETE statement.
         int rows = stmt.executeUpdate();
         System.out.println(rows + " row(s) deleted.");
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}