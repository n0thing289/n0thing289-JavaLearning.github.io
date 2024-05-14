public class ConstructorExercise{
	public static void main(String[] args){
		Person p1 = new Person("jack",19);
		System.out.println(p1.age);
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

	Person(){
		age = 18;
	}
}