
CREATE USER 'hsp_edu'@'localhost' IDENTIFIED BY '123456';

SELECT * FROM mysql.user;


--  修改密码
SET PASSWORD = PASSWORD('abcdef');

-- 修改其他用户的密码
SET PASSWORD FOR 'hwk'@'localhost' = PASSWORD('222');
-- 删除用户
DROP USER 'hwk'@'localhost';
-- 练习
CREATE USER 'hwk'@'localhost' IDENTIFIED BY '123';

CREATE DATABASE testdb;
USE testdb;
CREATE TABLE news(id INT, `name` VARCHAR(32));
GRANT SELECT, INSERT ON testdb.news TO 'hwk'@'localhost';