-- 多表查询
SELECT ename, sal,dname FROM emp, dept
	WHERE emp.deptno=dept.deptno -- 2. 使用表名.列名的方式访问记录
	ORDER BY emp.deptno;         -- 3. 两张表都有相同的列名,必须指定是哪一个deptno

SELECT dept.deptno,dept.dname, ename, sal
	FROM emp, dept
	WHERE emp.deptno=dept.deptno AND emp.deptno=10;
SELECT * FROM emp;
-- where 分组前筛选；having 分组后筛选；所以having必须和分组一起使用
SELECT * FROM emp, salgrade;
SELECT ename, sal, grade FROM emp, salgrade
	WHERE emp.sal BETWEEN salgrade.losal AND salgrade.hisal;

SELECT ename,sal,dname FROM emp, dept
	WHERE emp.deptno=dept.deptno
	ORDER BY dname DESC; -- ename, sal, dname
