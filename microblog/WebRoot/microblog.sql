/*
Navicat MySQL Data Transfer

Source Server         : MYSQL-ZX
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : microblog

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2016-10-04 14:17:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for likeme
-- ----------------------------
DROP TABLE IF EXISTS `likeme`;
CREATE TABLE `likeme` (
  `like_id` int(10) NOT NULL AUTO_INCREMENT,
  `like_topicId` int(10) DEFAULT NULL,
  `like_userId` int(10) DEFAULT NULL,
  PRIMARY KEY (`like_id`),
  KEY `like_topic_id` (`like_topicId`),
  KEY `like_user_id` (`like_userId`),
  CONSTRAINT `like_topic_id` FOREIGN KEY (`like_topicId`) REFERENCES `topic` (`topic_id`),
  CONSTRAINT `like_user_id` FOREIGN KEY (`like_userId`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `topic_id` int(10) NOT NULL AUTO_INCREMENT,
  `topic_webtext` varchar(20) NOT NULL,
  `user_id` int(10) NOT NULL,
  PRIMARY KEY (`topic_id`),
  KEY `fk_user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_username` varchar(20) DEFAULT NULL,
  `user_password` varchar(10) NOT NULL,
  `user_nicename` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gbk;
