/*
 Navicat Premium Dump SQL

 Source Server         : localhost_13306
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:13306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 28/01/2025 15:35:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` varchar(9) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户ID',
  `user_nickname` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `user_head` varchar(16) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `user_password` varchar(64) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '184172133', '小傅哥', '01_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (2, '980765512', '铁锤', '02_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (3, '796542178', '团团', '03_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (4, '523088136', '哈尼克兔', '04_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (5, '123456001', '比丘卡', '05_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (6, '123456002', '兰兰', '06_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (7, '123456003', 'Alexa', '07_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (8, '123456004', '小白', '08_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (9, '123456005', '铃铛', '09_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (10, '123456006', '马小帅', '10_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (11, '123456007', 'S.A.K', '11_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');
INSERT INTO `user` VALUES (12, '123456008', '池鱼有点贤', '12_50', '123456', '2023-06-23 00:00:00', '2023-06-23 00:00:00');

SET FOREIGN_KEY_CHECKS = 1;
