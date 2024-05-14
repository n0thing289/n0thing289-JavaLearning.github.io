import java.util.Scanner;
public class Exercise04 {

	public static void main(String[] args) {
		//需求：判断一个整数是否为水仙花数(三位数，其各位上数字立方和为本身)，如153=1*1*1 + 5*5*5 + 3*3*3
		//思路分析
		//定义一个接受整数变量
		//拆解这个整数，用string类型接受数字，然后.next().charAt(0) 1 2这样
		//将每得到的一个个位的数字，单独用变量存起来，然后再将其强制转换
		//对三个变量求立方和，也就是右边的一坨
		//
		//老师的思路，如果是数字，通过算法得到百位，十位，个位呢？
		//n = 153
		//n的百位 = (int)(n / 100)
		//n的十位 = (int)((n % 100) / 10)
		//n的个位 = (n % 10)
		Scanner my_scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("enter a int");
			String var = my_scanner.next();//"153"
			int var_1 = ((int)(var.charAt(0)) - (int)'0');//1
			int var_2 = ((int)(var.charAt(1)) - (int)'0');//5
			int var_3 = ((int)(var.charAt(2)) - (int)'0');//3
			int var_4 = (var_1*100) + (var_2*10) + (var_3);
			System.out.println(var_1);
			System.out.println(var_2);
			System.out.println(var_3);
			double flag_num = ((var_1*var_1*var_1) + (var_2*var_2*var_2) + (var_3*var_3*var_3));
			System.out.println(flag_num);
			if(var_4 == flag_num){
				System.out.println("是水仙花数");
			}
			else{
				System.out.println("不是水仙花数");
			}
			System.out.println("continue? quit=q");
			char flag = my_scanner.next().charAt(0);
			if(flag == 'q'){
				break;
			}
			

		}
	}
}