-- (1)
SELECT COUNT(*), AVG(sal),job FROM emp
	GROUP BY job;
-- (2)
-- count(某一列)时，如果某一记录的值是null是不会统计的
SELECT COUNT(*), COUNT(comm) FROM emp;

SELECT COUNT(*), COUNT(IF(comm IS NULL, 'abc',NULL)) FROM emp;

SELECT COUNT(*), COUNT(*) - COUNT(IF(comm IS NULL, 'abc',NULL)) FROM emp;
-- (3)
SELECT COUNT(*) FROM emp
	WHERE job='MANAGER';
SELECT COUNT(DISTINCT mgr) FROM emp;	
	
-- (4)
SELECT MAX(sal) - MIN(sal) FROM emp;
	
SELECT * FROM emp;


-- 
SELECT deptno, AVG(sal) AS avg_sal FROM emp
	GROUP BY deptno
	HAVING avg_sal > 1000
	ORDER BY avg_sal DESC
	LIMIT 0,2;