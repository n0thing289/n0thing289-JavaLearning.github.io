-- 统计一个班级共有多少学生?
SELECT COUNT(*) FROM student;
-- 统计数学成绩大于90的学生有多少个?
SELECT COUNT(*) FROM student WHERE math > 90;
-- 统计总分大于250的人数有多少?
SELECT COUNT(*) FROM student WHERE (math + chinese + english) > 250;
-- count(*)和 count(列) 的区别
-- count(*) 返回满足条件的记录的行数
-- count（列） 统计满足条件的某列有多少个记录， 会排除null. 
CREATE TABLE t15(`name` VARCHAR(20));

INSERT INTO t15 VALUES('tom'), ('jack'), ('mary');
INSERT INTO t15 VALUES(NULL);
SELECT * FROM t15;
SELECT COUNT(`name`) FROM t15;


# sum函数, 对某一数值列的所有记录进行求和
-- 统计一个班级数学总成绩?
SELECT SUM(math) FROM student;
-- 统计一个班级语文、英语、学各科的总成绩
SELECT SUM(math), SUM(english), SUM(chinese) FROM student;
-- 统计一个班级语文、英语、数学的成绩总和
SELECT SUM(math, english, chinese) FROM student;
-- 统计一个班级语文成绩平均分
SELECT SUM(chinese)/COUNT(*) FROM student;

# AVG函数,
-- 求一个班级数学平均分?
SELECT AVG(math) FROM student;
-- 求一个班级总分平均分
SELECT AVG(math + english + chinese) FROM student;

# max/min
-- 求班级最高分和最低分 (数值范围在统计中特别有用)
SELECT MAX(math + english + chinese), MIN(math + english + chinese) FROM student;
-- 求班级数学最低分和最高份
SELECT MAX(math), MIN(math) FROM student; 

