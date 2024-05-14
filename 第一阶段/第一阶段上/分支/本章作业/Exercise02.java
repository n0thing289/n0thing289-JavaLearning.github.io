import java.util.Scanner;
public class Exercise02 {

	public static void main(String[] args) {
		//实例化Scanner
		//定义一个整数变量
		//while循环和if判断范围
		//获取用户输入来推出
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		char flag = 'a';
		while(flag != 'q'){
			int var = my_scanner.nextInt();
			int int_var = (0-var);
			if(int_var < 0){
				System.out.println("大于0");
			}
			else if(int_var > 0){
				System.out.println("小于0");
			}
			else{
				System.out.println("0");
			}
			System.out.println("continue？quit=q");
			flag = my_scanner.next().charAt(0);
		}
	}
}