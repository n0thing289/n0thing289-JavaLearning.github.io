public class ArithmeticOperatorExercise01 {

	public static void main(String[] args) {
		//������1
		// int i = 1;
		// i = i++;//���򣺣�1��ʹ����ʱ����temp=i Ȼ��i=i+1 ���i=temp
		// System.out.println(i);//2 ����1

		// //������2
		// int i = 1;
		// i = ++i;//������12���෴
		// System.out.println(i);//2 ����2
		// System.out.println("");

		//++ --
	
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.println("i= " + i);//10
		System.out.println("i2 " + i2);//20

		i = --i2;
		System.out.println("i= " + i);//19
		System.out.println("i2= " + i2);//19
		
	
	}
}