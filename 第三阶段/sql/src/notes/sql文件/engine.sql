SHOW ENGINES;

-- myisam 1. 添加速度块 2. 不支持事务和外键 3. 支持表级锁
CREATE TABLE t28(
	id INT,
	`name` VARCHAR(32))  ENGINE MYISAM;
	
START TRANSACTION;
SAVEPOINT a;
INSERT INTO t28 VALUES(1, 'jack');
SELECT * FROM t28;
ROLLBACK TO a;
	
-- memory 1. 数据存储在内存中,数据丢失后表的结构还在 2. 执行速度块 3. 默认支持索引(hash)
CREATE TABLE t29(
	id INT,
	`name` VARCHAR(32))  ENGINE MEMORY;
DESC t29;
INSERT INTO t29 VALUES(1, 'tom'), (2, 'jack'),(3, 'hsp');
SELECT * FROM t29;

ALTER TABLE t29 ENGINE = INNODB;