package Database_PRACTISE;

import java.sql.*;

public class TestSQL {
    public static void main(String[] args) {
        // Replace 'your_database_name' with the actual name of your schema
        String url = "JDBC:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        // Try-with-resources ensures the connection and statement close automatically
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT t.email FROM user as t where id = 1")) {

            System.out.println("Email of Customer");
            System.out.println("----------------");

            // Loop through the results
            while (rs.next()) {
                //int id = rs.getInt("customer_id");
                String name = rs.getString("email");
                //int deleted = rs.getInt("Deleted");

                System.out.println(name);
            }

        } catch (SQLException e) {
            System.err.println("Error reading from database:");
            //e.printStackTrace();
        }
    }
}