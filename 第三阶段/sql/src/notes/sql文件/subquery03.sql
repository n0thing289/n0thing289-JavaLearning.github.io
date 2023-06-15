-- 第一题
SELECT AVG(sal), deptno FROM emp
	GROUP BY deptno;
	
SELECT sal, emp.deptno, ename FROM emp, (SELECT AVG(sal) AS avg_sal, deptno FROM emp
	GROUP BY deptno) temp
	WHERE emp.deptno = temp.deptno AND sal > avg_sal;


-- 第二题
SELECT MAX(sal),deptno FROM emp
	GROUP BY deptno;

SELECT * FROM emp
	WHERE (sal, deptno) IN (SELECT MAX(sal),deptno FROM emp
	GROUP BY deptno);
	
-- 第二题的老韩方法
SELECT * FROM emp, (SELECT MAX(sal) AS max_sal, deptno FROM emp
	GROUP BY deptno) temp
	WHERE emp.deptno = temp.deptno AND sal = max_sal;
	
-- 第三题
SELECT * FROM emp;
SELECT * FROM dept;

SELECT COUNT(*), deptno FROM emp GROUP BY deptno;

SELECT dname, dept.deptno, loc, num FROM dept, (SELECT COUNT(*) AS num, deptno FROM emp GROUP BY deptno) temp
	WHERE temp.deptno = dept.deptno;
-- 第三题 第二种写法 表.* 表示将该列所有列都显示出来； 在多表查询中，列名不会有重复就不用指定市那个表的列