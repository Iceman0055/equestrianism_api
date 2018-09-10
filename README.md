# equestrianism_api

-- 主库
GRANT REPLICATION SLAVE ON *.* to 'mysync'@'192.168.1.118' identified by 'mysnc@0!8';
--从库
change master to master_host='192.168.1.117',master_user='mysync',master_password='mysnc@0!8',master_log_file= 'mysql-bin.000001',master_log_pos=544;
start slave;

配置：
use mysql;
update user set password=password("1q2w3e@!") where user="root";
flush privileges;
grant all privileges on *.* to 'root'@'103.21.119.132' identified by '1q2w3e@!';
flush privileges;
CREATE DATABASE `equestrianism_db`DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
grant all privileges  on equestrianism_db.*  to 'equestrian_user'@'172.16.%' identified by 'Shmsydzx@0!8';