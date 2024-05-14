public class PropertiesDetail {
	public static void main(String[] args){
		//船舰Person对象
		//p1是对象名
		//new Person() 创建的对象空间（数组）才是真正的对象
		//
		//1.对象的属性默认值,遵守数组的规则 
		Person p1 = new Person();


		System.out.println("\n当前这个人的信息");
		System.out.println("age=" + p1.age +
			"\nname=" + p1.name +
			"\nsal=" + p1.sal +
			"\nisPass=" + p1.isPass);

	}
}


class Person {
	int age;
	String name;
	double sal;
	boolean isPass;
}