
CREATE TABLE `user_info` (
  `user_id` varchar(32) NOT NULL COMMENT '用户主键',
  `job_number` varchar(16) NOT NULL COMMENT '工号',
  `realname` varchar(8) NOT NULL COMMENT '姓名',
  `login_name` varchar(16) NOT NULL COMMENT '登录名',
  `login_password` varchar(32) NOT NULL COMMENT '登录密码',
  `department_id` varchar(32) NOT NULL COMMENT '部门主键',
  `role_id` varchar(32) NOT NULL COMMENT '角色主键',
  `e_mail` varchar(32) NOT NULL COMMENT '邮箱ַ',
  `contact_way` varchar(16) NOT NULL COMMENT '联系方式',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：1-已删除 0-未删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建人',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

CREATE TABLE `user_session` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `user_id` varchar(32) NOT NULL COMMENT '用户主键',
  `session_id` varchar(32) NOT NULL COMMENT 'sessionId',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：1-已删除 0-未删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户会话信息表';

CREATE TABLE `role_info` (
  `role_id` varchar(32) NOT NULL COMMENT '角色主键',
  `role_name` varchar(16) NOT NULL COMMENT '角色名称',
  `short_name` varchar(8) NOT NULL COMMENT '角色简称',
  `remark` varchar(32) NOT NULL COMMENT '备注',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：1-已删除 0-未删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息表';

CREATE TABLE `department_info` (
  `department_id` varchar(32) NOT NULL COMMENT '部门主键',
  `department_name` varchar(16) NOT NULL COMMENT '部门名称',
  `short_name` varchar(8) NOT NULL COMMENT '部门简称',
  `remark` varchar(32) NOT NULL COMMENT '备注',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：1-已删除 0-未删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息表';

CREATE TABLE `horse_info` (
  `horse_id` varchar(32) NOT NULL COMMENT '主键ID',
  `passport_number` varchar(8) NOT NULL COMMENT '护照卡号',
  `horse_name` varchar(16) NOT NULL COMMENT '姓名',
  `used_name` varchar(16) NOT NULL COMMENT '变更马名',
  `country` varchar(16) NOT NULL COMMENT '国籍',
  `change_date` varchar(10) NOT NULL DEFAULT '' COMMENT '变更日期',
  `birthday` varchar(4) NOT NULL COMMENT '出生年',
  `height` varchar(8) NOT NULL COMMENT '身高',
  `sex` varchar(32) NOT NULL COMMENT '性别',
  `bar_code` varchar(16) NOT NULL COMMENT '皮下微型条码',
  `coat_colour` varchar(8) NOT NULL COMMENT '毛色',
  `head_desc` varchar(32) NOT NULL COMMENT '头部描述',
  `left_fore_desc` varchar(32) NOT NULL COMMENT '左前肢描述',
  `right_fore_desc` varchar(32) NOT NULL COMMENT '右前肢描述',
  `left_hind_desc` varchar(32) NOT NULL COMMENT '左后肢描述',
  `right_hind_desc` varchar(32) NOT NULL COMMENT '右后肢描述',
  `body_desc` varchar(32) NOT NULL COMMENT '体驱描述',
  `right_image` longblob NOT NULL COMMENT '右侧图片',
  `left_image` longblob NOT NULL COMMENT '左侧图片',
  `upper_eyeliner_image` longblob NOT NULL COMMENT '上眼线图片',
  `fore_image` longblob NOT NULL COMMENT '前肢图片',
  `hind_image` longblob NOT NULL COMMENT '后肢描述',
  `neck_image` longblob NOT NULL COMMENT '颈部图片',
  `lip_image` longblob NOT NULL COMMENT '唇部图片',
  `host_id` varchar(32) NOT NULL DEFAULT '-1' COMMENT '马主主键',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：0-未删除 1-已删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`horse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='马匹基本信息表';

CREATE TABLE `dictionary_detail` (
  `dictionary_detail_id` int(8) unsigned NOT NULL AUTO_INCREMENT COMMENT '字典详情主键',
  `item_code` varchar(16) NOT NULL COMMENT '参数编码',
  `item_value` varchar(16) NOT NULL COMMENT '参数值',
  `dictionary_id` int(8) NOT NULL COMMENT '字典主键',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：1-已删除 0-未删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`dictionary_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典信息详情表';

CREATE TABLE `dictionary_info` (
  `dictionary_id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '字典主键',
  `type_code` varchar(16) NOT NULL COMMENT '类型编码',
  `type_name` varchar(16) NOT NULL COMMENT '类型名称',
  `sort` int(6) NOT NULL COMMENT '排序',
  `remark` varchar(32) NOT NULL COMMENT '备注',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：1-已删除 0-未删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`dictionary_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典信息表';

CREATE TABLE `host_info` (
  `host_id` varchar(32) NOT NULL COMMENT '马主主键',
  `host_name` varchar(16) NOT NULL COMMENT '姓名',
  `sex` int(8) NOT NULL COMMENT '性别',
  `occupation` varchar(16) NOT NULL COMMENT '职业',
  `contact_way` varchar(16) NOT NULL COMMENT '联系方式',
  `address` varchar(32) NOT NULL COMMENT '地址',
  `horse_id` varchar(32) NOT NULL COMMENT '马匹主键',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用标志位：1-启用 0-停用',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标志位：1-已删除 0-未删除',
  `data_version` int(8) NOT NULL DEFAULT '1' COMMENT '数据版本',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`host_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='马主信息表';
