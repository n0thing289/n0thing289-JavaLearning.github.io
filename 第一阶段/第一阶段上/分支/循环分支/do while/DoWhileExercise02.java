import java.util.Scanner;
public class DoWhileExercise02{

	public static void main(String[] args) {
		//
		//����Ϊ��
		//1.��ͣ���ʻ�Ǯ��
		//2.ʹ��char answer���ն���һ��scanner
		Scanner my_scanner = new Scanner(System.in);
		//char flag = 'n';
		char answer = ' ';
		do {
			System.out.println("�Ϻ��ʣ���Ǯ��(yes/no)");
			answer = my_scanner.next().charAt(0);
			//flag = answer;
		}while (answer == 'n');
	}
}