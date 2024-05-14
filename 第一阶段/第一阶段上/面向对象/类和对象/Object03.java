public class Object03 {
	public static void main(String[] args){
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "ะกร๗";

		Person p2 = p1;
		System.out.println(p2.age + p2.name);
	}
}

class Person{
	int age;
	String name;
}