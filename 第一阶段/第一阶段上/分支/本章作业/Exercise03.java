import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		//���깫ʽ
		Scanner my_scanner = new Scanner(System.in);
		char flag = 'a';
		do{
			System.out.println("�������");
			int year = my_scanner.nextInt();
			if ((year % 4.0 == 0 && year % 100.0 != 0) || (year % 400.0 == 0)) {
				System.out.println("ͬʱ�ж���������ͨ��������һ������");
			}else{
				System.out.println("�ⲻ������");
			}
			System.out.println("continue? quit=q");
			flag = my_scanner.next().charAt(0);
		}while(flag != 'q');
	}
}