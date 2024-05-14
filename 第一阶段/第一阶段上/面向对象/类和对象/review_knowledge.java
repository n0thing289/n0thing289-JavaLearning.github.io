public class review_knowledge {
	public static void main(String[] args){
		//2.创建一个猫对象
		// Cat cat1 = new Cat();

		// //3.在外界添加属性
		// cat1.age = 1;
		// cat1.weight = 10;
		// cat1.color = "black";
		// cat1.voice = "bad";
		// //4.在外界打印
		// System.out.println("这只猫的年龄为 "+cat1.age+  " 体重为 " + cat1.weight+" 颜色为 "+cat1.color);
		// System.out.println(cat1.voice);

		//============================================
		//形参列表传入年龄，体重，颜色，声音
		//1.创建并添加属性
		Cat cat2 = new Cat(2,15.6,"pink","good");
		//2.打印第二支猫
		System.out.println("这只猫的年龄为 "+cat2.age+  " 体重为 " + cat2.weight+" 颜色为 "+cat2.color);
		System.out.println(cat2.voice);

		//调用方法
		cat2.study();
		double money = cat2.stole_money("朱治城",10000.999);
		System.out.println("猫猫真的偷到了"+money+"这么多钱");
	}
}


class Cat {
	//1.定义一个猫类，属性有年龄，体重，颜色
	int age;
	double weight;
	String color;
	//内部就给它定义好和赋值
	String voice;

	//每次创建都要在外部给每一只猫赋值一条一条添加属性太麻烦，有没有更简单的方式
	//通过这个程序，如果你用了构造方法，则所有创建类对象的时候，要依据形参列表传入参数
	Cat(int age,double weight,String color,String voice) {//有void，会报错，没有把参数传给构造器的错
		this.age = age;
		this.weight = weight;
		this.color = color;
		this.voice = voice;
	}

	public void study(){
		System.out.println("猫猫通过学习，学会了偷钱技能");
	}
	public double stole_money(String person, double money){
		System.out.println("猫猫今天看上了叫 " + person + " 这个人身上的" + money + "这么多钱");
		System.out.println("偷钱成功！！");
		return money;
	}
}