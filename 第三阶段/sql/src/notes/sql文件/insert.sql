CREATE TABLE `goods`(id INT, goods_name VARCHAR(10), price DOUBLE);
INSERT INTO goods (id, goods_name, price) VALUES (10, '华为手机', 2000);
INSERT INTO goods (id, goods_name, price) VALUES (20, '苹果手机', 2000);
SELECT * FROM goods;


INSERT INTO employee(id, user_name, birthday, entry_time, job, salary, RESUME, image) VALUES(1, '02国家队', '2002-02-02', '2019-02-02', '美团 外卖', 5000, '唱跳rap篮球', '77');
SELECT * FROM employee;