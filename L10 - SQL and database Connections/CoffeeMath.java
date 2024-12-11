package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program demonstrates some of the SQL math functions.
*/
 
public class CoffeeMath
{
   public static void main(String[] args)
   {
      double lowest = 0.0,
             highest = 0.0,
             average = 0.0;

      // Create a named constant for the URL.
      // NOTE: This value is specific for sql server.
    
      String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
      "databaseName=CoffeeDB;integratedSecurity=true;" +
      "encrypt=true; trustServerCertificate=true;";
      // Connect to the database and execute the SQL statement.
      try (Connection conn = DriverManager.getConnection(connectionUrl))
      {
         // Get the lowest, highest, and average prices.
         lowest = lowestPrice(conn);
         highest = highestPrice(conn);
         average = averagePrice(conn);
         
         // Display the results.
         System.out.printf("Lowest price: $%.2f\n", lowest);
         System.out.printf("Highest price: $%.2f\n", highest);
         System.out.printf("Average price: $%.2f\n", average);
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
   
   /**
      The lowestPrice method gets the lowest price from
      the Coffee table.
      @param conn A Connection object for the database.
      @return The lowest value in the Coffee table's Price column.
      @exception SQLException if a database error occurs.
   */
   
   public static double lowestPrice(Connection conn) throws SQLException
   {
      double lowest = 0.0;
      
      // Create the SELECT statement to get the lowest price.
      String minSql = "SELECT MIN(Price) FROM Coffee";
      
      // Execute the SQL, but do not catch any exceptions.
      try(Statement stmt = conn.createStatement();
          ResultSet result = stmt.executeQuery(minSql))
      {
         // Advance the ResultSet object's cursor.
         result.next();
         
         // Get the results from column 1 of the ResultSet.
         lowest = result.getDouble(1);
      }
      
      return lowest;
   }
   
   /**
      The highestPrice method gets the highest price from
      the Coffee table.
      @param conn A Connection object for the database.
      @return The highest value in the Coffee table's Price column.
      @exception SQLException if a database error occurs.
   */
   
   public static double highestPrice(Connection conn) throws SQLException
   {
      double highest = 0.0;
      
      // Create the SELECT statement to get the highest price.
      String maxSql = "SELECT MAX(Price) FROM Coffee";
      
      // Execute the SQL, but do not catch any exceptions.
      try(Statement stmt = conn.createStatement();
          ResultSet result = stmt.executeQuery(maxSql))
      {
         // Advance the ResultSet object's cursor.
         result.next();
         
         // Get the results from column 1 of the ResultSet.
         highest = result.getDouble(1);
      }
      
      return highest;
   }
   
   /**
      The averagePrice method gets the average price from
      the Coffee table.
      @param conn A Connection object for the database.
      @return The average of the Coffee table's Price column.
      @exception SQLException if a database error occurs.
   */
   
   public static double averagePrice(Connection conn) throws SQLException
   {
      double average = 0.0;
      
      // Create the SELECT statement to get the average price.
      String avgSql = "SELECT AVG(Price) FROM Coffee";
      
      // Execute the SQL, but do not catch any exceptions.
      try(Statement stmt = conn.createStatement();
          ResultSet result = stmt.executeQuery(avgSql))
      {
         // Advance the ResultSet object's cursor.
         result.next();
         
         // Get the results from column 1 of the ResultSet.
         average = result.getDouble(1);
      }
      
      return average;
   }
}