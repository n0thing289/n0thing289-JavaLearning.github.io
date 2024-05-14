public class OverLoad01{
	public static void main(String[] args){
		MyCalculator mc = new MyCalculator();
		mc.calculate(1,2);
	}
}


class MyCalculator{
	//怎么匹配？
	//先匹配两个参数的
	//再匹配参数列表中的顺序和类型
	public int calculate(int n1, int n2){
		System.out.println("public int calculate(int n1, int n2)被调用");
		return n1 + n2;
	}


	//看看是否构成重载----不构成--因为返回类型不是构成重载的充分条件
	// public void calculate(int n1, int n2){
	// 	return n1 + n2;
	// }


	//看看是否构成重载----不构成--因为形参不是构成重载的充分条件
	// public int calculate(int a1, int a2){
	// 	return a1 + a2;
	// }


	public double calculate(int n1, double n2){
		System.out.println("public double calculate(int n1, double n2)被调用");
		return n1 + n2;
	}


	public double calculate(double n2, int n1){
		System.out.println("public double calculate(double n2, int n1)被调用");
		return n2 + n1;
	}

	
	public int calculate(int n1, int n2, int n3){
		System.out.println("public int calculate(int n1, int n2, int n3)被调用");
		return n1 + n2 + n3;
	}
}