-- all any 的使用
-- all
SELECT ename, sal, deptno
	FROM emp
	WHERE sal > ALL(SELECT sal FROM emp WHERE deptno = 30); -- 比全部的都高 等价于 比最大的还要高`ecshop`
	
-- any 表示任意一个
SELECT ename,sal,deptno FROM emp
	WHERE sal > ANY(SELECT sal FROM emp WHERE deptno = 30); -- 比任意一个高 等价于 比最小的还要高
	

-- 案例
SELECT goods_id,cat_id,goods_name, shop_price FROM ecs_goods;
SELECT goods_id, ecs_goods.cat_id, goods_name, shop_price FROM ecs_goods, (SELECT MAX(shop_price) AS max_price,cat_id FROM ecs_goods GROUP BY cat_id) temp
	WHERE ecs_goods.cat_id = temp.cat_id AND shop_price = temp.max_price;
-- 案例小结
-- 1. 多表的自查询什么时候用
-- 2. 多表的组合方式， 第一张表的第一行，会遍历第二张表的所有行，全部弄完后，组合成新表
-- 3. max(shop_price) 为什么要起别名， 因为后面用这个值的时候，不能temp.max（shop_price）.
-- 4. abigulous 错误的出现，是因为多表出现了相同的列名