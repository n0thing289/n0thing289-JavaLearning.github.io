-- current_date()当前日期
SELECT CURRENT_DATE() FROM DUAL;
-- current_time()当前时间
SELECT CURRENT_TIME() FROM DUAL;
-- current_timestamp()当前时间戳
SELECT CURRENT_TIMESTAMP() FROM DUAL;


CREATE TABLE mes(id INT, content VARCHAR(30), send_time DATETIME);

INSERT INTO mes VALUES(1, '北京时间', CURRENT_TIMESTAMP());

SELECT * FROM mes;


-- 第二组api
INSERT INTO mes VALUES(2, '上海新闻', NOW());

INSERT INTO mes VALUES(5, 'xx新闻', NOW());

SELECT * FROM mes;

SELECT NOW() FROM DUAL;


-- 上应用实例

-- 显示所有留言信息，发布日期只显示 日期，不用显示时间
SELECT id, content, DATE(send_time) FROM mes;
-- 请查询在10分钟内发布的帖子
SELECT * FROM mes WHERE DATE_ADD(send_time, INTERVAL 10 MINUTE) >= NOW();
SELECT * FROM mes WHERE DATE_SUB(NOW(), INTERVAL 10 MINUTE) <= send_time;
-- 请在mysql 的sql语句中求出 2011-11-11 和 1990-1-1 相差多少天
SELECT DATEDIFF(DATE('2011-11-11'), DATE('1990-1-1')) FROM DUAL;
-- 请用mysql 的sql语句求出你活了多少天?[练习]
SELECT DATEDIFF(DATE(CURRENT_TIME()), DATE('2003-1-3')) FROM DUAL;
-- 如果你能活80岁，求出你还能活多少天.[练习]
SELECT DATEDIFF(DATE_ADD(DATE('1986-11-11'), INTERVAL 80 YEAR) ,CURRENT_DATE()) FROM DUAL;

-- 第三组api
SELECT TIMEDIFF('10:11:11', '6:10:10') FROM DUAL;

SELECT MONTH(NOW()) FROM DUAL;
SELECT YEAR('1986-1-1') FROM DUAL;

-- 返回1970-1-1到现在的秒数
SELECT UNIX_TIMESTAMP()/(24*3600*365) FROM DUAL; 
-- '%Y-%m-%d'格式是规定好年月日的
-- 意义在于可以把数字表示一个时间,通过from_unixtime()
SELECT FROM_UNIXTIME(1618483484, '%Y-%m-%d') FROM DUAL; 
SELECT FROM_UNIXTIME(1618483484, '%Y-%m-%d %H:%i:%s') FROM DUAL; 





