public class Constructor01{
	public static void main(String[] args){
		Person p1 = new Person("joey",20);
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);
	}
}


class Person{
	String name;
	int age;
	public Person(String pname, int page){
		System.out.println("Constructor was run!");
		name = pname;
		age = page;
	}
}