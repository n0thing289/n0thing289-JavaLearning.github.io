import java.util.Scanner;
public class Array02 {

	public static void main(String[] args) {
		//创建一个double数组 大小为5
		//第一种动态分配方式
		//double[] scores = new double[5];
		//第二种动态分配方式
		double scores[];
		scores = new double[5];
		Scanner my_scanner = new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			System.out.println("请输入第"+(i+1)+"个元素的值=");
			//给索引值为i，添加元素
			//
			scores[i] = my_scanner.nextDouble();
		}
		
		System.out.println("==数组的元素/值的情况如下");
		for(int i=0;i<scores.length;i++){
			System.out.println("scores:" + scores[i]);
		}
	}
}