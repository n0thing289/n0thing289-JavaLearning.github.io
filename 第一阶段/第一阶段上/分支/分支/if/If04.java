public class If04 {

	public static void main(String[] args) {
		boolean b = true;
		if (b == false) {//如果改为b = false 结果是什么呢？
			System.out.println("a");
		}
		else if (b) {
			System.out.println("b");
		}
		else if (!b) {
			System.out.println("c");
		}
		else {
			System.out.println("d");
		}
	}
}