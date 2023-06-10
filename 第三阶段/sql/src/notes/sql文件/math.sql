-- 演示数学相关函数

-- abs(num)  绝对值
SELECT ABS(-10) FROM DUAL;
-- bin(decimal_number)  十进制转二进制
SELECT BIN(10) FROM DUAL;
-- ceiling(number2)  向上取整, 得到比num2大的最小整数
SELECT CEILING(-1.1) FROM DUAL;
-- conv(number2, from_base,to_base)  进制转换
SELECT CONV(8, 10, 2) FROM DUAL;  -- 8十进制的8,要转为2进制的8并输出
SELECT CONV(16, 16, 10) FROM DUAL;
-- floor(number2)  向下取整, 得到比num2小的最大整数
SELECT FLOOR(-1.1) FROM DUAL;
-- format(number, decimal_places)  保留小数位数
SELECT FORMAT(78.12345678, 2) FROM DUAL;
SELECT FORMAT(AVG(sal), 2), MAX(sal), deptno FROM emp GROUP BY deptno;
-- hex(deciamlnumber)  转十六进制
-- least(number, number2 [...]) 求最小值
SELECT LEAST(0,1,-10,4) FROM DUAL;
-- mod(numerator, denominator)  求余
SELECT MOD(10, 3) FROM DUAL;
-- rand([seed])  rand([seed])  返回随机数其范围为 0 <= v <= 1.0
SELECT RAND(2) FROM DUAL; -- 如果给数字, 那么是固定的,不同种子随机数的值不一样
 