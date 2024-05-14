public class Exercise09 {

	public static void main(String[] args) {
		//思路分析
		//每一个第二项都是前面的累加加上当前的次序来实现的
		//定义一个变量进行累加
		//再定义一个变量用于给累加的变量相加
		int i = 0;
		int j = 0;
		int sum = 0;
		while(j<=99){
			while(true){
				++i;
				i += j;
				j++;
				break;
			}
			sum += i;
		}
		System.out.println(sum);//5050
	}
}