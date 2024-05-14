public class Exercise08 {

	public static void main(String[] args) {
		//思路分析
		//1.分析这个式子可以看出这是某个数列的前n项和
		//2.通项公式为 n(-1)**(n-1)
		//3.定义一个变量n用于自增
		double sum = 0.0;
		for(int n = 1;n<=100;n++){
			double an = (Math.pow((-1), (n-1))) * n;//n*(-1)**(n-1);
			System.out.println(1 / an);
			sum += 1 / an;
			System.out.println("\t sum=" + sum);

		}
		System.out.println("结果：" +sum);
	}
}