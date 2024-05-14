import java.util.Scanner;
public class DoWhileExercise02{

	public static void main(String[] args) {
		//
		//化繁为简
		//1.不停的问还钱吗
		//2.使用char answer接收定义一个scanner
		Scanner my_scanner = new Scanner(System.in);
		//char flag = 'n';
		char answer = ' ';
		do {
			System.out.println("老韩问：还钱吗？(yes/no)");
			answer = my_scanner.next().charAt(0);
			//flag = answer;
		}while (answer == 'n');
	}
}