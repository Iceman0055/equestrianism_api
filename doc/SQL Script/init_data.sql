
-- init dictionary_info data
INSERT INTO `dictionary_info` VALUES ('1', 'HORSE_SEX', '马匹性别', '1', '马匹性别', '1', '0', '1', '2018-03-03 17:10:42', '2018-03-03 17:10:44');
INSERT INTO `dictionary_info` VALUES ('2', 'HORSE_COAT_COLOUR', '马匹毛色', '2', '马匹毛色', '1', '0', '1', '2018-03-03 17:10:37', '2018-03-03 17:10:38');
INSERT INTO `dictionary_info` VALUES ('3', 'SEX', '性别', '3', '性别', '1', '0', '1', '2018-03-03 17:10:39', '2018-03-03 17:10:41');
INSERT INTO dictionary_info VALUES(4, 'PRICE_TYPE', '价值类型', 4, '价值类型', 1, 0, 1, now(), now() );
INSERT INTO dictionary_info VALUES(5, 'ACQUIRE_WAY', '取得方式', 5, '取得方式', 1, 0, 1, now(), now() );

-- init dictionary_detail data
INSERT INTO `dictionary_detail` VALUES ('1', '01', '公', '1', '1', '0', '1', '2018-03-03 17:17:53', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('2', '02', '母', '1', '1', '0', '1', '2018-03-03 17:18:02', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('3', '01', '黑', '2', '1', '0', '1', '2018-03-03 17:18:42', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('4', '02', '白', '2', '1', '0', '1', '2018-03-03 17:18:49', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('5', '03', '骝', '2', '1', '0', '1', '2018-03-03 17:18:59', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('6', '04', '栗', '2', '1', '0', '1', '2018-03-03 17:19:09', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('7', '05', '青', '2', '1', '0', '1', '2018-03-03 17:19:19', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('8', '01', '男', '3', '1', '0', '1', '2018-03-03 17:19:26', '2018-03-03 17:19:54');
INSERT INTO `dictionary_detail` VALUES ('9', '02', '女', '3', '1', '0', '1', '2018-03-03 17:19:33', '2018-03-03 17:19:54');
INSERT INTO dictionary_detail VALUES(10, '01', '价值类型1', 4, 1, 0, 1, now(), now() );
INSERT INTO dictionary_detail VALUES(11, '02', '价值类型2', 4, 1, 0, 1, now(), now() );
INSERT INTO dictionary_detail VALUES(12, '01', '取得方式1', 5, 1, 0, 1, now(), now() );
INSERT INTO dictionary_detail VALUES(13, '02', '取得方式2', 5, 1, 0, 1, now(), now() );



