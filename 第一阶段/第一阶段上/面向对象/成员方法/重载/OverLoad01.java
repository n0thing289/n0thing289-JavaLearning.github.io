public class OverLoad01{
	public static void main(String[] args){
		MyCalculator mc = new MyCalculator();
		mc.calculate(1,2);
	}
}


class MyCalculator{
	//��ôƥ�䣿
	//��ƥ������������
	//��ƥ������б��е�˳�������
	public int calculate(int n1, int n2){
		System.out.println("public int calculate(int n1, int n2)������");
		return n1 + n2;
	}


	//�����Ƿ񹹳�����----������--��Ϊ�������Ͳ��ǹ������صĳ������
	// public void calculate(int n1, int n2){
	// 	return n1 + n2;
	// }


	//�����Ƿ񹹳�����----������--��Ϊ�ββ��ǹ������صĳ������
	// public int calculate(int a1, int a2){
	// 	return a1 + a2;
	// }


	public double calculate(int n1, double n2){
		System.out.println("public double calculate(int n1, double n2)������");
		return n1 + n2;
	}


	public double calculate(double n2, int n1){
		System.out.println("public double calculate(double n2, int n1)������");
		return n2 + n1;
	}

	
	public int calculate(int n1, int n2, int n3){
		System.out.println("public int calculate(int n1, int n2, int n3)������");
		return n1 + n2 + n3;
	}
}