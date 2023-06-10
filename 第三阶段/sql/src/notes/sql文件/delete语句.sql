SHOW DATABASES;

USE hsp_db02;

SHOW TABLES;

DESC employee; -- show create table employee;

SELECT * FROM employee;
# 删除表中id=1老妖怪的记录
DELETE FROM employee WHERE id=1;
# 删除表的所有记录
DELETE FROM employee; -- 删除表的所有的记录
# delete语句不能删除某一列的值（可以使用update设为null或者''）
UPDATE employee SET job = '' WHERE NAME = '老妖怪';

