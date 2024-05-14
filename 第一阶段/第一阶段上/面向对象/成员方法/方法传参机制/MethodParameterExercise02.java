public class MethodParameterExercise02{
	public static void main(String[] args){
		// System.out.println("");
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "jack";

		Mytools myools = new Mytools();
		Person p2 = myools.copyPerson(p1);
		System.out.println("p2.age=" + p2.age + "  p2.name=" + p2.name);
	}
}


class Person{
	int age;
	String name;
}


class Mytools{
	public Person copyPerson(Person p){
		
		Person person = new Person();
		person.age = p.age;
		person.name = p.name;
		return person;

	}
}