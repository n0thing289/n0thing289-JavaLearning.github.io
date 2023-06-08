# char varchar
# 注释的快捷键shift + ctrl + c
-- char(size)
-- 固定长度字符串 最大255字符
-- varchar(size) 0-65535
-- 可变长度字符串 最大65532字节 [utf8编码最大21844字符 1-3个字节用于记录大小]
-- 如果表的编码是utf8 varchar(size) size = (65535 - 3) / 3 = 21844
-- 如果表的编码是gbk VARCHAR(size) size = (65535 - 3) / 2 = 32766
CREATE TABLE t09(`name` CHAR(255));
CREATE TABLE t10(`name` VARCHAR(32766)) CHARACTER SET gbk;
DROP TABLE t10;