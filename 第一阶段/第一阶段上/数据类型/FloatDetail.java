public class FloatDetail {
	public static void main(String[] args) {
		// float 4���ֽ�
		// double 8���ֽ�

		// java �����ͳ���Ĭ��Ϊdouble�ͣ�����float�ͳ�������Ҫ����� f ���� F
		// float num1 = 1.1  // �Բ��ԣ� ��
		float num2 = 1.1f;  // ��
		double num3 = 1.1;  // ��
		double num4 = 1.1f;  // �ԣ�Сת���ǿ��Ե�

		//ʮ��������ʽ
		double num5 =  .123;  // �ȼ�0.123

		//��ѧ��������ʽ
		System.out.println(5.12e2);
		System.out.println(5.12e-2);

		//���ȶԱ�
		double num9 = 2.1234567891;
		float num10 = 2.1234567891f;
		System.out.println(num9);
		System.out.println(num10);

		//�����������С��ʱ����֪��С������滹�ж������֣����������Ծ��ȵķ�ʽ���
		double num11 = 2.7;
		double num12 = 8.1 / 3;//�������Ϊ8.1 = 8.10000000000,��Ϊ8.1�����ǽ���ֵ���������������1���滹��ʲô
		System.out.println(num11);//2.7
		System.out.println(num12);//�ӽ�2.7��һ��С����������2.7
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�������ж�ʱ ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		if (num11 == num12) {
			System.out.println("���");

		}
        //��ȷ��д��
        if (Math.abs(num11 - num12) < 0.0000000001) {
        	System.out.println("��ֵ�ǳ�С���Ѿ��ﵽ�����涨�ľ������ˣ���Ϊ���");
        }
        // ����ͨ�� java API ���� ��һ����Ƶ��
        System.out.println(Math.abs(num11 - num12));

        //ϸ�ڣ������ֱ�Ӹ�ֵ�õ���С���ǿ����ж���ȵģ�������ͨ�������õ���С��


	}
}