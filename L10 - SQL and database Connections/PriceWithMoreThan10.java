package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program searches for coffee where Price > 10.0.
*/
 
public class PriceWithMoreThan10
{
   public static void main(String[] args)
   {
          // Create a named constant for the URL.
      // NOTE: This value is specific for SQL Server
    final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
    "databaseName=CoffeeDB;integratedSecurity=true;" +
    "encrypt=true; trustServerCertificate=true;";

      
      // Create a string with a SELECT statement. 
      String sql = "SELECT * FROM Coffee WHERE Price > 10.0";
      
      // Connect to the database and execute the SQL statement.
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          Statement stmt = conn.createStatement();
          ResultSet result = stmt.executeQuery(sql))
      {
         // Display the contents of the result set.
         while (result.next())
         {
            System.out.printf("%25s %10s %5.2f\n",
                              result.getString("Description"),
                              result.getString("ProdNum"),
                              result.getDouble("Price"));
         }
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}