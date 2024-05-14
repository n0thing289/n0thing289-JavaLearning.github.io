public class StringToBasicDetail {
	public static void main(String[] args) {

		String str = "123";//若改成"hello"时。编译时没问题，但是运行时会有问题
		//
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
	}
}