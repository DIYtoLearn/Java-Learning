package Database_PRACTISE;

import java.sql.*;

public class TestSQL {
    public static void main(String[] args) {
        // Replace 'your_database_name' with the actual name of your schema
        String url = "JDBC:mysql://localhost:3306/Macs";
        String user = "root";
        String password = "root";

        // Try-with-resources ensures the connection and statement close automatically
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT t.name_of_customer FROM customers as t where customer_id = 4")) {

            System.out.println("name_of_customer");
            System.out.println("----------------");

            // Loop through the results
            while (rs.next()) {
                //int id = rs.getInt("customer_id");
                String name = rs.getString("name_of_customer");
                //int deleted = rs.getInt("Deleted");

                System.out.println(name);
            }

        } catch (SQLException e) {
            System.err.println("Error reading from database:");
            //e.printStackTrace();
        }
    }
}