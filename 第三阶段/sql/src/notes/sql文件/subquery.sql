SELECT deptno FROM emp WHERE ename='SMITH';

SELECT * FROM emp
	WHERE deptno = (
		SELECT deptno 
		FROM emp 
		WHERE ename='SMITH');
		
SELECT ename, job, sal, deptno FROM emp
	WHERE job IN (
		SELECT DISTINCT job FROM emp
		WHERE deptno=10)
	AND deptno != 10;
	
	
	
-- 子查询临时表
SELECT goods_id, ecs_goods.cat_id,goods_name,shop_price 
	FROM ecs_goods, (SELECT cat_id, MAX(shop_price) AS mx FROM ecs_goods
	GROUP BY cat_id) temp
	WHERE temp.cat_id = ecs_goods.cat_id 
	AND temp.mx = ecs_goods.shop_price
	;

SELECT cat_id, MAX(shop_price) FROM ecs_goods
	GROUP BY cat_id;