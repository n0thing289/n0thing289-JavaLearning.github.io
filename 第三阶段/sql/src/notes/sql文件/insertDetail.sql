# 1. 插入的数据应与字段的数据类型一致（'30' 会尝试强转成一个int）
INSERT INTO goods (id, goods_name, price) VALUES('30', 'vivo', 2500);

# 2. 数据的长度应在列所规定的范围，例如：不能把长度400的字符串加入到长度40的列中
INSERT INTO goods (id, goods_name, price) VALUES(40, 'vivovivovivovivovivo', 3000);

# 3. values（）中所写的数据顺序必须和列的字段的排列位置相同
INSERT INTO goods (id, goods_name, price) VALUES(2500, '30', 'vivo');

# 4. 字符和日期数据应包含在单引号中
INSERT INTO goods (id, goods_name, price) VALUES('50', 'vivo', 2500);

#5. 列可以插入空值[前提是该字段允许位空], insert into table value(null) 只要字段没写not null关键字,那么默认允许为空
INSERT INTO goods (id, goods_name, price) VALUES(NULL, 'vivo', 2500);

-- 6. insert into tabname (...) values (),(),();形式添加多条记录
INSERT INTO goods (id, goods_name, price) VALUES('60', 'vivo', 2500),('70', 'vivo', 2500),('80', 'vivo', 2500);

-- 7. 如果是给表中所有字段添加数据, 可以不用写前面的字段名称
-- 8. 默认值的使用: 当不给某个字段值时, 如果有默认值就会添加,否则报错
	-- 如果某个列 没有指定not null,那么当添加数据时没有给定值,则会默认给null
	-- 如果希望指定某个列的默认值可以在创建表的时候指定default ''
INSERT INTO goods02 (id, goods_name) VALUES(80, '格力手机')