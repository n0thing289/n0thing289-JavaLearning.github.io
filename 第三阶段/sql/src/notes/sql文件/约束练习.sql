CREATE DATABASE shop_db;
CREATE TABLE goods (
	goods_id INT PRIMARY KEY,
	goods_name VARCHAR(32) NOT NULL DEFAULT '',
	uniprice DOUBLE NOT NULL DEFAULT 1 CHECK (uniprice BETWEEN 1.0 AND 9999.99),
	category INT NOT NULL DEFAULT 0,
	provider VARCHAR(64) NOT NULL DEFAULT '');

CREATE TABLE customer (
	customer_id CHAR(8) PRIMARY KEY,
	`name` VARCHAR(64`shop_db`) NOT NULL DEFAULT '',
	address VARCHAR(32) NOT NULL DEFAULT '',
	email VARCHAR(32) UNIQUE NOT NULL,
	sex ENUM('男', '女') NOT NULL, -- 枚举类型, 要么男或者女为值,会生效的
	card_id CHAR(18));

CREATE TABLE purchase (
	order_id INT UNSIGNED,
	customer_id CHAR(8) NOT NULL DEFAULT '',
	goods_id INT NOT NULL DEFAULT 0,
	nums_id INT,
	FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id));