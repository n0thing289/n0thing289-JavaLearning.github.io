-- 1.选择部门30中的所有员工
SELECT * FROM emp WHERE deptno = 30;
-- 2.列出所有办事员(CLERK)的姓名，编号和部门编号
SELECT ename, empno, deptno FROM emp WHERE job = 'CLERK';
-- 3.找出佣金高于薪金的员工.
SELECT * FROM emp WHERE IFNULL(comm,0) > sal;
-- 4.找出佣金高于薪金60%的员工
SELECT * FROM emp WHERE IFNULL(comm,0) > (sal*0.6);
-- 5.找出部门10中所有经理(MANAGER)和部门20中所有办事员(CLERK)的详细资料
SELECT * FROM emp WHERE (deptno = 10 AND job = 'MANAGER') OR (deptno = 20 AND job='CLERK'); 
-- 6.找出部门10中所有经理(MANAGER),部门20中所有办事员(CLERK),还有既不是经理又不是办事员
-- 但其薪金大于或等于2000的所有员工的详细资料
SELECT * FROM emp WHERE (deptno = 10 AND job = 'MANAGER') OR (deptno = 20 AND job='CLERK')
	OR (job NOT IN ('MANAGER','CLERK') AND sal >=2000); 

-- 7.找出收取佣金的员工的不同工作
SELECT DISTINCT job FROM emp WHERE comm IS NOT NULL;
-- 8.找出不收取佣金或收取的佣金低于100的员工
SELECT ename FROM  emp WHERE comm IS NULL OR IFNULL(comm,0) < 100;
-- 9.找出各月倒数第3天受雇的所有员工
SELECT LAST_DAY(NOW()) FROM DUAL;  -- 返回一个日期
SELECT * FROM emp WHERE DAY(LAST_DAY(hiredate)) = DAY(DATE_ADD(hiredate, INTERVAL 2 DAY));
-- 10.找出早于12年前受雇的员工(入职时间超过12年)
SELECT * FROM emp WHERE DATE_SUB(NOW(), INTERVAL 12 YEAR) > hiredate;
-- 11.以首字母小写的方式显示所有员工的姓名
SELECT ename, CONCAT(LCASE(SUBSTRING(ename, 1,1)), SUBSTRING(ename, 2)) AS 'ename' FROM emp;
-- 12.显示正好为5个字符的员工的姓名
SELECT ename FROM emp WHERE ename LIKE '_____';

-- 小结
-- 	1. comm最好用ifnull去判断值, 以及is (not) null
-- 	2. LAST_DAY(NOW()) 返回该日期所在月份的最后一天
-- 	3. day(),year() month() 取出日期的部分
-- 	4. length() 算字符串长度


-- 13.显示不带有"R"的员工的姓名.
SELECT ename FROM emp WHERE ename NOT LIKE '%R%';
-- 14.显示所有员工姓名的前三个字符.
SELECT SUBSTRING(ename,1,3) FROM emp;
-- 15.显示所有员工的姓名,用a替换所有"A”
SELECT REPLACE(ename, 'A','a') FROM emp;
-- 16.显示满10年服务年限的员工的姓名和受雇日期.
SELECT ename, hiredate FROM emp WHERE DATE_ADD(hiredate, INTERVAL 10 YEAR) <= NOW();
-- 17.显示员工的详细资料,按姓名排序.
SELECT * FROM emp ORDER BY ename DESC;
-- 18.显示员工的姓名和受雇日期,根据其服务年限,将最老的员工排在最前面
SELECT MAX(DATEDIFF(NOW(), hiredate)) FROM emp;
SELECT ename, hiredate,DATEDIFF(NOW(), hiredate) FROM emp ORDER BY DATEDIFF(NOW(), hiredate) DESC;

-- -- 19.显示所有员工的姓名、工作和薪金,按工作降序排序,若工作相同则按薪金排序.
SELECT ename,sal,job FROM emp ORDER BY job DESC, sal ASC;
-- 20.显示所有员工的姓名、加入公司的年份和月份,按受雇日期所在月排序,若月份相同则将最早年份
-- 的员工排在最前面
SELECT ename, YEAR(hiredate) `year`, MONTH(hiredate) `month` FROM emp ORDER BY `month`, `year`;

-- 21.显示在一个月为30天的情况所有员工的日薪金,忽略余数
SELECT ename, FORMAT(sal/30,0) AS '日新金' FROM emp;
-- 22.找出在(任何年份的)2月受聘的所有员工
SELECT ename, hiredate FROM emp WHERE MONTH(hiredate) = 2;
-- 23.对于每个员工,显示其加入公司的天数
SELECT DATEDIFF(NOW(), hiredate) FROM emp;

-- 24.显示姓名字段的任何位置包含"A”的所有员工的姓名
SELECT ename FROM emp WHERE ename LIKE '%A%';
-- 25.以年月日的方式显示所有员工的服务年限.(大概)
SELECT FORMAT(DATEDIFF(NOW(), hiredate)/365,0) AS '服务年数', FORMAT(DATEDIFF(NOW(), hiredate)% 365 /30,0) AS '服务月数', DATEDIFF(NOW(), hiredate)%31 AS '服务天数' FROM emp;