package JDBCDemo;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program demonstrates a parameterized query.
*/
 
public class MinMaxPrice
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for SQL Server
      final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
    "databaseName=CoffeeDB;integratedSecurity=true;" +
    "encrypt=true; trustServerCertificate=true;";
      double minPrice;       // To hold the minimum price
      double maxPrice;       // To hold the maximum price
      int coffeeCount = 0;   // To count coffees that qualify
      
      // Create a string with a SELECT statement. 
      String sql =
         "SELECT * FROM Coffee WHERE Price > ? AND Price < ?";
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the minimum and maximum prices from the user.
      System.out.print("Enter the minimum price: ");
      minPrice = keyboard.nextDouble();
      System.out.print("Enter the maximum price: ");
      maxPrice = keyboard.nextDouble();
      
      // Connect to the database and create 
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          PreparedStatement stmt = conn.prepareStatement(sql))
      {
         // Set placeholder #1 to minPrice and 
         // placeholder #2 to maxPrice.
         stmt.setDouble(1, minPrice);
         stmt.setDouble(2, maxPrice);
            
         // Execute the SQL statement.
         try (ResultSet result = stmt.executeQuery())
         {            
            // Display the contents of the result set.
            while (result.next())
            {
               System.out.printf("%25s %10s %5.2f\n",
                                 result.getString("Description"),
                                 result.getString("ProdNum"),
                                 result.getDouble("Price"));
                  
               // Increment the counter.
               coffeeCount++;
            }
               
            // Display the number of qualifying coffees.
            System.out.println(coffeeCount + " coffees found.");
         }
         catch(SQLException e)
         {
            System.out.println("ERROR: " + e.getMessage());
         }
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}