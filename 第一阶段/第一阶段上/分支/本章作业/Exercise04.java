import java.util.Scanner;
public class Exercise04 {

	public static void main(String[] args) {
		//�����ж�һ�������Ƿ�Ϊˮ�ɻ���(��λ�������λ������������Ϊ����)����153=1*1*1 + 5*5*5 + 3*3*3
		//˼·����
		//����һ��������������
		//��������������string���ͽ������֣�Ȼ��.next().charAt(0) 1 2����
		//��ÿ�õ���һ����λ�����֣������ñ�����������Ȼ���ٽ���ǿ��ת��
		//�����������������ͣ�Ҳ�����ұߵ�һ��
		//
		//��ʦ��˼·����������֣�ͨ���㷨�õ���λ��ʮλ����λ�أ�
		//n = 153
		//n�İ�λ = (int)(n / 100)
		//n��ʮλ = (int)((n % 100) / 10)
		//n�ĸ�λ = (n % 10)
		Scanner my_scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("enter a int");
			String var = my_scanner.next();//"153"
			int var_1 = ((int)(var.charAt(0)) - (int)'0');//1
			int var_2 = ((int)(var.charAt(1)) - (int)'0');//5
			int var_3 = ((int)(var.charAt(2)) - (int)'0');//3
			int var_4 = (var_1*100) + (var_2*10) + (var_3);
			System.out.println(var_1);
			System.out.println(var_2);
			System.out.println(var_3);
			double flag_num = ((var_1*var_1*var_1) + (var_2*var_2*var_2) + (var_3*var_3*var_3));
			System.out.println(flag_num);
			if(var_4 == flag_num){
				System.out.println("��ˮ�ɻ���");
			}
			else{
				System.out.println("����ˮ�ɻ���");
			}
			System.out.println("continue? quit=q");
			char flag = my_scanner.next().charAt(0);
			if(flag == 'q'){
				break;
			}
			

		}
	}
}