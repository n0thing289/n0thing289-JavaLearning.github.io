
//演示for的使用细节
//
public class ForDetail {

	public static void main(String[] args) {
		int i = 1;  //如果把i放for里面，则这是一个局部变量，作用域小
		for (;i <= 10;) {
			System.out.println("666" + i);
			++i;// 这个也可以拿出来
		}

		System.out.println("i = " + i);

		for( ; ; ) {
			System.out.println("这次一个死循环")
		}
	}
}