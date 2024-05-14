import java.util.Scanner;
public class BreakExercise02 {

	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);
		// for (int k = 1;k<=3;k++ ) {
		// 	System.out.println("enter your name");
		// 	String name = my_scanner.next();
		// 	System.out.println("enter your password");
		// 	int password = (int)(my_scanner.nextInt());
		// 	if (name == "dz" && password == 666) {//字符串判等时要注意
		// 		System.out.println("登录成功");
		// 		break;
		// 	}else{
		// 		System.out.println("输入有误请重新输入" + "你还有" + (3-k) + "次输入机会");
		// 	}
		// }
		///////////////////////////////////////////////////////////////////////////////////////////
		//思路分析
		// 1.定义k来记录循环次数
		// 2.定义 String name和password变量
		// 3.用equals判断字符串内容是否一样
		for (int k = 1;k<=3;k++ ) {
			System.out.println("enter your name");
			String name = my_scanner.next();
			System.out.println("enter your password");
			String password = my_scanner.next( );
			if ("dz".equals(name) && "666".equals(password)) {//字符串的内容之间的比较要用equals,一般将常量值放前面，不然可能会出现空指针
				System.out.println("登录成功");
				break;
			}else{
				System.out.println("输入有误请重新输入" + "你还有" + (3-k) + "次输入机会");
			}
		}
	}
}
