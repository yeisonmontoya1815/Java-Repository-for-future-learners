package JDBCDemo;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program lets the user change a coffee's price.
*/
 
public class PriceUpdater
{
   public static void main(String[] args)
   {
    // Create a named constant for the URL.
    // NOTE: This value is specific for SQL Server.
  
    final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
    "databaseName=CoffeeDB;integratedSecurity=true;" +
    "encrypt=true; trustServerCertificate=true;";
      
      String pnum;       // To hold the product number
      double price;      // To hold the new price
      
      // Create a string with an UPDATE statement. 
      String sql = "UPDATE Coffee " +
                   "SET Price = ? " +
                   "WHERE ProdNum = ?";
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the new data from the user.
      System.out.print("Product number: ");
      pnum = keyboard.nextLine();
      System.out.print("Enter the new price: ");
      price = keyboard.nextDouble();
      
      // Connect to the database and create a PreparedStatement.
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          PreparedStatement stmt = conn.prepareStatement(sql))
      {
         // Replace the placeholders with values.
         stmt.setDouble(1, price);      // Placeholder #1
         stmt.setString(2, pnum);       // Placeholder #2
         
         // Execute the UPDATE statement.
         int rows = stmt.executeUpdate();
         System.out.println(rows + " row(s) updated.");
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}