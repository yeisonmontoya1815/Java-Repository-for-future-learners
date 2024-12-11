package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program deletes a row from the Coffee table.
*/
 
public class DeleteRow
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for SQL Server.
    
      final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
      "databaseName=CoffeeDB;integratedSecurity=true;" +
      "encrypt=true; trustServerCertificate=true;";
      
      // Create a string with a DELETE statement. 
      String sql = "DELETE FROM Coffee " +
                   "WHERE ProdNum = '22-002'";
      
      // Connect to the database and create a Statement object.
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          Statement stmt = conn.createStatement())
      {
         // Execute the DELETE statement.
         int rows = stmt.executeUpdate(sql);
         System.out.println(rows + " row(s) deleted.");
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}