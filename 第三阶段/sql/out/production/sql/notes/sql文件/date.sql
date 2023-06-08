# 演示时间相关的类型
CREATE  TABLE t14 (
	birthday DATE, 
	jobtime DATETIME,-- 记录年月日时分秒
	login_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP); -- 登录时间, 自动更新时间(插入和更新的时候)
	
SELECT * FROM t14;
INSERT INTO t14(birthday, jobtime) VALUES('2022-11-11', '2022-11-11 10:10:10');