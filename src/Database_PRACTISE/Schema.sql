CREATE DATABASE ecommerce_dummy;
-- USERS
CREATE TABLE users (
                       user_id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(100),
                       email VARCHAR(100) UNIQUE,
                       city VARCHAR(50),
                       created_at TIMESTAMP DEFAULT NOW()
);

-- PRODUCTS
CREATE TABLE products (
                          product_id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100),
                          category VARCHAR(50),
                          price DECIMAL(10,2),
                          stock INT
);

-- ORDERS
CREATE TABLE orders (
                        order_id INT AUTO_INCREMENT PRIMARY KEY,
                        user_id INT,
                        total_amount DECIMAL(10,2),
                        order_date DATETIME,
                        FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- ORDER ITEMS
CREATE TABLE order_items (
                             item_id INT AUTO_INCREMENT PRIMARY KEY,
                             order_id INT,
                             product_id INT,
                             quantity INT,
                             price DECIMAL(10,2),
                             FOREIGN KEY (order_id) REFERENCES orders(order_id),
                             FOREIGN KEY (product_id) REFERENCES products(product_id)
);

-- PAYMENTS
CREATE TABLE payments (
                          payment_id INT AUTO_INCREMENT PRIMARY KEY,
                          order_id INT,
                          payment_method VARCHAR(50),
                          status VARCHAR(20),
                          payment_date DATETIME,
                          FOREIGN KEY (order_id) REFERENCES orders(order_id)
);

-- REVIEWS
CREATE TABLE reviews (
                         review_id INT AUTO_INCREMENT PRIMARY KEY,
                         user_id INT,
                         product_id INT,
                         rating INT,
                         comment TEXT,
                         created_at TIMESTAMP DEFAULT NOW()
);

-- SESSIONS (for tracking activity)
CREATE TABLE sessions (
                          session_id INT AUTO_INCREMENT PRIMARY KEY,
                          user_id INT,
                          login_time DATETIME,
                          logout_time DATETIME,
                          device VARCHAR(50)
);