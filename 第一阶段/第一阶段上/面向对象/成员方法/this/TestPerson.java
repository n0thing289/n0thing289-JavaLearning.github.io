public class TestPerson {
	public static void main(String[] args){
		Person p1 = new Person("С",18);
		Person p2 = new Person("Сx",18);

		System.out.println(p1.compareTo(p2));
	}
}


class Person{
	String name;
	int age;
	public Person(){
		
	}


	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	//����˼·
	//1.ȷ����������
	//2.ȷ��������
	//3.ȷ���β��б�
	public boolean compareTo(Person p){
		// if(p.age == this.age && p.name == this.name){
		// 	return true;
		// }
		// else{
		// 	return false;
		// }

		//String����������
		//
		return p.age == this.age && this.name.equals(p.name);
	}

}
