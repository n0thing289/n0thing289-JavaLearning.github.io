public class If04 {

	public static void main(String[] args) {
		boolean b = true;
		if (b == false) {//�����Ϊb = false �����ʲô�أ�
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