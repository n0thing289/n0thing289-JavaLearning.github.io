public class VarScope{
	public static void main(String[] args){
		Hsp h = new Hsp();
		h.f1();
		h.f2();
	}
}

class Hsp{
	int age =10;
	String name = "jack";
	int weight;
	{
		int n = 6;
		System.out.println(n);
	}
	public void f1(){
		String f1_name = "f1";
		// int w;
		System.out.println("��f1������ʹ������name= " + name);
		System.out.println("��f1������ʹ������weight= " + weight);
		// System.out.println("��f1������ʹ��f1�ı���w= " + w);
	}

	public void f2(){
		System.out.println("��f2������ʹ������name=" + name);
		// System.out.println("��f2������ʹ��f1����f1_name=" + f1_name);
	}
}