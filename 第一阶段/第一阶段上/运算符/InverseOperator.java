public class InverseOperator {

	public static void main(String[] args) {

		System.out.println(50 > 10);
		System.out.println(!(50 > 10));

		//a^b �߼���򣬵�a��b��ͬʱ�����Ϊtrue������Ϊfalse
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println(b);
	}
}