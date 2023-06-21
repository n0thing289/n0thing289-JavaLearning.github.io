-- unique
CREATE TABLE t21
	(id INT UNIQUE, -- 表示id不能出现重复
	`name` VARCHAR(32),
	email VARCHAR(32),
	PRIMARY KEY (id, `name`));