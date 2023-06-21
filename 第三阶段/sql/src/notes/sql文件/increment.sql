CREATE TABLE t24(
	id INT PRIMARY KEY AUTO_INCREMENT,
	email VARCHAR(32) NOT NULL DEFAULT '',
	`name` VARCHAR(32) NOT NULL DEFAULT '');

DESC t24;
--  添加自增长的一种方式
INSERT INTO t24
	VALUES(NULL, 'tom@qq.com', 'tom');
-- 自增长的第二种书写方式
INSERT INTO t24
	(email, `name`) VALUES('abc@qq.com', 'abc');-- 如果是以前的写法这样1式错的
SELECT * FROM t24;

-- 细节:
-- 修改默认的自增长开始值
ALTER TABLE t25 AUTO_INCREMENT = 100;
CREATE TABLE t25(
	id INT PRIMARY KEY AUTO_INCREMENT,
	email VARCHAR(32) NOT NULL DEFAULT '',
	`name` VARCHAR(32) NOT NULL DEFAULT '');
INSERT INTO t25
	VALUES(NULL, '667@qq.com', '667'); -- 自增长是把当前最大值+1作为下一个的指
INSERT INTO t25
	(email, `name`) VALUES('abc@qq.com', 'abc');
SELECT * FROM t25;