# 老韩解读
#1. bit（m） 在1-64
#2. 添加数据 范围时按照你给的位数来确定的, m = 8 就代表一个字节
#3. 显示按照二进制显示
CREATE TABLE t05 (num BIT(8));

INSERT INTO t05 VALUES(255);

SELECT * FROM t05;

SELECT * FROM  t05 WHERE num = 1;