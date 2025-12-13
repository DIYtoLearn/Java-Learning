-- MySQL dump 10.13  Distrib 9.5.0, for macos15 (x86_64)
--
-- Host: localhost    Database: Practise
-- ------------------------------------------------------
-- Server version	9.5.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '37a3a58c-d1ca-11f0-ae2f-a1dd7098a883:1-35';

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `customer_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name_of_customer` varchar(100) NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_id` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'Rahul Sharma','2025-12-06 14:00:45'),(2,'Priya Verma','2025-12-06 14:00:45'),(3,'Arjun Mehta','2025-12-06 14:00:45'),(4,'Sneha Kapoor','2025-12-06 14:00:45'),(5,'Vikram Singh','2025-12-06 14:00:45'),(6,'Ananya Das','2025-12-06 14:00:45'),(7,'Rohit Sen','2025-12-06 14:00:45'),(8,'Meera Iyer','2025-12-06 14:00:45'),(9,'Kunal Bhandari','2025-12-06 14:00:45'),(10,'Tara Choudhury','2025-12-06 14:00:45'),(11,'Upayan Adhikary','2025-12-06 17:50:19');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `employee_id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `manager_id` int DEFAULT NULL,
  `salary_per_annnum` int DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `manager_id` (`manager_id`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`manager_id`) REFERENCES `employees` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'ELLEN',3,9000),(2,'BOB',5,60000),(3,'CAROL',NULL,65000),(4,'DAVID',2,50000),(5,'ALICE',NULL,90000),(6,'FRANK',3,48000),(7,'GEORGE',5,52000),(8,'HENRY',NULL,47000),(9,'ISABEL',3,75000),(10,'JASON',5,61000),(11,'KAREN',3,82000),(12,'LEO',8,45000),(13,'MARIA',3,90000),(14,'NATHAN',NULL,53000),(15,'OLIVIA',3,72000),(16,'PETER',2,51000),(17,'QUEENIE',5,68000),(18,'RICHARD',4,56000),(19,'SOPHIA',3,85000),(20,'THOMAS',5,49000),(21,'URSULA',NULL,93000),(22,'VIKRAM',2,58000),(23,'WENDY',3,70000),(24,'XAVIER',5,66000),(25,'YVONNE',3,88000);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_items`
--

DROP TABLE IF EXISTS `order_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_items` (
  `item_id` int NOT NULL,
  `order_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `product` varchar(100) NOT NULL,
  `quantity` int NOT NULL,
  `price` decimal(10,2) NOT NULL,
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `order_id` (`order_id`),
  KEY `idx_order_items_order_id` (`order_id`),
  CONSTRAINT `fk_order_items_orders` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_items`
--

LOCK TABLES `order_items` WRITE;
/*!40000 ALTER TABLE `order_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `customer_id` bigint unsigned DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `order_id` (`order_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,1,1499.99,'2025-01-10'),(2,2,249.50,'2025-02-05'),(3,3,799.00,'2025-02-18'),(4,4,1299.95,'2025-03-02'),(5,5,49.99,'2025-03-15'),(6,6,1999.00,'2025-04-01'),(7,7,349.75,'2025-04-12'),(8,8,89.40,'2025-05-20'),(9,9,599.99,'2025-06-06'),(10,10,15.00,'2025-06-20'),(11,1,250.00,'2025-07-03'),(12,5,1099.00,'2025-08-11'),(13,2,598.23,'2025-12-05'),(14,1,100.00,'2025-01-15'),(15,2,107.35,'2025-01-18'),(16,3,114.70,'2025-01-21'),(17,4,122.05,'2025-01-24'),(18,5,129.40,'2025-01-27'),(19,6,136.75,'2025-01-30'),(20,7,144.10,'2025-02-02'),(21,8,151.45,'2025-02-05'),(22,9,158.80,'2025-02-08'),(23,10,166.15,'2025-02-11'),(24,1,173.50,'2025-02-14'),(25,2,180.85,'2025-02-17'),(26,3,188.20,'2025-02-20'),(27,4,195.55,'2025-02-23'),(28,5,202.90,'2025-02-26'),(29,6,210.25,'2025-03-01'),(30,7,217.60,'2025-03-04'),(31,8,224.95,'2025-03-07'),(32,9,232.30,'2025-03-10'),(33,10,239.65,'2025-03-13'),(34,1,247.00,'2025-03-16'),(35,2,254.35,'2025-03-19'),(36,3,261.70,'2025-03-22'),(37,4,269.05,'2025-03-25'),(38,5,276.40,'2025-03-28'),(39,6,283.75,'2025-03-31'),(40,7,291.10,'2025-04-03'),(41,8,298.45,'2025-04-06'),(42,9,305.80,'2025-04-09'),(43,10,313.15,'2025-04-12'),(44,1,320.50,'2025-04-15'),(45,2,327.85,'2025-04-18'),(46,3,335.20,'2025-04-21'),(47,4,342.55,'2025-04-24'),(48,5,349.90,'2025-04-27'),(49,6,357.25,'2025-04-30'),(50,7,364.60,'2025-05-03'),(51,8,371.95,'2025-05-06'),(52,9,379.30,'2025-05-09'),(53,10,386.65,'2025-05-12'),(54,1,394.00,'2025-05-15'),(55,2,401.35,'2025-05-18'),(56,3,408.70,'2025-05-21'),(57,4,416.05,'2025-05-24'),(58,5,423.40,'2025-05-27'),(59,6,430.75,'2025-05-30'),(60,7,438.10,'2025-06-02'),(61,8,445.45,'2025-06-05'),(62,9,452.80,'2025-06-08'),(63,10,460.15,'2025-06-11'),(64,1,467.50,'2025-06-14'),(65,2,474.85,'2025-06-17'),(66,3,482.20,'2025-06-20'),(67,4,489.55,'2025-06-23'),(68,5,496.90,'2025-06-26'),(69,6,504.25,'2025-06-29'),(70,7,511.60,'2025-07-02'),(71,8,518.95,'2025-07-05'),(72,9,526.30,'2025-07-08'),(73,10,533.65,'2025-07-11'),(74,1,541.00,'2025-07-14'),(75,2,548.35,'2025-07-17'),(76,3,555.70,'2025-07-20'),(77,4,563.05,'2025-07-23'),(78,5,570.40,'2025-07-26'),(79,6,577.75,'2025-07-29'),(80,7,585.10,'2025-08-01'),(81,8,592.45,'2025-08-04'),(82,9,599.80,'2025-08-07'),(83,10,607.15,'2025-08-10'),(84,1,614.50,'2025-08-13'),(85,2,621.85,'2025-08-16'),(86,3,629.20,'2025-08-19'),(87,4,636.55,'2025-08-22'),(88,5,643.90,'2025-08-25'),(89,6,651.25,'2025-08-28'),(90,7,658.60,'2025-08-31'),(91,8,665.95,'2025-09-03'),(92,9,673.30,'2025-09-06'),(93,10,680.65,'2025-09-09'),(94,1,688.00,'2025-09-12'),(95,2,695.35,'2025-09-15'),(96,3,702.70,'2025-09-18'),(97,4,710.05,'2025-09-21'),(98,5,717.40,'2025-09-24'),(99,6,724.75,'2025-09-27'),(100,7,732.10,'2025-09-30'),(101,8,739.45,'2025-10-03'),(102,9,746.80,'2025-10-06'),(103,10,754.15,'2025-10-09'),(104,1,761.50,'2025-10-12'),(105,2,768.85,'2025-10-15'),(106,3,776.20,'2025-10-18'),(107,4,783.55,'2025-10-21'),(108,5,790.90,'2025-10-24'),(109,6,798.25,'2025-10-27'),(110,7,805.60,'2025-10-30'),(112,9,820.30,'2025-11-05'),(113,10,827.65,'2025-11-08');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `data_name` varchar(100) NOT NULL,
  `Deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES (2,'maybe',1),(3,'maybe',1),(4,'we',0),(5,'can',0),(6,'GUTS',0);
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-13 10:00:37
