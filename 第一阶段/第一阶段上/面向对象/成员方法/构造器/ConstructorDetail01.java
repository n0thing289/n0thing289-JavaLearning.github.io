public class ConstructorDetail01{
	public static void main(String[] args){
		Person2 p1 = new Person2("jack",20);
		Person2 p2 = new Person2("smith");
		Dog d1 = new Dog();

	}
}


class Person2{
	String name;
	int age;
	public Person2(String pname, int page){
		name = pname;
		age = page;

	}

	public Person2(String pname){
		name = pname;
	}
}

//===============================================
class Dog{
	String name;
	//javap -c -v
	/*
	如果你不写构造器的话，实际上，java会自己有一个默认无参构造器
	用javap反编译查看试下
	class Dog{
		Dog(); 
	}
	 */
	
	Dog(){
	}

	public Dog(String dname){
		name = dname;
	}
}