public class ArrayCopy {

	public static void main(String[] args) {
		 int[] arr1 = {10,20,30};

		 //用第二种创建数组的方式
		 int[] arr2 = new int[arr1.length];//开辟了内存空间但是默认值为0

		 //遍历复制给啊让人
		 for(int i = 0;i<arr1.length;i++){
		 	arr2[i] = arr1[i];

		 }

		 arr2[0] = 100;
		 // 输出两个数组
		 System.out.println("===arr1===");
		 for(int j = 0;j<arr1.length;j++){
		 	System.out.println(arr1[j]);

		 }

		 System.out.println("===arr2===");
		 for(int k = 0;k<arr1.length;k++){
		 	System.out.println(arr2[k]);

		 }

	}
}