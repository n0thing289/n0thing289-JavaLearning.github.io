CREATE TABLE department(
	departmentid VARCHAR(32) PRIMARY KEY,
	deptname VARCHAR(32) UNIQUE NOT NULL);
	
CREATE TABLE class(
	classid INT PRIMARY KEY,
	`subject` VARCHAR(32),
	deptname VARCHAR(32),
	enrolltime INT NOT NULL DEFAULT 2000,
	num INT NOT NULL DEFAULT 0,
	FOREIGN KEY (deptname) REFERENCES department(deptname));
DROP TABLE department;
DROP TABLE class;
DROP TABLE student05;

CREATE TABLE student05(
	studentid INT PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	age INT NOT NULL DEFAULT 0,
	classid INT,
	FOREIGN KEY (classid) REFERENCES class(classid));
	
INSERT INTO department VALUES(001, '数学'), (002,'计算机'),(003,'化学'),(004,'中文'),(005,'经济');
INSERT INTO class VALUES
	(101,'软件','计算机', 1995,20),
	(102,'微电子','计算机',1996,30),
	(111,'无机化学','化学', 1995,29),
	(112,'高分子化学','化学',1996,25),
	(121,'统计数学','数学',1995,20),
	(131,'现代语言','中文',1996,20),
	(141,'国际贸易','经济',1997,30),
	(142,'国际金融','经济',1996,14);
INSERT INTO student05 VALUES
	(8101,'张飞',18,101),
	(8102,'钱四',16,121),
	(8103,'王玲',17,131),
	(8105,'李飞',19,102),
	(8109,'赵四',18,141),
	(8110,'李可',20,142),
	(8201,'张飞',18,111),
	(8302,'周瑜',16,112),
	(8203,'王亮',17,111),
	(8305,'董庆',19,102),
	(8409,'赵龙',18,101),
	(8510,'李丽',20,142);
-- 3.1
SELECT * FROM student05 WHERE `name` LIKE '李%';
-- 3.2
SELECT IF(COUNT(`subject`)>1, deptname,NULL) FROM class GROUP BY deptname;
SELECT COUNT(`subject`) AS nums,deptname FROM class GROUP BY deptname HAVING nums >1;
-- 3.3
/*	子查询作为临时表
*/
SELECT SUM(num) AS total, deptname FROM class GROUP BY deptname HAVING total>=30;
SELECT MIN(departmentid),d.deptname,SUM(num) AS total FROM department d,class c WHERE d.deptname = c.deptname GROUP BY d.deptname HAVING total >= 30;

SELECT temp.*, departmentid FROM department, (SELECT SUM(num) AS total, deptname FROM class GROUP BY deptname HAVING total>=30) temp WHERE department.deptname = temp.deptname;


-- 4
INSERT INTO department VALUES(006, '物理');
-- 5
START TRANSACTION;
DELETE FROM student05 WHERE `name` = '李丽';

UPDATE class SET num=num-1 WHERE classid = (SELECT classid FROM student05 WHERE `name` = '李丽');

SELECT * FROM student05;
SELECT * FROM class;
COMMIT;

