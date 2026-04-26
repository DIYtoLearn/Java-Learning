package Database_PRACTISE;

import com.github.javafaker.Faker;

import java.sql.*;
import java.util.Random;

public class DataGenerator {

    private static final int NUM_USERS = 100_000;
    private static final int NUM_PRODUCTS = 5_000;
    private static final int NUM_ORDERS = 500_000;
    private static final int NUM_ITEMS = 1_000_000;

    private static final int BATCH_SIZE = 10_000;

    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce_dummy?rewriteBatchedStatements=true",
                "root",
                "root"
        );

        conn.setAutoCommit(false);

        Faker faker = new Faker();
        Random random = new Random();

        resetDatabase(conn);

//        insertUsers(conn, faker);
//        insertProducts(conn, faker, random);
//        insertOrders(conn, faker, random);
//        insertOrderItems(conn, random);

        conn.close();
        System.out.println("✅ Data generation complete");
    }

    // ---------------- RESET ----------------
    private static void resetDatabase(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();

        stmt.execute("SET FOREIGN_KEY_CHECKS = 0");

        String[] tables = {
                "order_items", "payments", "orders",
                "reviews", "sessions", "products", "users"
        };

        for (String table : tables) {
            stmt.execute("TRUNCATE TABLE " + table);
        }

        stmt.execute("SET FOREIGN_KEY_CHECKS = 1");
        conn.commit();
    }

//    // ---------------- USERS ----------------
//    private static void insertUsers(Connection conn, Faker faker) throws SQLException {
//        String sql = "INSERT INTO users (name, email, city) VALUES (?, ?, ?)";
//
//        PreparedStatement ps = conn.prepareStatement(sql);
//
//        for (int i = 0; i < NUM_USERS; i++) {
//
//            ps.setString(1, faker.name().fullName());
//            ps.setString(2, "user_" + i + "@example.com");
//            ps.setString(3, faker.address().city());
//
//            ps.addBatch();
//
//            if (i % BATCH_SIZE == 0) {
//                ps.executeBatch();
//                conn.commit();
//                System.out.println("Users inserted: " + i);
//            }
//        }
//
//        ps.executeBatch();
//        conn.commit();
//    }
//
//    // ---------------- PRODUCTS ----------------
//    private static void insertProducts(Connection conn, Faker faker, Random random) throws SQLException {
//        String sql = "INSERT INTO products (name, category, price, stock) VALUES (?, ?, ?, ?)";
//
//        PreparedStatement ps = conn.prepareStatement(sql);
//
//        String[] categories = {"Electronics", "Clothing", "Books", "Home", "Sports"};
//
//        for (int i = 0; i < NUM_PRODUCTS; i++) {
//
//            ps.setString(1, faker.commerce().productName());
//            ps.setString(2, categories[random.nextInt(categories.length)]);
//            ps.setDouble(3, 10 + (2000 - 10) * random.nextDouble());
//            ps.setInt(4, random.nextInt(1000));
//
//            ps.addBatch();
//
//            if (i % BATCH_SIZE == 0) {
//                ps.executeBatch();
//                conn.commit();
//                System.out.println("Products inserted: " + i);
//            }
//        }
//
//        ps.executeBatch();
//        conn.commit();
//    }
//
//    // ---------------- ORDERS ----------------
//    private static void insertOrders(Connection conn, Faker faker, Random random) throws SQLException {
//        String sql = "INSERT INTO orders (user_id, total_amount, order_date) VALUES (?, ?, ?)";
//
//        PreparedStatement ps = conn.prepareStatement(sql);
//
//        for (int i = 0; i < NUM_ORDERS; i++) {
//
//            ps.setInt(1, random.nextInt(NUM_USERS) + 1);
//            ps.setDouble(2, 50 + (5000 - 50) * random.nextDouble());
//            ps.setTimestamp(3, new Timestamp(faker.date().past(365, java.util.concurrent.TimeUnit.DAYS).getTime()));
//
//            ps.addBatch();
//
//            if (i % BATCH_SIZE == 0) {
//                ps.executeBatch();
//                conn.commit();
//                System.out.println("Orders inserted: " + i);
//            }
//        }
//
//        ps.executeBatch();
//        conn.commit();
//    }
//
//    // ---------------- ORDER ITEMS ----------------
//    private static void insertOrderItems(Connection conn, Random random) throws SQLException {
//        String sql = "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
//
//        PreparedStatement ps = conn.prepareStatement(sql);
//
//        for (int i = 0; i < NUM_ITEMS; i++) {
//
//            ps.setInt(1, random.nextInt(NUM_ORDERS) + 1);
//            ps.setInt(2, random.nextInt(NUM_PRODUCTS) + 1);
//            ps.setInt(3, random.nextInt(5) + 1);
//            ps.setDouble(4, 10 + (500 - 10) * random.nextDouble());
//
//            ps.addBatch();
//
//            if (i % BATCH_SIZE == 0) {
//                ps.executeBatch();
//                conn.commit();
//                System.out.println("Items inserted: " + i);
//            }
//        }
//
//        ps.executeBatch();
//        conn.commit();
//    }
}