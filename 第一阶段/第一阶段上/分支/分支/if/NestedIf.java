import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);

		System.out.println("enter the gamer`s score:");
		double score = my_scanner.nextDouble();
		
		//System.out.println("enter the gamer`s gender:")
		//char gender = my_scanner.next().charAt(0);

		if (score > 8.0) {
			System.out.println("��ϲ��������");
			System.out.println("enter the gamer`s gender:");
		    char gender = my_scanner.next().charAt(0);//charAt() �ַ���ת�ַ�
			if(gender == '��') {
				System.out.println("����������");
			}
			else if (gender == 'Ů') {
				System.out.println("����Ů����");
			}
			else {
				System.out.println("�Ա�����");
			}
		}
		else {
			System.out.println("I`m afraid to say you didn`t join juesai");
		}

	}
}