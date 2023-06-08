# tinyint -128 ~ 127， 无符号 0-255
# 老韩解读不写表的默认，按数据库走
# 	如果没有指定unsigned， 那么其是有符号
CREATE TABLE `t3` (`id` TINYINT);

CREATE TABLE `t4` (`id` TINYINT UNSIGNED);

INSERT INTO t3 VALUES(-128);

SELECT * FROM t3;

INSERT INTO t4 VALUES(0);
INSERT INTO t4 VALUES(255);

