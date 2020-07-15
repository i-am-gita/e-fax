-- MariaDB dump 10.17  Distrib 10.4.12-MariaDB, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: fax
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
-- Table structure for table `course_assistants`
--

DROP TABLE IF EXISTS `course_assistants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course_assistants` (
  `user_entity_id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `course_entity_id` int(11) NOT NULL,
  PRIMARY KEY (`course_entity_id`,`user_entity_id`),
  KEY `FK3iw77nc3a1ciasgeom55cgjg9` (`user_entity_id`),
  CONSTRAINT `FK1u8i2wwmw10p50sy9r1ou2k5j` FOREIGN KEY (`course_entity_id`) REFERENCES `course_entity` (`id`),
  CONSTRAINT `FK3iw77nc3a1ciasgeom55cgjg9` FOREIGN KEY (`user_entity_id`) REFERENCES `user_entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_assistants`
--

LOCK TABLES `course_assistants` WRITE;
/*!40000 ALTER TABLE `course_assistants` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_assistants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course_entity`
--

DROP TABLE IF EXISTS `course_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `espb` int(3) DEFAULT NULL,
  `description` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `enrollment_password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_entity_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `exam_registration_entity_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9q46yveuvvr4h5xfm30j41ny8` (`user_entity_id`),
  KEY `FKp4mj06jha8nr0bygvqj8ke51c` (`exam_registration_entity_id`),
  CONSTRAINT `FK9q46yveuvvr4h5xfm30j41ny8` FOREIGN KEY (`user_entity_id`) REFERENCES `user_entity` (`id`),
  CONSTRAINT `FKp4mj06jha8nr0bygvqj8ke51c` FOREIGN KEY (`exam_registration_entity_id`) REFERENCES `exam_registration_entity` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_entity`
--

LOCK TABLES `course_entity` WRITE;
/*!40000 ALTER TABLE `course_entity` DISABLE KEYS */;
INSERT INTO `course_entity` VALUES (1,'Modeliranje Informacionih Sistema',7,'Desc1','mis','1',1),(2,'Razvoj Informacionih Sistema',8,'Desc1','ris','1',1),(3,'Uvod u Programiranje',6,'Desc1','uup','1',1),(4,'Veb Dizajn',8,'Desc1','vd','1',1),(5,'Veb Programiranje',5,'Desc1','vp','1',1),(6,'Socijalne Mreže',5,'Desc1','sm','1',1),(7,'Veštačka Inteligencija',7,'Desc1','vi','1',1),(8,'Baze Podataka 1',4,'Desc1','bp1','tre',1),(9,'Baze Podataka 2',7,'Desc1','bp2','tre',1),(10,'Digitalni Marketing',8,'Desc1','dm','tre',1);
/*!40000 ALTER TABLE `course_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrolled_students`
--

DROP TABLE IF EXISTS `enrolled_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enrolled_students` (
  `user_entity_id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `course_entity_id` int(11) NOT NULL,
  PRIMARY KEY (`course_entity_id`,`user_entity_id`),
  KEY `FK3mqk56uqfnd0cb78ijp3vp8rp` (`user_entity_id`),
  CONSTRAINT `FK2lhdx7f3ajwl6wi529984pmf` FOREIGN KEY (`course_entity_id`) REFERENCES `course_entity` (`id`),
  CONSTRAINT `FK3mqk56uqfnd0cb78ijp3vp8rp` FOREIGN KEY (`user_entity_id`) REFERENCES `user_entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrolled_students`
--

LOCK TABLES `enrolled_students` WRITE;
/*!40000 ALTER TABLE `enrolled_students` DISABLE KEYS */;
INSERT INTO `enrolled_students` VALUES ('2',1),('4',1),('2',2),('4',2),('2',3),('4',3),('2',4),('3',5),('3',6),('4',6),('3',7),('4',7);
/*!40000 ALTER TABLE `enrolled_students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_period_entity`
--

DROP TABLE IF EXISTS `exam_period_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam_period_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_period_end` datetime DEFAULT NULL,
  `exam_period_start` datetime DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `reg_period_end` datetime DEFAULT NULL,
  `reg_period_start` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_period_entity`
--

LOCK TABLES `exam_period_entity` WRITE;
/*!40000 ALTER TABLE `exam_period_entity` DISABLE KEYS */;
INSERT INTO `exam_period_entity` VALUES (1,'2019-12-29 00:00:00','2019-12-10 00:00:00','Januarski','2020-01-29 00:00:00','2020-01-01 00:00:00'),(2,'2020-02-25 00:00:00','2020-02-15 00:00:00','Aprilski','2020-04-29 00:00:00','2020-04-05 00:00:00'),(3,'2020-09-01 00:00:00','2020-07-10 00:00:00','Julski','2020-09-01 00:00:00','2020-07-10 00:00:00');
/*!40000 ALTER TABLE `exam_period_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_registration_entity`
--

DROP TABLE IF EXISTS `exam_registration_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam_registration_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_period_entity` int(11) DEFAULT NULL,
  `exam_period_entity_id` int(11) DEFAULT NULL,
  `user_entity` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_entity_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfn7x3rggku6d3px6s9eo3rjo3` (`exam_period_entity`),
  KEY `FK4xk6e81nha2ar07q7ikcnvtls` (`exam_period_entity_id`),
  KEY `FK1gup0ilf206maaw3323ijeuna` (`user_entity`),
  KEY `FK2ovm2ctrbsij5iyxp6mylm9o2` (`user_entity_id`),
  CONSTRAINT `FK1gup0ilf206maaw3323ijeuna` FOREIGN KEY (`user_entity`) REFERENCES `user_entity` (`id`),
  CONSTRAINT `FK2ovm2ctrbsij5iyxp6mylm9o2` FOREIGN KEY (`user_entity_id`) REFERENCES `user_entity` (`id`),
  CONSTRAINT `FK4xk6e81nha2ar07q7ikcnvtls` FOREIGN KEY (`exam_period_entity_id`) REFERENCES `exam_period_entity` (`id`),
  CONSTRAINT `FKfn7x3rggku6d3px6s9eo3rjo3` FOREIGN KEY (`exam_period_entity`) REFERENCES `exam_period_entity` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_registration_entity`
--

LOCK TABLES `exam_registration_entity` WRITE;
/*!40000 ALTER TABLE `exam_registration_entity` DISABLE KEYS */;
INSERT INTO `exam_registration_entity` VALUES (1,3,3,'uno','uno'),(2,3,3,'2','2');
/*!40000 ALTER TABLE `exam_registration_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grade_entity`
--

DROP TABLE IF EXISTS `grade_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grade_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `final_mark` int(11) DEFAULT NULL,
  `points` double DEFAULT NULL,
  `professors_comment` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `course_entity_id` int(11) DEFAULT NULL,
  `user_entity_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnb10gjej8q2mfn7ej19iu5g1r` (`course_entity_id`),
  KEY `FKmaq1gypdhw1g6obu5evyftkvy` (`user_entity_id`),
  CONSTRAINT `FKmaq1gypdhw1g6obu5evyftkvy` FOREIGN KEY (`user_entity_id`) REFERENCES `course_entity` (`id`),
  CONSTRAINT `FKnb10gjej8q2mfn7ej19iu5g1r` FOREIGN KEY (`course_entity_id`) REFERENCES `course_entity` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grade_entity`
--

LOCK TABLES `grade_entity` WRITE;
/*!40000 ALTER TABLE `grade_entity` DISABLE KEYS */;
INSERT INTO `grade_entity` VALUES (3,10,100,'komentar3',10,4),(4,6,53,'Lose',8,5),(5,7,65,'Nije lose',8,6),(6,8,74,'NoComment',1,4),(7,9,87,'NoComment',2,5),(8,10,99,'NoComment',1,5),(9,6,57,'NoComment',2,6),(10,10,100,'NoComment',3,4),(11,9,83,'NoComment',1,4),(12,10,91,'NoComment',1,5);
/*!40000 ALTER TABLE `grade_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registrations_courses`
--

DROP TABLE IF EXISTS `registrations_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registrations_courses` (
  `exam_registration_entity_id` int(11) NOT NULL,
  `course_entity_id` int(11) NOT NULL,
  PRIMARY KEY (`course_entity_id`,`exam_registration_entity_id`),
  KEY `FK6wiw36et00tuk25cu18h0cnn9` (`exam_registration_entity_id`),
  CONSTRAINT `FK6wiw36et00tuk25cu18h0cnn9` FOREIGN KEY (`exam_registration_entity_id`) REFERENCES `exam_registration_entity` (`id`),
  CONSTRAINT `FKdmdkgy1633jrlrbffwmxhp0n8` FOREIGN KEY (`course_entity_id`) REFERENCES `course_entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registrations_courses`
--

LOCK TABLES `registrations_courses` WRITE;
/*!40000 ALTER TABLE `registrations_courses` DISABLE KEYS */;
INSERT INTO `registrations_courses` VALUES (1,1),(1,2),(1,3),(1,4);
/*!40000 ALTER TABLE `registrations_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review_entity`
--

DROP TABLE IF EXISTS `review_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rating` int(11) DEFAULT NULL,
  `review_type` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `survey_entity_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdg4vw40ckxhjbqrya0t34ht29` (`survey_entity_id`),
  CONSTRAINT `FKdg4vw40ckxhjbqrya0t34ht29` FOREIGN KEY (`survey_entity_id`) REFERENCES `survey_entity` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review_entity`
--

LOCK TABLES `review_entity` WRITE;
/*!40000 ALTER TABLE `review_entity` DISABLE KEYS */;
INSERT INTO `review_entity` VALUES (1,7,'Modeliranje Informacionih Sistema',1),(2,8,'Janko Rokic',1);
/*!40000 ALTER TABLE `review_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_entity`
--

DROP TABLE IF EXISTS `role_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_entity`
--

LOCK TABLES `role_entity` WRITE;
/*!40000 ALTER TABLE `role_entity` DISABLE KEYS */;
INSERT INTO `role_entity` VALUES (1,'ROLE_STUDENT'),(2,'ROLE_ASSISTANT'),(3,'ROLE_PROFESSOR'),(4,'ROLE_ADMIN');
/*!40000 ALTER TABLE `role_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `survey_entity`
--

DROP TABLE IF EXISTS `survey_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `survey_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `survey_entity`
--

LOCK TABLES `survey_entity` WRITE;
/*!40000 ALTER TABLE `survey_entity` DISABLE KEYS */;
INSERT INTO `survey_entity` VALUES (1,'Janko Jankovic'),(2,'Ana Bozic');
/*!40000 ALTER TABLE `survey_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_entity`
--

DROP TABLE IF EXISTS `user_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_entity` (
  `id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `firstname` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lastname` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK2jsk4eakd0rmvybo409wgwxuw` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_entity`
--

LOCK TABLES `user_entity` WRITE;
/*!40000 ALTER TABLE `user_entity` DISABLE KEYS */;
INSERT INTO `user_entity` VALUES ('1','Janko','Rokic','$2y$12$JYKUmoPP.HmRa27LC9AI5OndxdF78AYK0Y7Fyffw/lTgKgZ81eHPi','profesor2'),('2','Stasa','Fank','$2y$12$Ue5wp337PSM0ufOWRDO1ROtu/.zBlXgJ7cyA6d.0vl6VBLKPG15VK\n','student2'),('3','Ana','Bankic','$2y$12$95s7nYCIA94zu084l7B8wuWWzyc7Mn32irruxUftbnibVCbzQ1R.i','student3'),('4','Filip','Trica','$2y$12$Ue5wp337PSM0ufOWRDO1ROtu/.zBlXgJ7cyA6d.0vl6VBLKPG15VK\n','student4'),('5','Ranko','Julic','$2y$12$Ue5wp337PSM0ufOWRDO1ROtu/.zBlXgJ7cyA6d.0vl6VBLKPG15VK\n','student5'),('6','Stefan','Zezic','$2y$12$Ue5wp337PSM0ufOWRDO1ROtu/.zBlXgJ7cyA6d.0vl6VBLKPG15VK\n','student6'),('due','Lidija','Fodor','$2y$12$l3YvG0rdMTO8XbDWYKJaKee185Cg70eXRUzlvcfWY36qttGGlsIGm','fodor'),('jedan','Gita','Gita','$2y$12$Ue5wp337PSM0ufOWRDO1ROtu/.zBlXgJ7cyA6d.0vl6VBLKPG15VK\n','gitacar'),('quatro','Admin','Adminic','$2y$12$279PKYk5fz62ysbiv0gCPejY6uVqpJFub79Zn7In9pFVpW7dvsApi','admin'),('tre','Danijela','Boberic','bob123','bobe'),('uno','Aleksandar','Gitaric','$2y$12$7ZNXEeS1TJDvhODlEcXSqui4PugSst7DV/S.qkKy9y8zhScHTJSIy','33/17');
/*!40000 ALTER TABLE `user_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `user_entity_id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `role_entity_id` int(11) NOT NULL,
  PRIMARY KEY (`user_entity_id`,`role_entity_id`),
  KEY `FK649y4sod1qdku7vu7wxd6kcf7` (`role_entity_id`),
  CONSTRAINT `FK649y4sod1qdku7vu7wxd6kcf7` FOREIGN KEY (`role_entity_id`) REFERENCES `role_entity` (`id`),
  CONSTRAINT `FKgieq56uae5rfa34skkcllyjii` FOREIGN KEY (`user_entity_id`) REFERENCES `user_entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES ('1',3),('2',1),('3',1),('4',1),('5',1),('6',1),('due',2),('jedan',1),('quatro',4),('tre',3),('uno',1);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-16  0:18:08
