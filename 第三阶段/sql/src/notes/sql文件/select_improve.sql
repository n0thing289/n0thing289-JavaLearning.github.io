-- 使用where语句
-- 1. 日期可以直接比较
SELECT * FROM emp
	WHERE hiredate > '1990-01-01';
-- 2. 模糊查询
-- 2.1
SELECT ename, sal FROM emp
	WHERE ename LIKE 's%';
-- 2.2	
SELECT ename, sal FROM emp
	WHERE ename LIKE '__O%';


-- 3. is
SELECT * FROM emp
	WHERE mgr IS NULL;
	
-- 4. desc
DESC emp;

-- 5. order by
-- 5.1
SELECT * FROM emp
	ORDER BY sal;

-- 5.2
SELECT * FROM emp
	ORDER BY deptno ASC, sal DESC;