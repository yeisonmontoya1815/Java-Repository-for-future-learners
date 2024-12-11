package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program changes the product number for a coffee.
*/
 
public class UpdateProductNum
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for SQL Server.
    
      final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
      "databaseName=CoffeeDB;integratedSecurity=true;" +
      "encrypt=true; trustServerCertificate=true;";
      
      // Create a string with an UPDATE statement. 
      String sql = "UPDATE Coffee " +
                   "SET ProdNum = '12-001' " +
                   "WHERE Description = 'French Roast Dark'";
      
      // Connect to the database and create a Statement object.
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          Statement stmt = conn.createStatement())
      {
         // Execute the UPDATE statement.
         int rows = stmt.executeUpdate(sql);
         System.out.println(rows + " row(s) updated.");
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}