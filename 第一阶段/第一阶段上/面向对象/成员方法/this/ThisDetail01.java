public class ThisDetail01 {
	public static void main(String[] args){
		T t1 = new T();
		t1.f2();
		t1.f3();
	}
}


class T{
	String name;
	int age;
	//2.this�ڹ������У�������һ��������
	public T(){
		this("jack",100);
		System.out.println("T()������");
		//����ȥ���ʵڶ���������
		// this("jack",100);//�����һ��Сϸ�ڣ���������Ǳ�����ڹ������еĵ�һ�����

	}

	public T(String name, int age){
		System.out.println("T(String name, int age)������");
	}

	public void f3(){
		String name = "f3()�е�name";
		System.out.println("name=" + name + "\tage=" + age);
		System.out.println("name=" + this.name + "\tage=" + this.age);
		

	}
	public void f1(){
		System.out.println("f1()����������");
	}


	public void f2(){
		System.out.println("f2()����������");
		
		//1.���ñ����еķ���
		//��һ��ֱ�ӵ���
		f1();
		//�ڶ��ַ�ʽ����this����
		this.f1();//���ֵ��õ�����Ҫ�����̳�ʱ�Ž�

	}


}