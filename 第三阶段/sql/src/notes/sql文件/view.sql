-- 创建视图
CREATE VIEW emp_view01 AS SELECT empno, ename, job, deptno FROM emp;

-- 查看视图
DESC emp_view01;

SELECT * FROM emp_view01;
SELECT empno, job FROM emp_view01;

-- 查看创建视图的语句
SHOW CREATE VIEW emp_view01;

-- 删除视图
DROP VIEW emp_view01;

-- 细节
-- .ibd是数据文件, .frm是视图的结构文件

UPDATE emp_view01 SET job='MANAGER' WHERE empno = 7369;


CREATE VIEW emp_view03 AS`mysql` SELECT empno, ename, dname, grade FROM emp,dept, salgrade WHERE emp.sal BETWEEN losal AND hisal AND emp.deptno = dept.deptno;
DROP VIEW emp_view03;