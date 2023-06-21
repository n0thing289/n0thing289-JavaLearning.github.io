CREATE TABLE t17
	(id INT PRIMARY KEY, -- 表示id是主键，id不可重复
	`name` VARCHAR(32),
	email VARCHAR(32));
	
-- 
INSERT INTO t17 
	VALUES(1, 'jack', 'jack@soho');
	
INSERT INTO t17 
	VALUES(2, 'tom', 'tom@soho');
	
INSERT INTO t17 
	VALUES(1, 'hsp', 'hsp@soho');
-- 细节
-- 1. 主键不能为lull
INSERT INTO t17 
	VALUES(NULL, 'jack', 'jacl@soho');
-- 2. 一张表只能有一个主键, 但是可以有多个复合主键, 意义是这两个同时重复才不能添加
CREATE TABLE t18
	(id INT PRIMARY KEY, 
	`name` VARCHAR(32) PRIMARY KEY,
	email VARCHAR(32));
CREATE TABLE t18
	(id INT,
	`name` VARCHAR(32),
	email VARCHAR(32),
	PRIMARY KEY (id, `name`));
INSERT INTO t18
	VALUES(1, 'jack', 'jack@soho');
INSERT INTO t18 
	VALUES(1, 'hsp', 'jack@soho');
-- 3. 主键有两种方式定义