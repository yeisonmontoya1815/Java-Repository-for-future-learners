package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This program creates the UnpaidOrder table in
 * the CoffeeDB database.
 */

class UnpaidOrderTable {
    public static void main(String[] args) {
        // Create constants for the driver name and URL.
        // NOTE: This value is specific for sql server.
        final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=CoffeeDB;integratedSecurity=true;" +
                "encrypt=true; trustServerCertificate=true;";
        // Create Connection and Statement objects.
        try (Connection conn = DriverManager.getConnection(connectionUrl);
                Statement stmt = conn.createStatement()) {

            addRows(stmt);
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    /**
     * The addRows method adds some sample rows to the Customer table.
     * 
     * @param stmt A Statement object for the CoffeeDB database.
     * @exception SQLException if a database error occurs.
     */

    public static void addRows(Statement stmt) throws SQLException {

        stmt.executeUpdate("INSERT INTO UnpaidOrder VALUES" +
                "('101', '16-001', '3/15/2020', 5, 49.75)");

        stmt.executeUpdate("INSERT INTO UnpaidOrder VALUES" +
                "('101', '14-001', '3/17/2020', 7, 62.65)");

        stmt.executeUpdate("INSERT INTO UnpaidOrder VALUES" +
                "('102', '18-002', '3/20/2020', 10, 184.50)");

        stmt.executeUpdate("INSERT INTO UnpaidOrder VALUES" +
                "('103', '17-004', '3/21/2020', 3, 35.85)");

        stmt.executeUpdate("INSERT INTO UnpaidOrder VALUES" +
                "('103', '16-002', '3/22/2020', 6, 59.70)");
    }
}
