public class LogicOperator01 {

	public static void main(String[] args) {
		//&& 和&案例演示
		int age = 50;
		if(age > 20 && age < 90) { //90改30
			System.out.println("ok100");
		}
		//&演示
		if(age > 20 & age < 90) { //90改40
			System.out.println("ok100");
		}

		//区别
		int a = 4;
		int b = 9;
		//对于&&短路与而言，前面为假，后面的条件则不再判断
		//对于&逻辑与而言，前面为假，后面的条件仍然判断

		if(a < 1 && ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println(" a= " + a + " b= " + b);

		if(a < 1 & ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("");
		System.out.println(" a= " + a + " b= " + b);
	}
}