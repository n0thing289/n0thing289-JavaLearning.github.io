import java.util.Scanner;
public class Exercise04 {

	public static void main(String[] args) {
		//需求：判断一个整数是否为水仙花数(三位数，其各位上数字立方和为本身)，如155=1*1*1 + 5*5*5 + 3*3*3
		//思路分析
		//定义一个接受整数变量
		//拆解这个整数，用string类型接受数字，然后.next().charAt(0) 1 2这样
		//将每得到的一个个位的数字，单独用变量存起来，然后再将其强制转换
		//对三个变量求立方和，也就是右边的一坨
		//
		Scanner my_scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("enter a int");
			String var = my_scanner.next();
			var_1 = var.charAt(0);
			var_2 = var.charAt(1);
			var_3 = var.charAt(2);
			System.out.println(var_1);
			System.out.println(var_2);
			System.out.println(var_3);
			break;

		}
	}
}