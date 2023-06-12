-- 演示加密函数和系统函数

-- user(), 可以查看登录道德mysql的有那些用户,以及登录的ip
SELECT USER() FROM DUAL;

-- database(), 查询当前使用数据库名称
SELECT DATABASE() FROM DUAL;

-- md5(str), 常用于对用户密码加密, root密码是hsp -> 加密md5 -> 在数据库中存放的是加密后的密码
SELECT MD5('hsp') FROM DUAL;
SELECT LENGTH(MD5('hsp')) FROM DUAL;

CREATE TABLE users(
	id INT, 
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	pwd CHAR(32) NOT NULL DEFAULT '');
	
INSERT INTO users VALUES(
	100, '韩顺平', MD5('hsp'));
	
SELECT * FROM users;
-- 加密了那我后台怎么看呢?
SELECT * FROM users WHERE `name`='韩顺平' AND pwd=MD5('hsp');


-- password(str) -- 加密函数, mysql数据库的用户密码就是password函数加密
SELECT PASSWORD('hsp') FROM DUAL;
-- 验证
SELECT * FROM mysql.user; -- 不想切换数据库,可以用库名.表名  *81220D972A52D4C51BB1C37518A2613706220DAC