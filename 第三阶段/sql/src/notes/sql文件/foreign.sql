-- 外键演示

-- 1. 创建主表 2. 确定主键(因为外键不允许有重复的)
CREATE  TABLE my_class (
	id INT PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT ' ');
	
	
CREATE TABLE my_stu (
	id INT PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT ' ',
	class_id INT,
	FOREIGN KEY (class_id) REFERENCES my_class(id));
	
DESC my_stu;
INSERT INTO my_class
	VALUES(100, 'java'), (200, 'web');
SELECT * FROM my_class;
SELECT * FROM my_stu;
INSERT INTO my_stu
	VALUES(1, 'tom', 100), (2, 'jack', 200);
	
INSERT INTO my_stu
	VALUES(3, 'hsp',100);
