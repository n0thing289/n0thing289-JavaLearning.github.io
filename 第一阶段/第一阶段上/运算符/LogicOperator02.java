//��ʾ| ||ʹ��
public class LogicOperator02 {

	public static void main(String[] args) {
		//|| ��|������ʾ
		//������������ֻҪһ��Ϊ�棬��·�����
		//������������ֻҪһ��Ϊ�棬�߼���Ҳ����
		int age = 50;
		if(age > 20 && age < 30) { 
			System.out.println("ok100");
		}
		// | ��ʾ
		if(age > 20 & age < 30) { 
			System.out.println("ok100");
		}

		//��������
		//��·�򣬵�һ��Ϊ�棬��ڶ������������жϣ����Ϊtrue��
		//�߼���ȫҪ�ж�һ��
		int a = 4;
		int b = 9;

		if(a > 1 || ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println(" a= " + a + " b= " + b);//a4 b9

		if(a > 1 | ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("");
		System.out.println(" a= " + a + " b= " + b);//a4 b10
	}

}