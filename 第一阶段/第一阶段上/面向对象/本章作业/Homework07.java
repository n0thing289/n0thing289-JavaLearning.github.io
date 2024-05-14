public class Homework07{
	public static void main(String[] args){
		Dog dog1 = new Dog("jack", "pink", 2);
		Dog dog2 = new Dog("ross", "red", 3);
		dog1.show();
		dog2.show();
	}
}


class Dog{
	String name;
	String color;
	int age;
	public Dog(){}
	public Dog(String name,String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(){
		System.out.println("the dog name:" + this.name + 
			"\ncolor:" + this.color + 
			"\nage:" + this.age);
	}
}