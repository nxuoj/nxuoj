SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
DROP DATABASE IF EXISTS `linyi`;
CREATE DATABASE `linyi`;
USE linyi;
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
	`student_id` bigint(11) UNSIGNED COMMENT '学号，也是登录id',
	`phone_number` bigint(11) UNSIGNED COMMENT '学生电话号码',
	`password` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '密码',
	`name` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '学生名',
	`team_id` bigint(11) UNSIGNED COMMENT '学生队伍号码',
	PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COMMENT = '学生信息表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `team_info`;
CREATE TABLE `team_info`  (
	`team_id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '学生队伍号码',
	`password` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '密码',
	`leader_id` bigint(11) UNSIGNED COMMENT '队长学号',
	`name` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '队伍名',
	PRIMARY KEY (`team_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COMMENT = '队伍信息表' ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `submit_record`;
CREATE TABLE `submit_record`  (
	`record_id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '提交记录id',
	`team_id` bigint(11) UNSIGNED COMMENT '学生队伍号码',
	`student_id` bigint(11) UNSIGNED COMMENT '提交学生学号',
	`record_time` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
	`question_id` bigint(11) UNSIGNED COMMENT '题目号码',
	`url` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '存放地址',
	PRIMARY KEY (`record_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COMMENT = '提交记录表' ROW_FORMAT = Dynamic;

DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
	`question_id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '题目号码',
	`year` int(4) UNSIGNED COMMENT '学年',
	`semester` int(1) UNSIGNED COMMENT '学期',
	`week` int(2) UNSIGNED COMMENT '周号',
	`student_id` bigint(11) UNSIGNED COMMENT '上传学生学号',
	`url` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '存放地址',
	PRIMARY KEY (`question_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COMMENT = '题目上传表' ROW_FORMAT = Dynamic;