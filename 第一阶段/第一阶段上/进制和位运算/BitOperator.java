public class BitOperator {

	public static void main(String[] args) {

		//����ʦ���Ƶ�����
		//1. �ȵõ� 2�Ĳ���-�� 2��Դ�� 00000000 00000000 00000000 00000010
		//    2�Ĳ���00000000 00000000 00000000 00000010
		//2. �õ� 3��Դ��-�� 3��Դ�� 00000000 00000000 00000000 00000011
		//    3�Ĳ��� 00000000 00000000 00000000 00000011
		//3. ��λ& 00000000 00000000 00000000 00000010 & �����Ĳ���
		//    ���ڵ�һ������λ��0��Ҳ�����������������һ�������Դ��Ҳ��00000000 00000000 00000000 00000010
		//�������2
		System.out.println(2&3);
		System.out.println(~-2);
		//1. �ȵõ�-2��Դ�� 10000000 00000000 00000000 00000010
		//2. �õ�-2�Ĳ���--��Ҫ�ȵõ����ķ��룬
		//		-2���� 11111111 11111111 11111111 11111101
		//		-2���� 11111111 11111111 11111111 11111110
		//      ȡ������ 00000000 00000000 00000000 00000001 ����Ĳ���
		//      ���ڷ���λ��0����������λ��һ��ԭ����1
		System.out.println(~2);

		System.out.println(2|3);
		//
		System.out.println(2^3);


		//Exercise
		System.out.println("��������ϰ:");

		System.out.println(2|3);//my anwser is 3
		System.out.println(2^3);//my anwser is 1
		System.out.println(~2);//my anwser is -3
		System.out.println(2&3);//my anwser is 2
		System.out.println(2|3);//my anwser is 3
		System.out.println(~-5);//my anwser is 4
		System.out.println(13&7);//my anwser is 5
		System.out.println(5|4);//my anwser is 5
		System.out.println(-3^3);//my anwser is -3. False ��һ��һ�����ˣ�Ӧ��-2
		//����ķ�����Ǹ�����ԭ��

		

	}
}