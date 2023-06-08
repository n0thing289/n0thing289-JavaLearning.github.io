# 查看,删除数据库
SHOW DATABASES
# 查看创建的hsp_db01
SHOW CREATE DATABASE hsp_db01

# 老韩说明 在创建数据库的时候,为了规避关键字,可以使用反引号
# SHOW CREATE DATABASE `create`;
DROP DATABASE hsp_db01;