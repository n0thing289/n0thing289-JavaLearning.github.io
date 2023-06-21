-- 1. 开了两个mysql控制台
-- 2. 查看当前mysql隔离级别
SELECT @@tx_isolation;

-- 设置隔离级别
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;




-- 查看当前会话隔离级别
SELECT @@tx_isolation;
-- 查看系统当前隔离级别
SELECT @@global.tx_isolation;

-- 设置当前会话隔离级别
SET SESSION transaction...
-- 设置系统当前隔离级别
SET GLOBAL TRANSACTION