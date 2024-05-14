public class WhileExercise {

	public static void main(String[] args) {
		//定义一个变量用来取模3，如果结果等于0就用另一个变量接着
		//不断让第一个变量自增，直到他到100
		// 化繁为简，先死后活
		System.out.println("第一题-练习");
		
		int i = 1;
		double zhengshu = 0;
		while (i <= 100) {
			double receive = i % 3;//int receive = i % 3.0;
			if (receive == 0) {
				zhengshu = i;
				System.out.println(zhengshu);
			}
			i++;
		}


		//定义一个不断自增的变量，
		//用一个标志变量去判断是否为偶数
		//最终再用一个变量来接收
		System.out.println("\n");
		System.out.println("\n" + "第二题-课后练习");
		int a = 40;
		double oushu = 0;
		while (a <= 200) {
			double flag = a % 2;
			if (flag == 0) {
				oushu = a;
				System.out.println(oushu);
			}
			a++;
		}
	}
}