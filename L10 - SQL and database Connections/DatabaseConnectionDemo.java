package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;

class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=DouglasCollege;integratedSecurity=true;" +
                "encrypt=true; trustServerCertificate=true;";

        // try with resources

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.out.println("Connection");

            String sqlString = "insert into department(faculty_name,department_name)values('Commerce and Business Administration','Web and Mobile Computing')";
            // creating a Statement object which will be used to execute sql queries against
            // the database
            // Statement stmt=connection.createStatement();
            // stmt.executeUpdate(sqlString);
            String sqlString2 = "insert into department(faculty_name,department_name) values(?,?)";

            PreparedStatement stmt1 = connection.prepareStatement(sqlString2);
            // stmt1.setString(1,"Health Sciences");
            // stmt1.setString(2,"Health Information System");
            // stmt1.executeUpdate();
            String faculty_name = "Health Sciences";
            String department_name = "Mental Health and Personal Support Work";
            //stmt1.setString(1,faculty_name);
            //stmt1.setString(1,department_name);
           // stmt1.executeUpdate();
            boolean valid = true;
            String first_name;
            String last_name;
            String department;
            Scanner s = new Scanner(System.in);
            PreparedStatement stmt3 = null;
            while (valid) {
                String sqlString3 = "insert into students(first_name,last_name,department_name) values(?,?,?)";
                stmt3 = connection.prepareStatement(sqlString3);
                System.out.println("Enter the first_name");
                first_name = s.nextLine();
                System.out.println("Enter the last_name");
                last_name = s.nextLine();
                System.out.println("Enter the department");
                department = s.nextLine();
                stmt3.setString(1, first_name);
                stmt3.setString(2, last_name);
                stmt3.setString(3, department);
                stmt3.addBatch();
                stmt3.clearParameters();
                System.out.println("Do you want to add another student ");
                int choice;
                System.out.println("Enter 1 to add");
                System.out.println("Enter 2 to exit");
                choice = s.nextInt();
                s.nextLine();
                if (choice == 2)

                valid =false;
                stmt3.executeBatch();
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}