-- 1. 列出至少有一个员工的所有部门C
SELECT ename, emp.deptno, dname FROM emp, dept WHERE emp.deptno = dept.deptno ORDER BY dname;
SELECT COUNT(*) AS c, deptno FROM emp GROUP BY deptno HAVING c > 1; 
-- 2. 列出薪金比“SMITH”多的所有员工。`hsp_db02``actor``actor`
/*	用子查询
	先查找SMITH的sal
	再作为子查询去查其他员工的
*/
SELECT sal FROM emp WHERE ename = 'SMITH';
SELECT ename, sal FROM emp WHERE sal > (SELECT sal FROM emp WHERE ename = 'SMITH') ORDER BY sal;
-- 3. 列出受雇日期晚于其直接上级的所有员工
/*	用自链接
	先找直接上级
	再与上日期的比较*/
SELECT worker.ename '员工名',boss.ename '上级名',worker.hiredate '员工入职时间', boss.hiredate '上级入职时间' FROM emp worker, emp boss WHERE worker.mgr = boss.empno AND worker.hiredate > boss.hiredate;
-- 4. 列出部门名称和这些部门的员工信息，同时列出那些没有员工的部门。
/*	用外连接
	*/
SELECT dname, ename,job,sal,hiredate FROM emp RIGHT JOIN dept ON emp.deptno = dept.deptno ORDER BY dname;
-- 5. 列出所有“CLERK” (办事员)的姓名及其部门名称
/*	用多表
	*/
SELECT ename, dname FROM emp,dept WHERE emp.deptno = dept.deptno AND job = 'CLERK';
-- 6. 列出最低薪金大于1500的各种工作。
/*
	先查各个部门的最低工资*/
SELECT DISTINCT job,sal FROM emp WHERE sal >1500;  -- mistake
SELECT MIN(sal) AS min_sal,job FROM emp GROUP BY job HAVING min_sal>1500;
-- 7. 列出在部门“SALES” (销售部) 工作的员工的姓名
SELECT dname,ename FROM emp, dept WHERE emp.deptno = dept.deptno AND dname = 'SALES';
-- 8. 列出薪金高于公司平均薪金的所有员工。
SELECT AVG(sal) FROM emp;
SELECT ename, sal FROM emp WHERE sal > (SELECT AVG(sal) FROM emp);
-- 9. 列出与“SCOTT”从事相同工作的所有员工
SELECT job FROM emp WHERE ename = 'SCOTT';
SELECT ename,job FROM emp WHERE job = (SELECT job FROM emp WHERE ename = 'SCOTT');
-- 10. 列出薪金高于在部门30工作的所有员工的薪金的员工姓名和薪金
SELECT sal FROM emp WHERE deptno = 30;
SELECT ename, sal FROM emp WHERE sal > ALL(SELECT sal FROM emp WHERE deptno = 30);
SELECT ename, sal FROM emp WHERE sal > (SELECT MAX(sal) FROM emp WHERE deptno = 30);
-- 11. 列出在每个部门工作的员工数量、平均工资和平均服务期限。
SELECT deptno,COUNT(ename) '员工数量', FORMAT(AVG(sal), 2) '平均薪资',FLOOR(AVG(DATEDIFF(NOW(), hiredate)/365)) '平均服务期限(年)' FROM emp GROUP BY deptno;
-- 12. 列出所有员工的姓名、部门名称和工资。
SELECT ename, dname,sal FROM emp,dept WHERE emp.deptno = dept.deptno;
-- 13. 列出所有部门的详细信息和部门人数。
/*	用临时表
*/
SELECT COUNT(*), deptno FROM emp GROUP BY deptno;
SELECT dept.*, num FROM (SELECT COUNT(*) AS num, deptno FROM emp GROUP BY deptno) tmp,dept WHERE tmp.deptno = dept.deptno;
-- 14. 列出各种工作的最低工资。
SELECT MIN(sal),job FROM emp GROUP BY job;
-- 15. 列出MANAGER (经理)的最低薪金。
SELECT MIN(sal),job FROM emp WHERE job = 'MANAGER' GROUP BY job;
-- 16. 列出所有员工的年工资,按年薪从低到高排序.
SELECT ename,IF(comm IS NULL,sal*12, sal*12 + comm) AS year_sal FROM emp ORDER BY year_sal;


-- 小结:
-- 	1. emp.*
-- 	2. 注意comm的null
-- 	3. 纸上得来终觉浅, 得知此事要躬行