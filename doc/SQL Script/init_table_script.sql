
CREATE TABLE `user_info` (
  `user_id` varchar(32) NOT NULL COMMENT '�û�����',
  `job_number` varchar(16) NOT NULL COMMENT '����',
  `realname` varchar(8) NOT NULL COMMENT '����',
  `login_name` varchar(16) NOT NULL COMMENT '��¼��',
  `login_password` varchar(32) NOT NULL COMMENT '��¼����',
  `department_id` varchar(32) NOT NULL COMMENT '��������',
  `role_id` varchar(32) NOT NULL COMMENT '��ɫ����',
  `e_mail` varchar(32) NOT NULL COMMENT '�����ַ',
  `contact_way` varchar(16) NOT NULL COMMENT '��ϵ��ʽ',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '���ñ�־λ��1-���� 0-ͣ��',
  `delete_flag` int(1) NOT NULL DEFAULT '0' COMMENT 'ɾ����־λ��0-δɾ�� 1-��ɾ��',
  `data_version` int(8) NOT NULL DEFAULT '0' COMMENT '���ݰ汾',
  `create_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '����ʱ��',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '����ʱ��',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���Ϣ��';

