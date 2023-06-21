-- 事务的一个重要的概念和具体操作
CREATE TABLE t27(
	id INT,
	`name` VARCHAR(32));
-- 开始事务
START TRANSACTION;

-- 设置保存点
SAVEPOINT a;

-- 执行dml操作
INSERT INTO t27 VALUES(100, 'tom');
SELECT * FROM t27;

SAVEPOINT b;
INSERT INTO t27 VALUES(200, 'jack');


ROLLBACK TO b;
ROLLBACK TO a;
ROLLBACK; -- 如果什么都不写,旧回到事务开始的状态

-- commit提交,是真正的给你保存, 确认没毛病旧提交后,就没有机会回退了
-- 回退不要很多步, 因为跳过中间保存点时,会被删除,最好一步一步回退

