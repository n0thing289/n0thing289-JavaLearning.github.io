CREATE TABLE stu(id INT, `name` VARCHAR(32));
INSERT INTO stu VALUES(1, 'jack'),(2,'tom'),(3, 'katty'),(4,'nono');
SELECT * FROM stu;

CREATE TABLE exam(id INT, grade INT);
INSERT INTO exam VALUES(1,56),(2,76),(11,8);
SELECT * FROM exam;

SELECT `name`,stu.id,grade FROM stu,exam
	WHERE stu.id = exam.id;
	
SELECT `name`,stu.id,grade FROM stu
	LEFT JOIN exam ON stu.id = exam.id;
	
SELECT `name`,exam.id,grade FROM stu
	RIGHT JOIN exam ON stu.id = exam.id;
	
	
-- 练习`
SELECT ename,dept.deptno,dname 
	FROM emp RIGHT JOIN dept 
	ON emp.deptno = dept.deptno;
-- 使用的小细节
-- 1. 先找相同同的列，作为关联条件
-- 1. select 后面写共同的主表的列名！