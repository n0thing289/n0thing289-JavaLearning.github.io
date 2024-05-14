public class ArithmeticOperatorExercise01 {

	public static void main(String[] args) {
		//面试题1
		// int i = 1;
		// i = i++;//规则：（1）使用临时变量temp=i 然后i=i+1 最后i=temp
		// System.out.println(i);//2 答案是1

		// //面试题2
		// int i = 1;
		// i = ++i;//与上面12步相反
		// System.out.println(i);//2 答案是2
		// System.out.println("");

		//++ --
	
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.println("i= " + i);//10
		System.out.println("i2 " + i2);//20

		i = --i2;
		System.out.println("i= " + i);//19
		System.out.println("i2= " + i2);//19
		
	
	}
}