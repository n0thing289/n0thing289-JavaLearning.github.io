import java.util.Scanner;
public class BreakExercise02 {

	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);
		// for (int k = 1;k<=3;k++ ) {
		// 	System.out.println("enter your name");
		// 	String name = my_scanner.next();
		// 	System.out.println("enter your password");
		// 	int password = (int)(my_scanner.nextInt());
		// 	if (name == "dz" && password == 666) {//�ַ����е�ʱҪע��
		// 		System.out.println("��¼�ɹ�");
		// 		break;
		// 	}else{
		// 		System.out.println("������������������" + "�㻹��" + (3-k) + "���������");
		// 	}
		// }
		///////////////////////////////////////////////////////////////////////////////////////////
		//˼·����
		// 1.����k����¼ѭ������
		// 2.���� String name��password����
		// 3.��equals�ж��ַ��������Ƿ�һ��
		for (int k = 1;k<=3;k++ ) {
			System.out.println("enter your name");
			String name = my_scanner.next();
			System.out.println("enter your password");
			String password = my_scanner.next( );
			if ("dz".equals(name) && "666".equals(password)) {//�ַ���������֮��ıȽ�Ҫ��equals,һ�㽫����ֵ��ǰ�棬��Ȼ���ܻ���ֿ�ָ��
				System.out.println("��¼�ɹ�");
				break;
			}else{
				System.out.println("������������������" + "�㻹��" + (3-k) + "���������");
			}
		}
	}
}
