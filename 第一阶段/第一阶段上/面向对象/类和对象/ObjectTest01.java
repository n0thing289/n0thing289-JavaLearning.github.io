public class ObjectTest01 {
	public static void main(String[] args){
		Person a = new Person();
		a.age = 10;
		a.name = "小明";
		Person b;
		b = a;
		System.out.println(b.name);
		b.age = 200;
		b = null;
		/*
		当你b指向空时，就不再会指向0x1011类（数据空间）下的任何属性了
		 */
		System.out.println(a.age);
		System.out.println(b.age);//所以这里会报错
	}
}

class Person {
	int age;
	String name;
}