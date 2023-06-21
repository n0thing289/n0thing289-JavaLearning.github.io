CREATE TABLE my_tab01(
	id INT,
	`name` VARCHAR(32),
	sal DOUBLE,
	job VARCHAR(32),
	deptno INT);


DESC my_tab01;
SELECT * FROM my_tab01;

INSERT INTO my_tab01
	(id, `name`, sal, job,deptno)
	SELECT empno,ename,sal,job,deptno FROM emp;
	
INSERT INTO my_tab01 SELECT * FROM my_tab01;
SELECT COUNT(*) FROM my_tab01;

-- 去重
-- 1.先创建一张表 my_tab02
-- 2. 让第二张表有重复的记录
CREATE TABLE my_tab02 LIKE emp; -- 这种语法 把emp表的结构,复制到my_tab02里去
DESC my_tab02;
INSERT INTO my_tab02 SELECT * FROM emp;
SELECT * FROM my_tab02;
-- 3. 考虑去重
/*
	1. 
*/
-- 1. 创建一个临时表
CREATE TABLE temp LIKE my_tab02;
-- 2. 用distinct 关键复制给临时表
INSERT INTO  temp SELECT DISTINCT * FROM my_tab02;
SELECT * FROM temp;
-- 3. 清除my_tab02
DELETE FROM my_tab02;
-- 4. 将临时表的数据复制回my_tab02
INSERT INTO my_tab02 SELECT * FROM temp;
-- 5. 删掉临时表
DROP TABLE temp;