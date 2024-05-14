public class BitOperator {

	public static void main(String[] args) {

		//看老师的推导过程
		//1. 先得到 2的补码-》 2的源码 00000000 00000000 00000000 00000010
		//    2的补码00000000 00000000 00000000 00000010
		//2. 得到 3的源码-》 3的源码 00000000 00000000 00000000 00000011
		//    3的补码 00000000 00000000 00000000 00000011
		//3. 按位& 00000000 00000000 00000000 00000010 & 运算后的补码
		//    由于第一个符号位是0，也就是正数，即三码和一，结果的源码也是00000000 00000000 00000000 00000010
		//结果就是2
		System.out.println(2&3);
		System.out.println(~-2);
		//1. 先得到-2的源码 10000000 00000000 00000000 00000010
		//2. 得到-2的补码--就要先得到他的反码，
		//		-2反码 11111111 11111111 11111111 11111101
		//		-2补码 11111111 11111111 11111111 11111110
		//      取反操作 00000000 00000000 00000000 00000001 运算的补码
		//      由于符号位是0即正数，三位和一，原码是1
		System.out.println(~2);

		System.out.println(2|3);
		//
		System.out.println(2^3);


		//Exercise
		System.out.println("下面是练习:");

		System.out.println(2|3);//my anwser is 3
		System.out.println(2^3);//my anwser is 1
		System.out.println(~2);//my anwser is -3
		System.out.println(2&3);//my anwser is 2
		System.out.println(2|3);//my anwser is 3
		System.out.println(~-5);//my anwser is 4
		System.out.println(13&7);//my anwser is 5
		System.out.println(5|4);//my anwser is 5
		System.out.println(-3^3);//my anwser is -3. False 减一那一步错了，应是-2
		//反码的反码就是负数的原码

		

	}
}