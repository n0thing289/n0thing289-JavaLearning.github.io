CREATE TABLE admin(
	`name` VARCHAR(32) NOT NULL UNIQUE,
	pwd VARCHAR(32) NOT NULL DEFAULT '') CHARACTER SET utf8;
	
INSERT INTO admin VALUES('tom', '123');

-- sql注入 

-- 输入用户名为 1' or
-- 输入密码 or '1' = '1

SELECT * FROM admin WHERE `name` = 'tom' AND pwd = '123';
SELECT * FROM admin WHERE `name` = '1' OR' AND pwd = 'OR '1' = '1';

SELECT * FROM admin;