CREATE TABLE student(
	id INT NOT NULL DEFAULT 1,
	`name` VARCHAR(20) NOT NULL DEFAULT '',
	chinese FLOAT NOT NULL DEFAULT 0.0,
	english FLOAT NOT NULL DEFAULT 0.0,
	math FLOAT NOT NULL DEFAULT 0.0);
	
INSERT INTO student VALUES
	(1, '韩顺平', 89,78,90),
	(2, '张飞', 67,98,56),
	(3, '宋江', 87,78,77),
	(4, '关羽', 88,98,90),
	(5, '赵云', 82,84,67),
	(6, '欧阳锋', 55, 85,45),
	(7, '黄蓉', 75,65,30);
	
SELECT * FROM student;

-- 查询表中所有学生的信息
SELECT * FROM student;
-- 查询表中所有学生的姓名和对应的英语成绩
SELECT `name`, english FROM student;
-- 过滤表中重复数据 distinct 。去重不是删掉而是不显示
SELECT DISTINCT * FROM student;
SELECT DISTINCT english FROM student;
-- 要查询的记录，每个字段都相同，才会去重
SELECT DISTINCT `name`, english FROM student;
