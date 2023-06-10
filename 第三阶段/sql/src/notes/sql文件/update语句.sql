SHOW DATABASES;

USE hsp_db02;

SHOW TABLES; -- show create employee; == desc employee;

INSERT INTO employee VALUES(2,'小妖怪', '1998-1-1', '2019-1-1', 'ebay', 1000, '练习时长两年半', 88),
				(3, '老妖怪', '100-1-1', '200-1-1', 'ebay', 2000, '联系时长两年半', 99);
# 将所有员工的薪水修改为5000			
UPDATE employee SET salary=5000;
SELECT * FROM employee;

# 将小妖怪的员工薪水修改为3000元
UPDATE employee SET salary=3000 WHERE NAME='小妖怪';
SELECT * FROM employee;

# 将老妖怪的薪水在原有的基础上增加1000元
UPDATE employee SET salary=5000+1000 WHERE NAME='老妖怪'; -- UPDATE employee SET salary=salary+1000, job='test' WHERE NAME='老妖怪';
SELECT * FROM employee;