import java.util.Scanner;
public class Exercise04 {

	public static void main(String[] args) {
		//�����ж�һ�������Ƿ�Ϊˮ�ɻ���(��λ�������λ������������Ϊ����)����155=1*1*1 + 5*5*5 + 3*3*3
		//˼·����
		//����һ��������������
		//��������������string���ͽ������֣�Ȼ��.next().charAt(0) 1 2����
		//��ÿ�õ���һ����λ�����֣������ñ�����������Ȼ���ٽ���ǿ��ת��
		//�����������������ͣ�Ҳ�����ұߵ�һ��
		//
		Scanner my_scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("enter a int");
			String var = my_scanner.next();
			var_1 = var.charAt(0);
			var_2 = var.charAt(1);
			var_3 = var.charAt(2);
			System.out.println(var_1);
			System.out.println(var_2);
			System.out.println(var_3);
			break;

		}
	}
}