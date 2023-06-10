SELECT math FROM student;

-- 对数学成绩排序后输出[升序]。
SELECT * FROM student ORDER BY math DESC;
-- 对总分按从高到低的顺序输出
SELECT `name`, (chinese + english + math) AS total_score FROM student ORDER BY total_score DESC; 
-- 对姓李的学生成绩排序输出(升序)
SELECT `name`, (chinese + english + math) AS total_score FROM student WHERE `name` LIKE '韩%' ORDER BY total_score;

