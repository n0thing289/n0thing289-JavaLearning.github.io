import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		//闰年公式
		Scanner my_scanner = new Scanner(System.in);
		char flag = 'a';
		do{
			System.out.println("输入年份");
			int year = my_scanner.nextInt();
			if ((year % 4.0 == 0 && year % 100.0 != 0) || (year % 400.0 == 0)) {
				System.out.println("同时判断条件条件通过，这是一个闰年");
			}else{
				System.out.println("这不是闰年");
			}
			System.out.println("continue? quit=q");
			flag = my_scanner.next().charAt(0);
		}while(flag != 'q');
	}
}