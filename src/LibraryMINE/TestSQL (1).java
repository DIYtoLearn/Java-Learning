package LibraryMINE;

import java.sql.*;

public class TestSQL {
    public static void main(String[] args) {
        // Replace 'your_database_name' with the actual name of your schema
        String url = "jdbc:mysql://localhost:3306/practise";
        String user = "root";
        String password = "root";

        // Try-with-resources ensures the connection and statement close automatically
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM test")) {

            System.out.println("ID | Data Name | Deleted");
            System.out.println("-------------------------");

            // Loop through the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("data_name");
                int deleted = rs.getInt("Deleted");

                System.out.println(id + "  | " + name + " | " + deleted);
            }

        } catch (SQLException e) {
            System.err.println("Error reading from database:");
            e.printStackTrace();
        }
    }
}