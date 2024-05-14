public class TernaryOperatorDetail {
	public static void main(String[] args) {
		//表达式1和表达式2要为可以赋给接收2变量的类型（或可以自动转换，或强转）
		//因为本质上就是赋值，就要考虑范围或者类型
		int a = 3;
		int b = 8;
		int c = a > b ? (int)1.1 : (int)3.4;
		double d = a > b ? a : b + 3;


	}
}