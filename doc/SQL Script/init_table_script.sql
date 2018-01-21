
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



