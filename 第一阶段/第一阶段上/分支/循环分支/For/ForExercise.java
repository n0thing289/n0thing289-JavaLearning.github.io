import java.util.Scanner;
public class ForExercise {

	public static void main(String[] args) {
		//思路分析
		//1.定义一个内容为9的整数变量
		//2.让这个变量不断去乘以1-x的整数，得到9的倍数
		//3.判断最后9的倍数结果的大小，令他不能超过100
		Scanner my_scanner = new Scanner(System.in);
		//提示用户输入
		System.out.println("输入左区间");
		int start = my_scanner.nextInt();
		System.out.println("输入右区间");
		int fina = my_scanner.nextInt();

		int nine = 9;
		int flag = 0;
		int sum = 0;
		//开始值
		
		int i = start;
		//某一结果值
		int receipt = 0;
		while (true) {
			receipt = nine * i;
			if (receipt <= fina) {
				
				flag += 1;
				sum += receipt;
				
				System.out.println(receipt);
				receipt = receipt;

			}
			else {
				
				System.out.println("统计个数：" + flag);
				System.out.println("总和：" + sum);
				break;
				}
			i++;
			}

		System.out.println(receipt);
		
		// int receipt = 0;
		// for (int receipt=0;receipt < 101;++receipt) {
		// 		// receipt = nine * i;
		// 		System.out.println(receipt);
		// 		}
		}			
}