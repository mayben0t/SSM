/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : bishe

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2018-11-11 18:30:58
*/
create database bishe;
use bishe;

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `company`
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UserID` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Tel` varchar(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO company VALUES ('1', '1', '1', '1');
INSERT INTO company VALUES ('2', '2', '2', '2');
INSERT INTO company VALUES ('3', '3', '3', '3');
INSERT INTO company VALUES ('4', '4', '4', '4');
INSERT INTO company VALUES ('5', '5', '5', '5');
INSERT INTO company VALUES ('6', '6', '6', '6');
INSERT INTO company VALUES ('7', '7', '7', '7');
INSERT INTO company VALUES ('8', '8', '8', '8');
INSERT INTO company VALUES ('9', '9', '9', '9');
INSERT INTO company VALUES ('10', '10', '10', '10');
INSERT INTO company VALUES ('11', '华为装饰公司', '123456', '123');
INSERT INTO company VALUES ('12', '小米装饰公司', '123456', '123');
INSERT INTO company VALUES ('13', '南京装饰公司', '123456', '2');
INSERT INTO company VALUES ('14', '王骁2222', '19960808019', '11');

-- ----------------------------
-- Table structure for `companyuser`
-- ----------------------------
DROP TABLE IF EXISTS `companyuser`;
CREATE TABLE `companyuser` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CompanyID` int(11) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Tel` varchar(11) NOT NULL,
  `Type` int(11) NOT NULL,
  `Income` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `companyuserCompanyID` (`CompanyID`),
  CONSTRAINT `companyuserCompanyID` FOREIGN KEY (`CompanyID`) REFERENCES `company` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of companyuser
-- ----------------------------
INSERT INTO companyuser VALUES ('1', '1', '1', '1', '1', '1', '1000');
INSERT INTO companyuser VALUES ('2', '1', '2', '2', '2', '2', '2000');
INSERT INTO companyuser VALUES ('3', '1', '3', '3', '3', '3', '3000');
INSERT INTO companyuser VALUES ('4', '1', '4', '4', '4', '4', '4000');
INSERT INTO companyuser VALUES ('5', '1', '5', '5', '5', '5', '5000');
INSERT INTO companyuser VALUES ('6', '1', '6', '6', '6', '6', '6000');
INSERT INTO companyuser VALUES ('7', '1', '7', '7', '7', '7', '7000');
INSERT INTO companyuser VALUES ('9', '12', '1', '1', '1', '1', '1');
INSERT INTO companyuser VALUES ('10', '12', '2', '2', '2', '2', '2');
INSERT INTO companyuser VALUES ('11', '12', '3', '3', '3', '3', '3');
INSERT INTO companyuser VALUES ('12', '12', '4', '4', '4', '4', '4');
INSERT INTO companyuser VALUES ('13', '12', '5', '5', '5', '5', '5');
INSERT INTO companyuser VALUES ('14', '12', '6', '6', '6', '6', '6');
INSERT INTO companyuser VALUES ('18', '12', '0', '1', '1', '1', '1');
INSERT INTO companyuser VALUES ('22', '12', '4', '1', '1', '1', '1');
INSERT INTO companyuser VALUES ('23', '12', '5', '1', '1', '1', '1');
INSERT INTO companyuser VALUES ('24', '12', '6', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for `stuff`
-- ----------------------------
DROP TABLE IF EXISTS `stuff`;
CREATE TABLE `stuff` (
  `ID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `Pay` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stuff
-- ----------------------------
INSERT INTO stuff VALUES ('1', '电动风道密闭阀', '按个卖', '18002');

-- ----------------------------
-- Table structure for `transaction`
-- ----------------------------
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UserID` int(11) NOT NULL,
  `CompanyID` int(11) NOT NULL,
  `Money` decimal(7,2) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Progress` int(11) NOT NULL,
  `UserConfirm` int(11) NOT NULL,
  `Total` decimal(10,2) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `transactionUserID` (`UserID`),
  KEY `transactionCompanyID` (`CompanyID`),
  CONSTRAINT `transactionCompanyID` FOREIGN KEY (`CompanyID`) REFERENCES `company` (`id`),
  CONSTRAINT `transactionUserID` FOREIGN KEY (`UserID`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction
-- ----------------------------
INSERT INTO transaction VALUES ('15', '16', '12', '50.00', '小户型精装 可能需要大量水泥材料', '1', '2', '150.00');
INSERT INTO transaction VALUES ('16', '16', '12', '50.00', '小户型精装 可能需要大量水泥材料', '1', '1', '100.00');
INSERT INTO transaction VALUES ('17', '16', '12', '50.00', '小户型精装 可能需要大量水泥材料', '1', '2', '150.00');
INSERT INTO transaction VALUES ('18', '16', '12', '200.00', '大型房屋装饰 需要钢铁量较大  设计师建议：走精装路线，客厅可以再压缩 水路重修', '3', '3', '1250.00');
INSERT INTO transaction VALUES ('19', '16', '12', '500.00', '大型房屋装饰 需要钢铁量较大 建议减少客厅开销，加大厨房装修', '2', '2', '50.00');
INSERT INTO transaction VALUES ('20', '16', '12', '10.00', ' wdwdsasda', '7', '7', '560.00');
INSERT INTO transaction VALUES ('21', '3', '12', '200.00', '大型房屋装饰 需要钢铁量较大 精装厨房客厅 减少卫生间装修成本  使用少量少碳漆即可', '7', '7', '1250.00');
INSERT INTO transaction VALUES ('22', '3', '12', '4.00', '大型房屋装饰 需要钢铁量较大', '6', '7', '63.00');
INSERT INTO transaction VALUES ('23', '1', '12', '50.00', '大型房屋装饰 需要钢铁量较大 设计师留名 水电工留名 泥工留名 木工留名 漆工留名', '6', '7', '300.00');
INSERT INTO transaction VALUES ('24', '3', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '1', '2', '50.00');
INSERT INTO transaction VALUES ('25', '1', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '3', '3', '100.00');
INSERT INTO transaction VALUES ('26', '16', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '1', '2', '50.00');
INSERT INTO transaction VALUES ('27', '3', '12', '4.00', '大型房屋装饰 需要钢铁量较大 2设计师留名 3水电工留名 4泥工留名 5木工留名 6漆工留名', '7', '7', '64.00');
INSERT INTO transaction VALUES ('28', '3', '12', '50.00', '小户型精装 可能需要大量水泥材料', '1', '2', '50.00');
INSERT INTO transaction VALUES ('29', '20', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '1', '2', '50.00');
INSERT INTO transaction VALUES ('30', '3', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '1', '2', '50.00');
INSERT INTO transaction VALUES ('31', '3', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '1', '2', '50.00');
INSERT INTO transaction VALUES ('32', '3', '12', '20.00', '大型房屋装饰 需要钢铁量较大 fdsf d fsd er da', '5', '6', '1370.00');
INSERT INTO transaction VALUES ('33', '3', '12', '50.00', '小户型精装 可能需要大量水泥材料', '1', '2', '50.00');
INSERT INTO transaction VALUES ('34', '3', '2', '50.00', '小户型装饰', '1', '2', '50.00');
INSERT INTO transaction VALUES ('35', '3', '1', '50.00', '1', '1', '2', '50.00');
INSERT INTO transaction VALUES ('36', '21', '12', '1000.00', '大型房屋装饰 需要钢铁量较大 设计方案:xxxxxx', '2', '2', '50.00');
INSERT INTO transaction VALUES ('37', '3', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '0', '0', '0.00');
INSERT INTO transaction VALUES ('38', '22', '12', '50.00', '小户型精装 可能需要大量水泥材料', '1', '2', '50.00');
INSERT INTO transaction VALUES ('39', '3', '12', '50.00', '大型房屋装饰 需要钢铁量较大', '0', '0', '0.00');
INSERT INTO transaction VALUES ('40', '16', '1', '50.00', '大型房户装饰', '0', '0', '0.00');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `UserId` varchar(20) NOT NULL COMMENT '用户名',
  `Password` varchar(20) NOT NULL COMMENT '密码',
  `Tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'å•Šå•Šå•Šå•Š',
  `Description` varchar(100) DEFAULT NULL COMMENT '对自己房屋的描述',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', '1', '1', '1', '1');
INSERT INTO user VALUES ('2', '2', '2', '2', '2');
INSERT INTO user VALUES ('3', '3', '3', '3', '3');
INSERT INTO user VALUES ('4', '4', '4', '4', '4');
INSERT INTO user VALUES ('5', '5', '5', '5', '5');
INSERT INTO user VALUES ('6', '6', '6', '6', '6');
INSERT INTO user VALUES ('7', '7', '7', '7', '7');
INSERT INTO user VALUES ('8', '8', '8', '8', '8');
INSERT INTO user VALUES ('9', '9', '9', '9', '9');
INSERT INTO user VALUES ('10', '10', '10', '10', '10');
INSERT INTO user VALUES ('11', 'wx', 'ww', '11', 'ww');
INSERT INTO user VALUES ('12', 'wada', 'dwa', '1131', 'ewqe');
INSERT INTO user VALUES ('13', 'qwe', 'eqeqwe', '12312', 'eqweqe');
INSERT INTO user VALUES ('14', '华为装饰公司', '123456', '10000', '承接各种装饰业务');
INSERT INTO user VALUES ('15', '小米装饰公司', '123456', '', '');
INSERT INTO user VALUES ('16', '王骁', '19960808019', '18795905752', '需要小户型装饰');
INSERT INTO user VALUES ('17', 'zzz', '123456', '1', '2');
INSERT INTO user VALUES ('18', 'www', 'www', '1', '1');
INSERT INTO user VALUES ('19', '31', '1', '1', '1');
INSERT INTO user VALUES ('20', 'q', 'q', '1', 'q');
INSERT INTO user VALUES ('21', '测试', '123', '18795905752', '123');
INSERT INTO user VALUES ('22', 'wxx', 'wxx', '12', '12');

-- ----------------------------
-- Table structure for `work`
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `ID` int(11) NOT NULL,
  `CompanyID` int(11) NOT NULL,
  `CompanyuserID` varchar(20) NOT NULL,
  `Description` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `workCompanyID` (`CompanyID`),
  CONSTRAINT `workCompanyID` FOREIGN KEY (`CompanyID`) REFERENCES `company` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work
-- ----------------------------
INSERT INTO work VALUES ('1', '1', '1', '大型房户装饰');
INSERT INTO work VALUES ('2', '1', '1', '室内精装');
INSERT INTO work VALUES ('3', '2', '2', '小户型装饰');
INSERT INTO work VALUES ('4', '2', '2', '室内装饰');
INSERT INTO work VALUES ('22', '1', '1', '1');
INSERT INTO work VALUES ('26', '12', '小米装饰公司', '小户型精装 可能需要大量水泥材料\r\n');
INSERT INTO work VALUES ('31', '12', '小米装饰公司', '<h2>大型房屋装饰 需要钢铁量较大</h2>');
INSERT INTO work VALUES ('33', '12', '小米装饰公司', '<weight>三大UI哈师大</weight>');
INSERT INTO work VALUES ('35', '3', '3', 'qqqqq');
INSERT INTO work VALUES ('36', '3', '3', 'å¸å¸å¸');
INSERT INTO work VALUES ('37', '12', '小米装饰公司', '<code>一哈哈哈x</code>');
INSERT INTO work VALUES ('38', '12', '小米装饰公司', '<h1>!@#$%^&*()_</h1>');
INSERT INTO work VALUES ('39', '1', 'da', '12');
