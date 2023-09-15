/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : hrms

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 15/09/2023 18:34:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for depart
-- ----------------------------
DROP TABLE IF EXISTS `depart`;
CREATE TABLE `depart`  (
  `depart_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `depart` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门',
  `people_num` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '人数',
  PRIMARY KEY (`depart_id`) USING BTREE,
  INDEX `fk_depart`(`depart` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of depart
-- ----------------------------
INSERT INTO `depart` VALUES (1, '教务处', '2');
INSERT INTO `depart` VALUES (2, '学工处', '1');
INSERT INTO `depart` VALUES (3, '体育部', '1');
INSERT INTO `depart` VALUES (4, '保卫处', '1');
INSERT INTO `depart` VALUES (7, '财务处', '1');
INSERT INTO `depart` VALUES (8, '人事处', '1');
INSERT INTO `depart` VALUES (9, '组织部', '1');
INSERT INTO `depart` VALUES (10, '宣传部', '1');
INSERT INTO `depart` VALUES (11, '宿管部', '1');
INSERT INTO `depart` VALUES (12, '统战部', '1');
INSERT INTO `depart` VALUES (13, '招生办', '1');
INSERT INTO `depart` VALUES (14, '后勤部', '1');

-- ----------------------------
-- Table structure for family
-- ----------------------------
DROP TABLE IF EXISTS `family`;
CREATE TABLE `family`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `tch_id` int(10) NOT NULL COMMENT '工号',
  `wife_husband` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '妻(夫)',
  `father` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '父亲',
  `mother` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '母亲',
  `son1` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '子女1',
  `son2` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '子女2',
  `son3` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '子女3',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_family`(`tch_id` ASC) USING BTREE,
  CONSTRAINT `family_ibfk_1` FOREIGN KEY (`tch_id`) REFERENCES `teacher` (`tch_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of family
-- ----------------------------
INSERT INTO `family` VALUES (1, 1, '李丽丽', '张东', '王华', '张晓', '无', '无');
INSERT INTO `family` VALUES (2, 2, 'tom', '阿达', '阿达', 'mimi', '无', '无');
INSERT INTO `family` VALUES (4, 3, 'alice', 'ac', '爱似', 'sso1', 'as', '无');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post`  (
  `post_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '职称号',
  `post_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职称',
  `people_num` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '人数',
  PRIMARY KEY (`post_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES (1, '教授', '1');
INSERT INTO `post` VALUES (2, '主任', '1');
INSERT INTO `post` VALUES (3, '教师', '1');
INSERT INTO `post` VALUES (4, '助教', '0');
INSERT INTO `post` VALUES (5, '副教授', '0');
INSERT INTO `post` VALUES (8, '处长', '0');
INSERT INTO `post` VALUES (9, '科长', '0');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `tch_id` int(10) NOT NULL COMMENT '工号',
  `prim` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '小学',
  `junior_high` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '初中',
  `high` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '高中',
  `university` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '大学',
  `postgraduate` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '硕士',
  `doctor` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '博士',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_tid`(`tch_id` ASC) USING BTREE,
  CONSTRAINT `record_ibfk_1` FOREIGN KEY (`tch_id`) REFERENCES `teacher` (`tch_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES (1, 1, '第十一小学', '第一中学', '第一高中', '清华大学', '北京大学', '北京大学');
INSERT INTO `record` VALUES (2, 2, '第二小学', '第一实验中学', '第一高中', '复旦大学', '北京大学', '同济大学');
INSERT INTO `record` VALUES (3, 3, '实验学校', '实验学校', '实验学校', '实验学校', '实验学校', '实验学校1');
INSERT INTO `record` VALUES (4, 4, '第一小学', '第一中学', '第一高中', '清华大学', '北京大学', '北京大学');
INSERT INTO `record` VALUES (5, 5, '第二小学', '第一实验中学', '第一高中', '复旦大学', '北京大学', '同济大学');

-- ----------------------------
-- Table structure for reward
-- ----------------------------
DROP TABLE IF EXISTS `reward`;
CREATE TABLE `reward`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `tch_id` int(10) NOT NULL COMMENT '工号',
  `date` date NULL DEFAULT NULL COMMENT '日期',
  `reward` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '奖励',
  `punish` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '惩罚',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_tch_id`(`tch_id` ASC) USING BTREE,
  CONSTRAINT `reward_ibfk_1` FOREIGN KEY (`tch_id`) REFERENCES `teacher` (`tch_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of reward
-- ----------------------------
INSERT INTO `reward` VALUES (1, 1, '2019-06-01', '获“全国优秀教师”、“全国优秀教育工作者”称号', '无');
INSERT INTO `reward` VALUES (2, 2, '2021-03-25', '获“全国最佳教育系统劳动模范”称号', '无');
INSERT INTO `reward` VALUES (4, 4, '2020-06-15', '获“全国优秀教师”、“全国优秀教育工作者”称号', '无');
INSERT INTO `reward` VALUES (5, 5, '2010-11-17', '获“全国教育系统劳动模范”称号', '无');
INSERT INTO `reward` VALUES (8, 8, '2013-08-10', '获“全国优秀教师”、“全国优秀教育工作者”称号', '无');
INSERT INTO `reward` VALUES (10, 3, '2021-02-02', '获“全国教育系统劳动模范”称号', '无');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `tch_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '工号',
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '性别',
  `year` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '出生年份',
  `email` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `post_id` int(10) NULL DEFAULT NULL COMMENT '职称号',
  `depart_id` int(10) NULL DEFAULT NULL COMMENT '部门号',
  PRIMARY KEY (`tch_id`) USING BTREE,
  INDEX `depart`(`depart_id` ASC) USING BTREE,
  INDEX `name`(`name` ASC) USING BTREE,
  INDEX `tch_id`(`tch_id` ASC) USING BTREE,
  INDEX `fk_post`(`post_id` ASC) USING BTREE,
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`depart_id`) REFERENCES `depart` (`depart_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `teacher_ibfk_2` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '张三', '男', '1882', 'zs@qq.com', 1, 1);
INSERT INTO `teacher` VALUES (2, '李四', '男', '1884', 'ls@qq.com', 2, 2);
INSERT INTO `teacher` VALUES (3, '王红', '女', '1990', 'wh@qq.com', 3, 3);
INSERT INTO `teacher` VALUES (4, '肖红', '女', '1990', 'xh@qq.com', 4, 4);
INSERT INTO `teacher` VALUES (5, '张吉惟', '男', '1995', 'zs@qq.com', 5, 7);
INSERT INTO `teacher` VALUES (6, '林国瑞', '男', '1995', 'zs@qq.com', 1, 8);
INSERT INTO `teacher` VALUES (7, '王美珠', '女', '1995', 'zs@qq.com', 2, 9);
INSERT INTO `teacher` VALUES (8, '李小爱', '女', '1995', 'zs@qq.com', 3, 10);
INSERT INTO `teacher` VALUES (9, '李建智', '男', '1995', 'zs@qq.com', 4, 11);
INSERT INTO `teacher` VALUES (10, '王爱乐', '女', '1995', 'zs@qq.com', 5, 12);
INSERT INTO `teacher` VALUES (11, '李仪琳', '女', '1995', 'zs@qq.com', 1, 13);
INSERT INTO `teacher` VALUES (12, '李士杰', '男', '1995', 'zs@qq.com', 2, 14);
INSERT INTO `teacher` VALUES (18, 'tom', '男', '1995', 'zs@qq.com', 1, 1);

-- ----------------------------
-- Triggers structure for table teacher
-- ----------------------------
DROP TRIGGER IF EXISTS `insert_update_depart_people_num`;
delimiter ;;
CREATE TRIGGER `insert_update_depart_people_num` AFTER INSERT ON `teacher` FOR EACH ROW begin 
 UPDATE tb_depart SET people_num=(people_num+1) WHERE depart_id = new.depart_id;
 end
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table teacher
-- ----------------------------
DROP TRIGGER IF EXISTS `delete_update_depart_people_num`;
delimiter ;;
CREATE TRIGGER `delete_update_depart_people_num` AFTER DELETE ON `teacher` FOR EACH ROW begin 
 UPDATE tb_depart SET people_num=(people_num-1) WHERE depart_id = old.depart_id;
 end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
