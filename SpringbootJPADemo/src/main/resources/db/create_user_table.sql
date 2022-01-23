CREATE TABLE `user` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(20) NOT NULL COLLATE 'latin1_swedish_ci',
	`phone` VARCHAR(20) NOT NULL COLLATE 'latin1_swedish_ci',
	PRIMARY KEY (`id`) USING BTREE,
	UNIQUE INDEX `인덱스 2` (`phone`) USING BTREE
)
COMMENT='test user'
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=6
;
