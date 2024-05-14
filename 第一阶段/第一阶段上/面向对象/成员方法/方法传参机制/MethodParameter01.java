public class MethodParameter01 {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		AA aa = new AA();
		aa.swap(a, b);
		System.out.println("main中 a = " + a + " b = " + b);//a=10.b=20
	}
}


class AA{
	public void swap(int a,int b){
		System.out.println("swap之前 a = " + a + " b = " + b);//a=10.b=20
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap之后 a = " + a + " b = " + b);//a=20,b=10
	}
}

/*
	总的来说，
	1.传参（调用方法，数组交换，赋值的时候）的到底什么东西传了进入
	你要看，要传给它的数据类型是什么
	基本数据类型在赋值的时候，是直接给值，也叫值传递也叫值拷贝
	引用数据类型在赋值的时候，是给地址的，也叫地址传递也叫地址拷贝

	2.每调用一个方法，主线程就会跑过去执行，并且开辟一个某某方法栈，
	主线程在栈中运行完后，就会被销毁

	3.引用数据类型的变量中存的是地址，其指向堆中的某个数据空间

	4.如果一个数据空间（数组，某个类对象）就会被销毁
 */