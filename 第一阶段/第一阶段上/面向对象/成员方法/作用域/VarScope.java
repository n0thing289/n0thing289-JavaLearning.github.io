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
		System.out.println("在f1方法中使用属性name= " + name);
		System.out.println("在f1方法中使用属性weight= " + weight);
		// System.out.println("在f1方法中使用f1的变量w= " + w);
	}

	public void f2(){
		System.out.println("在f2方法中使用属性name=" + name);
		// System.out.println("在f2方法中使用f1变量f1_name=" + f1_name);
	}
}