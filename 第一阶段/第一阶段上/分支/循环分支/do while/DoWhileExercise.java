public class DoWhileExercise{

	public static void main(String[] args) {
		System.out.println("��һ��:");
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while (i<=100);


		System.out.println("\n�ڶ���");
		int i2 = 1;
		int receive = 0;
		do {
			receive += i2;
			
			System.out.println(receive);
			i2++;
		}while (i2<=100);


		System.out.println("\n������");
		//˼·����
		//1.����һ�����������ı�����������5�ͱ�3����
		//2.�����һ��ѭ���У��ж�ͨ���������һ������ͳ�Ƶı���+1
		int q = 1;
		int flag = 0;
		do {
			if (q % 5.0 == 0 && q % 3.0 != 0){
				flag += 1;
				System.out.println(q);
			}
			q++;
		}while (q<=200);
		System.out.println(flag);
	}
}