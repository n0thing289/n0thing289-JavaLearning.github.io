import java.util.Scanner;
public class ForExercise {

	public static void main(String[] args) {
		//˼·����
		//1.����һ������Ϊ9����������
		//2.�������������ȥ����1-x���������õ�9�ı���
		//3.�ж����9�ı�������Ĵ�С���������ܳ���100
		Scanner my_scanner = new Scanner(System.in);
		//��ʾ�û�����
		System.out.println("����������");
		int start = my_scanner.nextInt();
		System.out.println("����������");
		int fina = my_scanner.nextInt();

		int nine = 9;
		int flag = 0;
		int sum = 0;
		//��ʼֵ
		
		int i = start;
		//ĳһ���ֵ
		int receipt = 0;
		while (true) {
			receipt = nine * i;
			if (receipt <= fina) {
				
				flag += 1;
				sum += receipt;
				
				System.out.println(receipt);
				receipt = receipt;

			}
			else {
				
				System.out.println("ͳ�Ƹ�����" + flag);
				System.out.println("�ܺͣ�" + sum);
				break;
				}
			i++;
			}

		System.out.println(receipt);
		
		// int receipt = 0;
		// for (int receipt=0;receipt < 101;++receipt) {
		// 		// receipt = nine * i;
		// 		System.out.println(receipt);
		// 		}
		}			
}