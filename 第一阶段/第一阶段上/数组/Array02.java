import java.util.Scanner;
public class Array02 {

	public static void main(String[] args) {
		//����һ��double���� ��СΪ5
		//��һ�ֶ�̬���䷽ʽ
		//double[] scores = new double[5];
		//�ڶ��ֶ�̬���䷽ʽ
		double scores[];
		scores = new double[5];
		Scanner my_scanner = new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			System.out.println("�������"+(i+1)+"��Ԫ�ص�ֵ=");
			//������ֵΪi�����Ԫ��
			//
			scores[i] = my_scanner.nextDouble();
		}
		
		System.out.println("==�����Ԫ��/ֵ���������");
		for(int i=0;i<scores.length;i++){
			System.out.println("scores:" + scores[i]);
		}
	}
}