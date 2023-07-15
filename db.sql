/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 8.0.18 : Database - books
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE my_company DEFAULT CHARSET utf8;

USE `my_company`;

/*Table structure for table `departments` */

DROP TABLE IF EXISTS `departments`;

CREATE TABLE `departments` (
  `departmentid` INT(20) NOT NULL AUTO_INCREMENT,
  `departmentname` CHAR(20) NOT NULL,
  PRIMARY KEY (`departmentid`)
);

/*Data for the table `departments` */

INSERT  INTO `departments`(`departmentid`,`departmentname`) VALUES 
(101,'教学部'),
(102,'后勤部'),
(103,'市场部');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` INT(20) NOT NULL AUTO_INCREMENT,
  `lastname` CHAR(20) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `gender` INT(2) NOT NULL,
  `departmentid` INT(20) NOT NULL,
  `birth` DATETIME NOT NULL,
  PRIMARY KEY (`id`)
);

/*Data for the table `employee` */

INSERT  INTO `employee`(`id`,`lastname`,`email`,`gender`,`departmentid`,`birth`) VALUES 
(1001,'王五','a2341421@qq.com',1,101,'2020-12-02 00:00:00'),
(1002,'李四','a2341421@qq.com',0,102,'2020-12-02 00:00:00'),
(1003,'张三','a2341421@qq.com',1,103,'2020-12-02 00:00:00');

CREATE TABLE myuser(
	uname CHAR(20) NOT NULL,
	pword CHAR(20) NOT NULL
);
INSERT INTO myuser VALUE('admin','123456');


