/*

 */
public class ArithmeticOperator {

	public static void main(String[] args) {
		//ʹ��
		System.out.println(10 / 4);//����ѧ������2.5��java����2����Ϊ���ͣ�
		System.out.println(10.0 / 4);//java 2.5
		double d1 = 10/4;// 10/4��������ת�ɲ������о�����ߵ�int��������2������Ϊdouble������2.0
		System.out.println(d1);

		// %ȡģ ȡ��          a % b = a + b^2
		// % �ı��� ��һ����ʽ a % b = a - a / b * b
		// 
		// 
		// 
		// 
		System.out.println(10 % 3);//
		System.out.println(-10 % 3);//
		System.out.println(10 % -3);//
		System.out.println(-10 % -3);//


		//++��ʹ��
		//
		int i = 10;
		i++;// ���� �ȼ��� i = i + 1 //11
		++i;//���� �ȼ��� i = i + 1 //12
		System.out.println("i=" + i);//12


		/*
		��Ϊ���ʽʹ��
		ǰ++��++i��������ֵ
		��++��i++�ȸ�ֵ������
		 */
		int j = 8;
		int k = ++j;//�ȼ��� j=j+1Ȼ�� k=j
		System.out.println("k=" + k + "j=" + j);//k=9 j=9

		int a = 8;
		int b = a++;//�ȼ���b=aȻ��a=a+1
		System.out.println("a=" + a + "b=" + b);


	}
}