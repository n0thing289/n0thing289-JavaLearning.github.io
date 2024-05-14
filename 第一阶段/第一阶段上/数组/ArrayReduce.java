public class ArrayReduce {

	public static void main(String[] args) {
		//思路分析
		//1.定义原始数组
		//2.再定义一个比原始数组小的临时数组
		//3.拷贝给临时数组时，最后一个数组不取，也就是索引不到最后一个
		//4.将arr指向临时数组
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arrNew = new int[arr.length-1];
		for(int i = 0;i<arrNew.length;i++){
			arrNew[i] = arr[i];
		}
		arr = arrNew;

		System.out.println("=====缩减后的结果=====");
		for(int j = 0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
}