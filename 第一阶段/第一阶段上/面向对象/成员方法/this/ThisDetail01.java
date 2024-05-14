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
	//2.this在构造器中，调用另一个构造器
	public T(){
		this("jack",100);
		System.out.println("T()构造器");
		//这里去访问第二个构造器
		// this("jack",100);//额外的一个小细节，这条语句是必须放在构造器中的第一条语句

	}

	public T(String name, int age){
		System.out.println("T(String name, int age)构造器");
	}

	public void f3(){
		String name = "f3()中的name";
		System.out.println("name=" + name + "\tage=" + age);
		System.out.println("name=" + this.name + "\tage=" + this.age);
		

	}
	public void f1(){
		System.out.println("f1()方法被调用");
	}


	public void f2(){
		System.out.println("f2()方法被调用");
		
		//1.调用本类中的方法
		//第一种直接调用
		f1();
		//第二种方式，用this调用
		this.f1();//两种调用的区别，要讲到继承时才讲

	}


}