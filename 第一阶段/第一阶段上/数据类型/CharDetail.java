public class CharDetail {
	public static void main(String[] args) {
		
		//��java�У�char�ı�����һ�������������ʱ����unicode���Ӧ���ַ�
		//Ҫ���ĳ���ַ���Ӧ��unicode���֣������ã�int��ǿ�ư�char����ת����������
		char c1 = 97;
		System.out.println(c1);//a

		char c2 = 'a';//��� a �ַ�����Ӧ������
		System.out.println((int)c2);

		char c3 = '��';
		System.out.println((int)c3);//38889

		char c4 = 38889;
		System.out.println(c4);//��


		//char�����ǿ��Խ������㣬�൱��һ����������Ϊ��Щ�������ж�Ӧ��unicode��ֵ
		System.out.println('a' + 10);//107
		//Ҳ����˵����������charʱ�������֣�����������������ҵ���Ӧ�ı����ַ��������
		//  ����ʱ�����Ȱ�'a'ת����Ӧ����ֵ�������㣬������������������ֵ���ҵ���Ӧ�ı����ַ��������

		//С����
		char c5 = 'b' + 1;//99->c
		System.out.println((int)c5);//99
		System.out.println(c5);//c
		//�������п������Ϊ������ʱ�Ὣ''�Ķ���ת����ֵ��������õ����յ���ֵ��������
		//��ʱ�������char�ͱ��������յ���ֵ������ ����������ʱ����������ֵ��Ӧ���ַ�

			
		
			
		


			
		
	}
}