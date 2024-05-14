public class This01 {
	public static void main(String[] args){
		Dog dog1 = new Dog("joey",12);
		System.out.println("dog1,hashcode=" + dog1.hashCode());
		dog1.info();

		
	}
}


class Dog{
	String name;
	int age;

	public Dog(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("this,hashcode=" + this.hashCode());
	}

	public void info(){

		System.out.println(name + "\t" + age);
		System.out.println("info(),hashcode=" + this.hashCode());

	}
}


// class Cat{
// 	String name;
// 	int age;
// 	public Cat(String name, int age){
// 		this.name = name;
// 		this.age = age;
// 	}

// 	public void info2(){
// 		System.out.println("cat:" + this.name + "\t" + this.age);
// 	}
// }