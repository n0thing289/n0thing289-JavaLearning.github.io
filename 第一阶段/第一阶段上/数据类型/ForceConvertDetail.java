public class ForceConvertDetail {
	public static void main(String[] args) {

		//演示强制类型转换
		//强转符号只针对就近的操作数有效，往往用小括号提升优先级
		//int x = (int)10*3.5 + 6*1.5;//错误1.5默认是double类型也是表达式中精度最高的类型，则自动将表达式结果转为最高精度的double类型。

		int y = (int)(10*3.5 + 6*1.5);//（int）44.0 --》 44
		System.out.println(y);//44



		char c1 = 100;
		int m = 100;
		//char c2 = m;
		char c3 = (char)m;
		System.out.println(c3);
	}
}