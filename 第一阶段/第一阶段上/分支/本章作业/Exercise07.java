public class Exercise07 {

	public static void main(String[] args) {
		//思路分析
		//先拿到a、A的码值
		//定义两个变量用于记录初始码值
		//在循环中，这两个变量不断自增，并且输出
		char char_a = 'a';
		char char_A = 'Z';
		//System.out.println((int)(char_a));
		int int_a = (int)(char_a);//97 + 26 = 123
		//System.out.println((int)(char_A));
		int int_A = (int)(char_A);//65 + 26 = 91
		while(int_a < 123 && int_A >= 65){

			System.out.println("小写：" + (char)(int_a) +
				"  大写：" + (char)(int_A));
			int_a++;
			int_A--;
		}


		//老师的做法
		//for(char c1 = 'a';c1<'z';c1++){
		//    System.out.print(c1)
		//}
		//for(char c1 = 'Z';c1 >= 'A';c1--){
		//    System.out.print(c1)
		//}
	}

}