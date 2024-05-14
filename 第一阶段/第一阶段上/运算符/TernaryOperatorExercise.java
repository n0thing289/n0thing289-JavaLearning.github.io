public class TernaryOperatorExercise {
	public static void main(String[] args) {
		//
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;

		//思路
		//1.
		//2.
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大数:"+ max2);

		//用一条语句实现
		//后面可以用更好的方法，比如排序
		int max = (n1 > n2 ? n1 : n2;) > n3 ? (n1 > n2 ? n1 : n2;) : n3;//太乱
	}
}