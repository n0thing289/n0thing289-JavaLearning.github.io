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
		
		
		//�ڶ���
		System.out.println("\n" + "\n" + "[2]enter your scopes:");
		double scopes = input.nextDouble();// ����֮ǰ�������ˣ����ǵ�switchϸ�ڶ���
		//byte short int char enum String
		//�μ��Զ�ת��������Ҫ����˭�ǣ�����Ҫ���ж��Լ������������ܲ��ܸ����Ǹ�����
		if (scopes < 100 && scopes >= 0) {
			switch ((int)(scopes/60)) {
				case (1)://case ����ֻ��д������true���ǳ�����Ҳ�޷�ת��int
					System.out.println("����");
					break;

				case (0):
					System.out.println("������");
					break;

			}
		}
		else {
			System.out.println("��������");
		}
		



		//������
		//	����ʦ����-��͸
		System.out.println("\n" + "�����ǵ�����(��͸����)������һ���·ݣ�");
		int mouth = input.nextInt();
		switch (mouth) {
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;


			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;


			case 9:	
			case 10:
			case 11:
				System.out.println("�＾");
				break;


			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
		}


		System.out.println("\n" + "����Ҳ�ǵ��������õڶ���˼·����3�������룺");
		int month = input.nextInt();// ��������int Ȼ����3.0
		if (month >= 1 && month <= 12) {
			switch ((int)(month/3.0)) {
				case 1:
					System.out.println("����");
					break;
				case 2:
					System.out.println("�ļ�");
					break;
				case 3:
					System.out.println("�＾");
					break;
				default:
					System.out.println("����");
			}
		}
		else {
			System.out.println("������������������");
		}
		
	}

}
