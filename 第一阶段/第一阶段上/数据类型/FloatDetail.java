public class FloatDetail {
	public static void main(String[] args) {
		// float 4个字节
		// double 8个字节

		// java 浮点型常量默认为double型，声明float型常量，需要后面加 f 或者 F
		// float num1 = 1.1  // 对不对？ 错
		float num2 = 1.1f;  // 对
		double num3 = 1.1;  // 对
		double num4 = 1.1f;  // 对，小转大是可以的

		//十进制数形式
		double num5 =  .123;  // 等价0.123

		//科学计数法形式
		System.out.println(5.12e2);
		System.out.println(5.12e-2);

		//精度对比
		double num9 = 2.1234567891;
		float num10 = 2.1234567891f;
		System.out.println(num9);
		System.out.println(num10);

		//计算机在运算小数时，不知道小数点后面还有多少数字，导致最终以精度的方式输出
		double num11 = 2.7;
		double num12 = 8.1 / 3;//计算机以为8.1 = 8.10000000000,因为8.1本身是近似值，计算机不清楚这个1后面还有什么
		System.out.println(num11);//2.7
		System.out.println(num12);//接近2.7的一个小数，而不是2.7
		//得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时 要小心
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		if (num11 == num12) {
			System.out.println("相等");

		}
        //正确的写法
        if (Math.abs(num11 - num12) < 0.0000000001) {
        	System.out.println("差值非常小，已经达到我所规定的精度内了，认为相等");
        }
        // 可以通过 java API 来看 下一个视频讲
        System.out.println(Math.abs(num11 - num12));

        //细节：结果是直接赋值得到的小数是可以判断相等的，而不是通过计算后得到的小数


	}
}