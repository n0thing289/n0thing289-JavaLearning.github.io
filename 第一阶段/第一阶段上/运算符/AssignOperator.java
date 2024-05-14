public class AssignOperator {
	public static void main(String[] args) {

		int n1 = 10;
		n1 += 4;
		System.out.println(n1);

		n1 /= 4;
		System.out.println(n1);

		//复合赋值运算符 += 会进行变为与左边同类型的类型强制转换
		byte b = 3;//用常量值给byte变量赋值时，先判断可以表示的数字范围，（-127到 127）
		b += 2;// （底层进行了类型转换）等价与 b = (byte)(b + 2)
		b++;// b = (byte)(b + 1)
		//解释，b是byte类型，而2是int类型，b = b+2应该是不能把一个int赋给一个byte的（int是高精度，byte是低精度，除非底层发生了强制转换）
		
	}
}