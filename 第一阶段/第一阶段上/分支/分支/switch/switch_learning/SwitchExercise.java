//package switch_learning;
import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// System.out.println("enter(a to e):");
		// char small_char = input.next().charAt(0);
		
		// switch (small_char) {
		// 	case 'a':
		// 		System.out.println('A');
		// 		break;
		// 	case 'b':
		// 		System.out.println('B');
		// 		break;
		// 	case 'c':
		// 		System.out.println('C');
		// 		break;
		// 	case 'd':
		// 		System.out.println('D');
		// 		break;
		// 	case 'e':
		// 		System.out.println("E");
		// 		break;
		// 	default:
		// 		System.out.println("other");

			
		// }
		
		
		//第二题
		System.out.println("\n" + "\n" + "[2]enter your scopes:");
		double scopes = input.nextDouble();// 这里之前犯错误了，还记得switch细节二吗
		//byte short int char enum String
		//牢记自动转换，当你要付给谁是，就是要先判断自己的数据类型能不能赋给那个变量
		if (scopes < 100 && scopes >= 0) {
			switch ((int)(scopes/60)) {
				case (1)://case （）只能写常量，true不是常量，也无法转成int
					System.out.println("及格");
					break;

				case (0):
					System.out.println("不及格");
					break;

			}
		}
		else {
			System.out.println("输入有误");
		}
		



		//第三题
		//	用老师讲的-穿透
		System.out.println("\n" + "现在是第三题(穿透做法)请输入一个月份：");
		int mouth = input.nextInt();
		switch (mouth) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;


			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;


			case 9:	
			case 10:
			case 11:
				System.out.println("秋季");
				break;


			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
		}


		System.out.println("\n" + "现在也是第三题沿用第二题思路（除3）请输入：");
		int month = input.nextInt();// 还可以用int 然后用3.0
		if (month >= 1 && month <= 12) {
			switch ((int)(month/3.0)) {
				case 1:
					System.out.println("春季");
					break;
				case 2:
					System.out.println("夏季");
					break;
				case 3:
					System.out.println("秋季");
					break;
				default:
					System.out.println("冬季");
			}
		}
		else {
			System.out.println("输入有误请重新输入");
		}
		
	}

}
