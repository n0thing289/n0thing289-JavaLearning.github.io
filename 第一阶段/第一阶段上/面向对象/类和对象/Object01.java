public class Object01 {
	public static void main(String[] args){
		//1.new Cat() 创建一个猫对象; 把创建的猫赋给 cat
		
		Cat cat = new Cat();
		//4.怎么给对象的属性赋值s
		cat.name = "xiaobai";
		cat.age = 3;
		cat.color = "white";
		cat.weight = 10;

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 20;

		//3.怎么访问对象的属性呢？
		System.out.println("the first cat is " + cat.name + "， hes age is " + cat.age + "， hes color is " + cat.color + " weight:" + cat.weight);
		System.out.println("the secend cat is " + cat2.name + "， hes age is " + cat2.age + "， hes color is " + cat2.color + " weight:" + cat2.weight);
	}
}

class Cat {
	//2.定义属性
	String name;
	int age;
	String color;
	double weight;//不会外部定义，自动添加

}