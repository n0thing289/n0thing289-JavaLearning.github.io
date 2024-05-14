public class InverseOperator {

	public static void main(String[] args) {

		System.out.println(50 > 10);
		System.out.println(!(50 > 10));

		//a^b 逻辑异或，当a和b不同时，结果为true，否则为false
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println(b);
	}
}