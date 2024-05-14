public class DoWhileExercise{

	public static void main(String[] args) {
		System.out.println("第一题:");
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while (i<=100);


		System.out.println("\n第二题");
		int i2 = 1;
		int receive = 0;
		do {
			receive += i2;
			
			System.out.println(receive);
			i2++;
		}while (i2<=100);


		System.out.println("\n第三题");
		//思路分析
		//1.定义一个不断自增的变量，用来被5和被3整除
		//2.如果有一次循环中，判断通过，则把另一个用于统计的变量+1
		int q = 1;
		int flag = 0;
		do {
			if (q % 5.0 == 0 && q % 3.0 != 0){
				flag += 1;
				System.out.println(q);
			}
			q++;
		}while (q<=200);
		System.out.println(flag);
	}
}