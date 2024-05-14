public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		//注意一真大师
		int result = a > b ? a++ : b--;// 注意前加加后加加的本质，a++，先字母是处理！（判断，赋值），然后a + 1
		System.out.println("result=" + result);

	}
}