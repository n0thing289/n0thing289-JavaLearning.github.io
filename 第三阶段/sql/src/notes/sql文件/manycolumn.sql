SELECT deptno, job FROM emp
	WHERE ename = 'ALLEN';

SELECT * FROM emp 
	WHERE (deptno, job) = (SELECT deptno, job FROM emp
		WHERE ename = 'ALLEN')
	AND ename!='ALLEN';
	

SELECT * FROM student;
SELECT * FROM student
	WHERE (chinese, math, english) = (SELECT chinese, math, english FROM student WHERE `name` = '宋江') AND `name` !='宋江';