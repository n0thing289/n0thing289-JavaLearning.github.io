/*

 */
public class ArithmeticOperator {

	public static void main(String[] args) {
		//使用
		System.out.println(10 / 4);//从数学来看是2.5，java中是2（因为整型）
		System.out.println(10.0 / 4);//java 2.5
		double d1 = 10/4;// 10/4在运算中转成操作数中精度最高的int，所以是2，又因为double所以是2.0
		System.out.println(d1);

		// %取模 取余          a % b = a + b^2
		// % 的本质 看一个公式 a % b = a - a / b * b
		// 
		// 
		// 
		// 
		System.out.println(10 % 3);//
		System.out.println(-10 % 3);//
		System.out.println(10 % -3);//
		System.out.println(-10 % -3);//


		//++的使用
		//
		int i = 10;
		i++;// 自增 等价于 i = i + 1 //11
		++i;//自增 等价于 i = i + 1 //12
		System.out.println("i=" + i);//12


		/*
		作为表达式使用
		前++：++i先自增后赋值
		后++：i++先赋值后自增
		 */
		int j = 8;
		int k = ++j;//等价于 j=j+1然后 k=j
		System.out.println("k=" + k + "j=" + j);//k=9 j=9

		int a = 8;
		int b = a++;//等价于b=a然后a=a+1
		System.out.println("a=" + a + "b=" + b);


	}
}