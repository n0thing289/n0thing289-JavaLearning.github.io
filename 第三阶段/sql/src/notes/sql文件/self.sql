SELECT worker.ename, boss.ename FROM emp worker, emp boss
	WHERE worker.mgr = boss.empno;