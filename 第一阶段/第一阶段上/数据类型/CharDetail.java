public class CharDetail {
	public static void main(String[] args) {
		
		//在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		//要输出某个字符对应的unicode数字，可以用（int）强制把char类型转换数字类型
		char c1 = 97;
		System.out.println(c1);//a

		char c2 = 'a';//输出 a 字符所对应的数字
		System.out.println((int)c2);

		char c3 = '韩';
		System.out.println((int)c3);//38889

		char c4 = 38889;
		System.out.println(c4);//韩


		//char类型是可以进行运算，相当于一个整数，因为这些整数都有对应的unicode码值
		System.out.println('a' + 10);//107
		//也就是说，当你声明char时输入数字，解释器会根据数字找到对应的编码字符进行输出
		//  运算时，会先把'a'转换对应的码值进行运算，根据最后的运算结果（码值）找到对应的编码字符进行输出

		//小测试
		char c5 = 'b' + 1;//99->c
		System.out.println((int)c5);//99
		System.out.println(c5);//c
		//以上四行可以理解为，运算时会将''的东西转成码值进行运算得到最终的码值（整数）
		//此时如果声明char型变量将最终的码值存起来 输出这个变量时，则会输出码值对应的字符

			
		
			
		


			
		
	}
}