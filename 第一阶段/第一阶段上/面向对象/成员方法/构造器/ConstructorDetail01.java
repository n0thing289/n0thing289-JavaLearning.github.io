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
	����㲻д�������Ļ���ʵ���ϣ�java���Լ���һ��Ĭ���޲ι�����
	��javap������鿴����
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