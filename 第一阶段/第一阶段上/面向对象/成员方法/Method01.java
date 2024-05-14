public class Method01{
	public static void main(String[] args){
		//方法使用
		//1. 方法写好后，如果不去调用，不会输出
		//2. 先创建对象，如何调用方法即可
		Person p1 = new Person();
		p1.speak(); //调用方法
		p1.cal01();
		p1.cal02(2); //调用并且传参


		//调用getSum方法，并且把10给num1，20给num2
		//把方法 getSum 返回的值赋给 变量returnRes
		int returnRes = p1.getSum(10,20); 
		System.out.println("getSum-returnRes= " + returnRes);
	}
}


class Person{
	String name;
	int age;
//===========================================================
	//方法（成员方法）
	//1.添加speak成员方法，输出我是一个好人
	//
	//1. public 表示方法是公开
	//2. void 表示方法没有返回值
	//2. speak（）  speak是方法名，（）是形参列表
	//4. {}  方法体，可以写我们要执行的代码
	//5.
	public void speak() {
		System.out.println("我是一个好人");
	}
//===========================================================
	//2. 计算1-100
	public void cal01() {
		
		int sum = 0;
		for(int i = 1;i<=1000;i++){
			sum += i;
		}

		System.out.println("cal01-sum= " + sum);
	}
//===========================================================
	//添加cal02（）
	//该方法可以接受一个数n，计算从1累加到n
	//(int n) 形参列表，表示有一个形参n，可以接受用户输入
	public void cal02(int n){
		 
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum += i;
		}

		System.out.println("cal02-sum= " + sum);
	}
//===========================================================
	//添加getSum成员方法，可以计算两个数的和
	//1.public 表示方法公开
	//2. int 表示方法执行后，返回一个int值
	//3. getSum方法名
	//4. (int num1, int num2) 形参列表，可以接收用户传入的两个数
	//5. return res; 表示把res的值，返回
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;

	}
}