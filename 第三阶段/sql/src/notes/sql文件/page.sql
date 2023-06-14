SELECT * FROM emp 
	ORDER BY empno
	LIMIT 0,3;
	
SELECT * FROM emp 
	ORDER BY empno
	LIMIT 3,3;
	
SELECT * FROM emp 
	ORDER BY empno
	LIMIT 6,3;
	
-- 得到一个公式： limit 每页显示的记录数 * （第一页-1） ， 每页显示的记录数
-- 
-- 练习
SELECT * FROM emp
	ORDER BY empno
	LIMIT 20,5;