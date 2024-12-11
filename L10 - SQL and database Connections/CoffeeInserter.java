package JDBCDemo;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program lets the user insert a new row.
*/
 
public class CoffeeInserter
{
   public static void main(String[] args)
   {
         // Create a named constant for the URL.
      // NOTE: This value is specific for SQL Server.
    
      final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
      "databaseName=CoffeeDB;integratedSecurity=true;" +
      "encrypt=true; trustServerCertificate=true;";
      
      
      String pnum;       // To hold the product number
      double price;      // To hold the price
      String desc;       // To hold the description
      
      // Create a string with an INSERT statement. 
      String sql = "INSERT INTO Coffee " +
                   "(ProdNum, Price, Description) " +
                   "VALUES (?, ?, ?)";
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the new data from the user.
      System.out.print("Enter the description: ");
      desc = keyboard.nextLine();
      System.out.print("Enter the product number: ");
      pnum = keyboard.nextLine();
      System.out.print("Enter the price: ");
      price = keyboard.nextDouble();
      
      // Connect to the database and create a PreparedStatement.
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          PreparedStatement stmt = conn.prepareStatement(sql))
      {
         // Replace the placeholders with values.
         stmt.setString(1, pnum);      // Placeholder #1
         stmt.setDouble(2, price);     // Placeholder #2
         stmt.setString(3, desc);      // Placeholder #3
         
         // Execute the INSERT statement.
         int rows = stmt.executeUpdate();
         System.out.println(rows + " row(s) added to the table.");
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}