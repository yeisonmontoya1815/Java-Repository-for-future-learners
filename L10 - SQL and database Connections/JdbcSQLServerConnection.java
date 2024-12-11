package JDBCDemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * 
 * @author Jaspreet Kaur Sahiwal 
 *
 */
public class JdbcSQLServerConnection {

    public static void main(String[] args) {

        Connection conn = null;

        try {

            final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=CoffeeDB;integratedSecurity=true;" +
                    "encrypt=true; trustServerCertificate=true;";
            conn = DriverManager.getConnection(connectionUrl);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}