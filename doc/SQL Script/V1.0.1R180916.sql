ALTER TABLE `asset_info`
ADD COLUMN `use_status`  varchar(16) NOT NULL AFTER `scrap_date`,
ADD COLUMN `finance_source`  varchar(32) NOT NULL AFTER `use_status`;

ALTER TABLE `asset_info`
MODIFY COLUMN `bar_code`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '条形码' AFTER `asset_id`;

