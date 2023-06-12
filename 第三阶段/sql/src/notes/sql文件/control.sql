-- 演示流程控制函数
-- 1. if(expr1, expr2,expr3)
SELECT IF(TRUE, '北京', '上海') FROM DUAL;
-- 2. ifnull(expr1,expr2)  如果1不为空就把1返回,否则返回2
SELECT IFNULL(NULL, '韩顺平') FROM DUAL;
-- 3. select case when expr1 then expr2 when expr3 then expr4 else expr5 end多重分支
SELECT CASE 
	WHEN expr1 THEN expr2 
	WHEN expr3 THEN expr4 
	ELSE expr5 END
	FROM emp
	

-- 案例
-- 1. 
SELECT ename, IF(comm IS NULL, 0.0, comm) 
	FROM emp; -- 细节 判断是否为null 用is (not) null
	
-- 2. 
SELECT ename, (SELECT CASE 
	WHEN job='CLERK' THEN '职员'
	WHEN job='SALESMAN' THEN '销售经理'
	WHEN job='MANAGE' THEN '经理'
	ELSE job END) AS 'job'
	FROM emp;
