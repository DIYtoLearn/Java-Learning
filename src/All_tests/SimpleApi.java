package All_tests;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.*;

public class SimpleApi {

    public static void main(String[] args) throws IOException {
        // Create a server listening on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Define the endpoint "/test"
        server.createContext("/test", new TestDataHandler());

        System.out.println("Server started on http://localhost:8080/test");
        server.start();
    }

    static class TestDataHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "";

            // Database Connection Details
            String url = "jdbc:mysql://localhost:3306/practise";
            String user = "root";
            String password = "root";

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM test")) {

                // Start building our JSON Array string
                StringBuilder json = new StringBuilder("[");
                while (rs.next()) {
                    json.append("{")
                            .append("\"id\":").append(rs.getInt("id")).append(",")
                            .append("\"data_name\":\"").append(rs.getString("data_name")).append("\",")
                            .append("\"Deleted\":").append(rs.getInt("Deleted"))
                            .append("}");
                    if (!rs.isLast()) json.append(","); // Add comma between objects
                }
                json.append("]");
                response = json.toString();

            } catch (SQLException e) {
                response = "{\"error\": \"" + e.getMessage() + "\"}";
            }

            // Send HTTP response back to Postman
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
