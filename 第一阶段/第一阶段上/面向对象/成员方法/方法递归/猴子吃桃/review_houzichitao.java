import java.util.Scanner;
public class review_houzichitao{
	public static void main(String[] args){
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("enter a day number");
		int day = my_scanner.nextInt();

		Houzi my_houzi = new Houzi();

		int peach_num = my_houzi.peach(day);
		System.out.println("peach_num= " + peach_num);
	}
}


class Houzi{
	public int peach(int n){
		// ˼·���������Ϻ���˼·���������Ƶķ���ȥ�Ƴ�987���Ӧ�����ӣ�
		// ���ҵõ�һ��ǰ������������Ŀ�Ĺ�ϵʽ
		// ��ʮ��    1�����ӣ�1= ��/2 - 1��
		// �ھ���    ��1 + 1��* 2 = 4 ��4= ��/2 - 1��
		// �ڰ���    ��4 + 1��* 2 = 10
		// .
		// .
		// .
		// ���Եõ�������һ���������+1��*2 = ǰһ���������
		if(n>=1 && n <= 10){
			if(n == 10){
				return 1;
			}
			else{
				return (peach(n+1)+1)*2;
			}
		}
		else{
			System.out.println("error! please try again!!!");
			return -1;
		}
	}
}