-- 演示字符串相关函数的使用
-- charset(str)  返回字串字符集
SELECT CHARSET(ename) FROM emp;
-- concat(string1 [string2, string...]) 连接字串, 将多个列拼接成一列
SELECT CONCAT(ename, ' job is ', job) FROM emp;
-- instr(string1, substring1)  返回substring在string中出现的位置, 没有返回0
SELECT INSTR('hanshunping', 'ping') FROM DUAL;  -- 1. 从1开始计数, 2. dual是默认表用于测试
-- ucase(string2)  转换成大写
SELECT UCASE(ename) FROM emp;
-- lcase(string2)  转换成小写
SELECT LCASE(ename) FROM emp;
-- left(string2, length1)  从string2的左边起取length个字符
SELECT LEFT(ename, 2) FROM emp;  -- right(string2, length1)
-- length(string2)  string2长度(按照编码字节)
SELECT LENGTH(ename) FROM emp;
-- replace(str, search_str, replace_str)  在str中用replace_str替换search_str
SELECT ename, REPLACE(job, 'MANAGER', '经理') FROM emp;
-- strcmp(string1, string2)  逐字符比较两串大小
SELECT STRCMP('hsp', 'asp') FROM DUAL;
-- substring(str, position1 , [length])  从str的position开始(从1开始计算), 第三个参数不写默认取到末尾
SELECT SUBSTRING(ename, 1,2) FROM emp;
-- ltrim(string2) rtrim(string2) trim(左右都去)   去除前端空格或后端空格
SELECT LTRIM('     韩顺平教育') FROM DUAL;

-- 练习一首字母小写的方式显示所有的员工emp表的姓名
-- 方式一
SELECT CONCAT(SUBSTRING(LCASE(ename),1,1), SUBSTRING(ename, 2)) FROM emp;
-- 方式二
LEFT



