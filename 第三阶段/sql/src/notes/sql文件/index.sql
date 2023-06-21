-- 之前创建主键的方式
CREATE TABLE t25(
	id INT,
	`name` VARCHAR(32));
DROP TABLE t25;
DESC t25;
-- 查看表是否有索引
SHOW INDEXES FROM t25;

-- 添加唯一索引(其实就是唯一unique约束, 防止重复)
CREATE UNIQUE INDEX id_index ON t25 (id);
-- Non_unique 1代表普通索引,0 代表唯一索引

-- 添加普通索引的方式1
CREATE INDEX id_index ON t25(id);
-- 1. 如果某列的值,是不会重复的,者优先考虑使用unique索引,否则使用普通索引 
-- 2. 定义的时候,写了unique约束,那么会自带索引

-- 添加普通索引的方式2
ALTER TABLE t25 ADD INDEX id_index (id);


-- 添加主键索引
CREATE TABLE t26(
	id INT,
	`name` VARCHAR(32));
ALTER TABLE t26 ADD PRIMARY KEY (id);
SHOW INDEX FROM t26;

-- 删除索引
DROP INDEX id_index ON t25;

-- 删除主键索引
ALTER TABLE t26 DROP PRIMARY KEY;


-- 修改索引: 就是先删除,再添加新索引

-- 查询索引
SHOW INDEX FROM t25;
SHOW INDEXES FROM t25;
SHOW KEYS FROM t25;
DESC t25;

-- 索引练习
-- 第一题
CREATE TABLE order1 (
	id INT PRIMARY KEY,
	goods_name VARCHAR(32),
	person VARCHAR(6),
	nums INT);
	
CREATE TABLE order2 (
	id INT,
	goods_name VARCHAR(32),
	person VARCHAR(6),
	nums INT);
ALTER TABLE order2 ADD PRIMARY KEY (id);

SHOW INDEXES FROM order1;
SHOW INDEXES FROM order2;


-- 第二题
CREATE TABLE menu1(
	id INT PRIMARY KEY,
	`food_name` VARCHAR(6),
	cooker VARCHAR(32),
	idcard INT UNIQUE,
	price DOUBLE);
	
CREATE TABLE menu2(
	id INT PRIMARY KEY,
	`food_name` VARCHAR(6),
	cooker VARCHAR(32),
	idcard INT,
	price DOUBLE);
CREATE UNIQUE INDEX idcard_index ON menu2 (idcard);

SHOW INDEXES FROM menu1;
SHOW INDEXES FROM menu2;


-- 第三题
CREATE TABLE sportman1(
	id INT PRIMARY KEY,
	`name` VARCHAR(32),
	special VARCHAR(32));
CREATE INDEX name_index ON sportman1 (`name`);

CREATE TABLE sportman2(
	id INT PRIMARY KEY,
	`name` VARCHAR(32),
	special VARCHAR(32));
ALTER TABLE sportman2 ADD INDEX name_index (`name`);

SHOW INDEXES FROM sportman1;
SHOW INDEXES FROM sportman2;
