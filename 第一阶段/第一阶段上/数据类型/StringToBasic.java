public class StringToBasic {
	public static void main(String[] args) {

		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		//String->��Ӧ�Ļ�����������
		String s5 = "123";
		//��� ʹ�� �����������Ͷ�Ӧ�İ�װ�࣬����Ӧ�������õ�������������
		int num1 = Integer.parseInt(s5);
		float num2 = Float.parseFloat(s5);
		double num3 = Double.parseDouble(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		//boolean bool6 = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);

		System.out.println("==================================");
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(num6);//123
		//System.out.println(bool6);//true
		
		//��ô���ַ���ת��һ���ַ���ֻ�ǰ��ַ�����һ���ַ�ȡ��
		System.out.println(s5.charAt(1));
		
		





	}
}
