//演示| ||使用
public class LogicOperator02 {

	public static void main(String[] args) {
		//|| 和|案例演示
		//规则：两个条件只要一个为真，短路或就真
		//规则：两个条件只要一个为真，逻辑或也是真
		int age = 50;
		if(age > 20 && age < 30) { 
			System.out.println("ok100");
		}
		// | 演示
		if(age > 20 & age < 30) { 
			System.out.println("ok100");
		}

		//看看区别
		//短路或，第一个为真，则第二个条件不会判断，结果为true，
		//逻辑或全要判断一回
		int a = 4;
		int b = 9;

		if(a > 1 || ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println(" a= " + a + " b= " + b);//a4 b9

		if(a > 1 | ++b < 50) {
			System.out.println("ok300");
		}
		System.out.println("");
		System.out.println(" a= " + a + " b= " + b);//a4 b10
	}

}