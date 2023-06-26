-- check在mysql5 只是语法上支持, 但无法生效,要8版本才行
CREATE TABLE t23(
	id INT PRIMARY KEY,
	`name` VARCHAR(32),
	sex VARCHAR(6) CHECK(sex IN ('man', 'woman')),
	sal DOUBLE CHECK (sal > 1000 AND sal < 2000));
	
INSERT INTO t23 
	VALUES(1, 'jack', 'mid', 1);
	
SELECT * FROM t23;

