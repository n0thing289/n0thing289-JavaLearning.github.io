public class TestPerson {
	public static void main(String[] args){
		Person p1 = new Person("小",18);
		Person p2 = new Person("小x",18);

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

	//方法思路
	//1.确立返回类型
	//2.确立方法名
	//3.确立形参列表
	public boolean compareTo(Person p){
		// if(p.age == this.age && p.name == this.name){
		// 	return true;
		// }
		// else{
		// 	return false;
		// }

		//String是引用类型
		//
		return p.age == this.age && this.name.equals(p.name);
	}

}
