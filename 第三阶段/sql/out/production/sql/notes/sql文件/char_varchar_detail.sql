#演示字符串
# char(4) 和 varchar(4) 这个4表示的是4个字符(不区分汉字还是字母),而不是字节
CREATE TABLE t11(`name` CHAR(4));
INSERT INTO t11 VALUES('abcd');

CREATE TABLE t12(`name` VARCHAR(4));
INSERT INTO t12 VALUES('韩顺平a');
# 因此占用多少字节要更据编码来确定


#如果varchar 不够用,可以使用mediumtext 或者longtext
CREATE TABLE t13(content TEXT, content2 MEDIUMTEXT, content3 LONGTEXT);
INSERT INTO t13 VALUES('韩顺平教育', '韩顺平教育100', '韩顺平教育1..');
SELECT * FROM t13;
-- 中文符号占3位，数字字母占1位 