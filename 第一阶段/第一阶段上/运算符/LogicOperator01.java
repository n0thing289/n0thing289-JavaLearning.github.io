public class LogicOperator01 {

	public static void main(String[] args) {
		//&& ��&������ʾ
		int age = 50;
		if(age > 20 && age < 90) { //90��30
			System.out.println("ok100");
		}
		//&��ʾ
		if(age > 20 & age < 90) { //90��40
			System.out.println("ok100");
		}

		//����
		int a = 4;
		int b = 9;
		//����&&��·����ԣ�ǰ��Ϊ�٣���������������ж�
		//����&�߼�����ԣ�ǰ��Ϊ�٣������������Ȼ�ж�

		if(a < 1 && ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println(" a= " + a + " b= " + b);

		if(a < 1 & ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("");
		System.out.println(" a= " + a + " b= " + b);
	}
}