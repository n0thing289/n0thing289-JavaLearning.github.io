-- 1. 如果不开始事务,dml操作是自动提交,不能回滚
INSERT INTO t27 VALUES(300, 'milan'); 

-- 2. 如果开始一个事务, 没有保存点,你执行rollback 默认回退到事务开始的状态
START TRANSACTION;
INSERT INTO t27 VALUES(400, 'king');
INSERT INTO t27 VALUES(500, 'scott');
SELECT * FROM t27;
ROLLBACK;

-- 3. 保存点可以多个

-- 4. 没提交前,可以回退

-- 5. innodb支持事务

-- 6. 