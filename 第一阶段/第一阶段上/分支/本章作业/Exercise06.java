public class Exercise06 {

	public static void main(String[] args) {
		//思路分析
		//定义一个变量，用for循环不断加一，
		//某一次判断模5。0后是否等于零
		//定义一个整数用于记录有几个是被整除的，如果满了5个，则输出在一行
		int beiwuzhengchushu = 0;
		for(int i = 1;i<=100;i++){

			if(i % 5.0 != 0){
				beiwuzhengchushu++;
				System.out.print(i + " 不能被五整除 ");
				if(beiwuzhengchushu % 5 == 0){
					System.out.println("\t\t");
				}
			}
		}
	}
}