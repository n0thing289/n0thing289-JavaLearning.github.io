public class MethodParameter03 {
	public static void main(String[] args){

		//
		Person p = new Person();
		B b = new B();
		
		p.age = 10;
		p.name = "jack";

		b.test200(p);
		System.out.println("p.age = " + p.age );
	}
}


class Person{
	int age;
	String name;
}


class B{
	public void test200(Person p){
		//思考 p = null,main输出什么？
		// 因为test200内的p是先定义，
		// 然后存了外部p的地址，然后将内部p指空
		// 而外部p任然存了之前的地址，这没有发生变化，只是内部的p指空了而已
		// 1.方法的形参是局部变量，是定义在某某方法的栈中
		// 2.传递的虽然是地址，但是你要牢记是形参p存了外部p的地址，即使内部指空，也是内部p无法使用，影响不了外部p
		
		// p = null;
		//思考 p = new Person()这三行，main会输出什么？
		//原理和上面是差不多的，内部的p原先指向外部p的数据空间
		//然后new之后指向了新的一个数据空间
		//任然不影响外部
		p = new Person();
		p.age = 20;
		p.name = "joey";

		
	}
}