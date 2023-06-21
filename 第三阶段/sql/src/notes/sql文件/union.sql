SELECT ename,sal,job FROM emp WHERE sal>2500;

SELECT ename,sal,job FROM emp WHERE job='MANAGER';

-- union all就是对两个查询结果合并不会去重
SELECT ename,sal,job FROM emp WHERE sal>2500
UNION ALL
SELECT ename,sal,job FROM emp WHERE job='MANAGER';

-- union
SELECT ename,sal,job FROM emp WHERE sal>2500
UNION
SELECT ename,sal,job FROM emp WHERE job='MANAGER';