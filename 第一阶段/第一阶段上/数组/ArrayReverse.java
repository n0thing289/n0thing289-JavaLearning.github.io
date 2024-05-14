public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66};
		//用老韩的思路来反转
		for(int i = 0;i<arr.length/2;i++){
			int var1 = arr[i];

			arr[i] = arr[arr.length - (i+1)];

			arr[arr.length-(i+1)] = var1;
		}

		for(int j =0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
		
	}
}