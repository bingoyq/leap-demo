/*
Navicat MySQL Data Transfer

Source Server         : 10.201.76.162
Source Server Version : 50629
Source Host           : 10.201.76.162:3306
Source Database       : paas_user_api

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2017-04-07 12:48:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sec_user
-- ----------------------------
DROP TABLE IF EXISTS `sec_user`;
CREATE TABLE `sec_user` (
  `id` varchar(36) NOT NULL COMMENT '用户ID',
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `login_id` varchar(50) NOT NULL COMMENT '登陆名',
  `icon` varchar(100) DEFAULT NULL COMMENT '头像',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证',
  `birthday` datetime DEFAULT NULL COMMENT '出生年月',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `re_password` varchar(50) DEFAULT NULL COMMENT '确认密码',
  `nation` varchar(20) DEFAULT NULL COMMENT '民族',
  `pinyin` varchar(50) DEFAULT NULL COMMENT '名字拼音',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `jz` varchar(10) DEFAULT NULL COMMENT '警种',
  `jh` varchar(6) DEFAULT NULL COMMENT '警号',
  `mobile_phone` varchar(100) DEFAULT NULL COMMENT '移动电话',
  `telephone` varchar(20) DEFAULT NULL COMMENT '办公电话',
  `email` varchar(100) DEFAULT NULL COMMENT '邮件',
  `fax` varchar(50) DEFAULT NULL COMMENT '传真',
  `family_address` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `company_name` varchar(200) DEFAULT NULL COMMENT '公司名称字典',
  `work` varchar(50) DEFAULT NULL COMMENT '工作ID',
  `status` int(1) DEFAULT '0' COMMENT '状态',
  `role` varchar(20) DEFAULT NULL COMMENT '角色',
  `type` varchar(10) DEFAULT NULL COMMENT '类型',
  `created_date` datetime DEFAULT NULL COMMENT '创建时间',
  `created_by` varchar(36) DEFAULT NULL COMMENT '创建人',
  `last_updated_date` datetime DEFAULT NULL COMMENT '最后更新时间',
  `last_updated_by` varchar(36) DEFAULT NULL COMMENT '最后更新人',
  `is_delete` int(1) DEFAULT '0' COMMENT '删除标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表\r\n';

-- ----------------------------
-- Records of sec_user
-- ----------------------------
INSERT INTO `sec_user` VALUES ('31', '2121', '323', null, '31', '2017-03-28 00:00:00', null, '', '汉族', '21', '1', null, '31', '32', null, '32@q.com', null, '13', null, null, '0', null, '1', '2017-03-09 15:26:29', null, '2017-03-09 15:26:29', null, '0');
INSERT INTO `sec_user` VALUES ('324252', '赵云', '赵云', null, '324252', '2017-03-22 00:00:00', null, '', '汉族', 'zhaoyun', '1', null, '2323', '32323', null, '88@qq.com', null, '', null, null, '0', null, '1', '2017-03-07 14:46:38', null, '2017-03-07 14:46:38', null, '0');
INSERT INTO `sec_user` VALUES ('3243242', '张三', 'zhangsan', null, '3243242', '2017-03-08 00:00:00', null, '', '汉族', 'zhangsan', '1', null, '3242', '32', null, '32@q.com', null, '地方', null, null, '0', null, '2', '2017-03-09 13:32:28', null, '2017-03-09 13:32:28', null, '0');
INSERT INTO `sec_user` VALUES ('400000000000000001', '小刚2', 'xiaogang', null, '400000000000000001', '2017-03-25 00:00:00', null, '', '汉族', 'xiaogang', '1', null, '1', '18500000000', null, 'sun868102@126.com', null, '1', null, null, '0', null, '1', '2017-01-04 20:15:01', null, '2017-03-07 19:48:00', null, '0');
INSERT INTO `sec_user` VALUES ('400000000000000002', '小强', 'xiaoqiang', null, '400000000000000002', '2017-03-30 00:00:00', null, '', '汉族', '1', '1', null, '1', '18500000000', null, 'sun868102@126.com', null, '', null, null, '0', null, '1', '2017-03-01 15:13:32', null, '2017-03-01 15:13:32', null, '0');
INSERT INTO `sec_user` VALUES ('400000000000000014', '小红', 'xiaohong', null, '400000000000000014', '2017-02-15 00:00:00', null, '', '汉族', 'ss', '2', null, 'd', '18500000000', null, 'sun868102@126.com', null, 'd', null, null, '0', null, '1', '2017-02-17 17:50:40', null, '2017-02-17 17:50:40', null, '0');
INSERT INTO `sec_user` VALUES ('400000000000000015', 'Tom', 'tom', null, '400000000000000015', '2017-02-15 00:00:00', null, '', '汉族', 'ss', '1', null, 'd', '18500000000', null, 'sun868102@126.com', null, 'd', null, null, '0', null, '1', '2017-02-17 17:54:45', null, '2017-02-17 17:54:45', null, '0');
INSERT INTO `sec_user` VALUES ('4000000000101', '公司用户1', 'gongsi1', null, '4000000000101', '2017-03-14 00:00:00', null, '', '汉族', 'gongsi1', '1', null, '11', '111', null, 'sun868102@126.com', null, '', null, null, '0', null, '2', '2017-03-07 19:50:57', null, '2017-03-07 19:50:57', null, '0');
INSERT INTO `sec_user` VALUES ('42424242', '赵云', '赵云', null, '42424242', '2017-03-28 00:00:00', null, '', '侗族', 'zhaoyun', '1', null, '3232', '3223', null, '32323@qq.com', null, '32323', null, null, '0', null, '1', '2017-03-07 14:16:33', null, '2017-03-07 14:16:33', null, '0');
