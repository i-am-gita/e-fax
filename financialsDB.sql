-- MariaDB dump 10.17  Distrib 10.4.12-MariaDB, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: financials
-- ------------------------------------------------------
-- Server version	10.4.12-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `deposit_entity`
--

DROP TABLE IF EXISTS `deposit_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deposit_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_of_deposit` datetime DEFAULT NULL,
  `value` double NOT NULL,
  `finance_entity_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4rkdrncl0wk1krxgoyh0iwupc` (`finance_entity_id`),
  CONSTRAINT `FK4rkdrncl0wk1krxgoyh0iwupc` FOREIGN KEY (`finance_entity_id`) REFERENCES `finance_entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deposit_entity`
--

LOCK TABLES `deposit_entity` WRITE;
/*!40000 ALTER TABLE `deposit_entity` DISABLE KEYS */;
/*!40000 ALTER TABLE `deposit_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_entity`
--

DROP TABLE IF EXISTS `finance_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `balance` double NOT NULL,
  `student_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_entity`
--

LOCK TABLES `finance_entity` WRITE;
/*!40000 ALTER TABLE `finance_entity` DISABLE KEYS */;
INSERT INTO `finance_entity` VALUES (1,50000,'2'),(2,35000,'3');
/*!40000 ALTER TABLE `finance_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `withdraw_entity`
--

DROP TABLE IF EXISTS `withdraw_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `withdraw_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_of_withdrawal` datetime DEFAULT NULL,
  `value` double NOT NULL,
  `finance_entity_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKq10bq09105uk5ockiyyto23pd` (`finance_entity_id`),
  CONSTRAINT `FKq10bq09105uk5ockiyyto23pd` FOREIGN KEY (`finance_entity_id`) REFERENCES `finance_entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `withdraw_entity`
--

LOCK TABLES `withdraw_entity` WRITE;
/*!40000 ALTER TABLE `withdraw_entity` DISABLE KEYS */;
/*!40000 ALTER TABLE `withdraw_entity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-16  0:18:57
