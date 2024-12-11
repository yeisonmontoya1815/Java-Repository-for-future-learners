package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   This program inserts a new row into the Coffee table.
*/
 
public class AddNewCoffee
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for SQL Server.
    
      final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
      "databaseName=CoffeeDB;integratedSecurity=true;" +
      "encrypt=true; trustServerCertificate=true;";
      
      // Create a string with an INSERT statement. 
      String sql = "INSERT INTO Coffee " +
                   "(ProdNum, Price, Description) " +
                   "VALUES ('22-001', 8.65, 'Honduran Dark')";
      
      // Connect to the database and create a Statement object.
      try(Connection conn = DriverManager.getConnection(connectionUrl);
          Statement stmt = conn.createStatement())
      {
         // Execute the INSERT statement.
         int rows = stmt.executeUpdate(sql);
         System.out.println(rows + " row(s) added to the table.");
      }
      catch(SQLException e)
      {
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}
