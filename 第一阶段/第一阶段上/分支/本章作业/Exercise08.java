public class Exercise08 {

	public static void main(String[] args) {
		//˼·����
		//1.�������ʽ�ӿ��Կ�������ĳ�����е�ǰn���
		//2.ͨ�ʽΪ n(-1)**(n-1)
		//3.����һ������n��������
		double sum = 0.0;
		for(int n = 1;n<=100;n++){
			double an = (Math.pow((-1), (n-1))) * n;//n*(-1)**(n-1);
			System.out.println(1 / an);
			sum += 1 / an;
			System.out.println("\t sum=" + sum);

		}
		System.out.println("�����" +sum);
	}
}