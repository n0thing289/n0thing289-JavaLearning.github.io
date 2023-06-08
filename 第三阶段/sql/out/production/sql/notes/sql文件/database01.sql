# 演示数据库的操作
# 创建一个名称为hsp_db01的数据库.[图形化和指令]

#创建数据库指令(没有指定字符集和校验规则, 那么会走默认的创建方式)
CREATE DATABASE hsp_db01;
#删除数据库指令
DROP  DATABASE hsp_db01;
# 创建一个使用utf8的数据库
CREATE DATABASE hsp_db02 CHARACTER SET utf8
# 创建一个使用utf8和校验规则的数据库
CREATE DATABASE hsp_db03 CHARACTER SET utf8 COLLATE utf8_bin

# 
SELECT * FROM t1 WHERE NAME = 'tom';
